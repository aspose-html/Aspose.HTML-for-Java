package com.aspose.html.doc.examples.parts.Advanced_Programming;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;
import com.aspose.html.dom.Document;
import com.aspose.html.forms.*;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLFormEditor {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void example() throws java.io.IOException {
        // @START_SNIPPET Advanced_HTMLFormEditor
        // Initialize an instance of HTML document from "https://httpbin.org/forms/post" url
        HTMLDocument document = new HTMLDocument("https://httpbin.org/forms/post");

        // Create an instance of FormEditor
        FormEditor editor = FormEditor.create(document, 0);

        // You can fill in the data using direct access to the input elements, like this:
        InputElement custname = editor.addInput("custname");
        custname.setValue("John Doe");

        document.save($o("out.html"));

        // or this:
        TextAreaElement comments = editor.getElement(TextAreaElement.class, "comments");
        comments.setValue("MORE CHEESE PLEASE!");

        // or even by performing a bulk operation, like this one:
        java.util.Map<String, String> dictionary = new java.util.HashMap<>();
        dictionary.put("custemail", "john.doe@gmail.com");
        dictionary.put("custtel", "+1202-555-0290");

        // Create an instance of FormSubmitter
        FormSubmitter submitter = new FormSubmitter(editor);

        // Submit the form data to the remote server
        // If you need, you can specify user credentials and timeout for the request, etc.
        SubmissionResult result = submitter.submit();

        // Check the status of the result object
        if (result.isSuccess()) {
            // Check whether the result is in json format
            if (result.getResponseMessage().getHeaders().getContentType().getMediaType().equals("application/json")) {
                // Print result data to console
                System.out.println(result.getContent().readAsString());
            } else {
                // Load the result data as an HTML document
                Document doc = result.loadDocument();
                // Inspect HTML document here
            }
        }
        // @END_SNIPPET
    }
}
