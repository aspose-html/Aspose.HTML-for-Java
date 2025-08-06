package com.aspose.html.doc.examples.parts.AdvancedUsage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;
import com.aspose.html.dom.Document;
import com.aspose.html.forms.FormEditor;
import com.aspose.html.forms.FormSubmitter;
import com.aspose.html.forms.SubmissionResult;
import com.aspose.html.forms.TextAreaElement;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLFormEditor_FillFormAndSubmitIt {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void execute() throws Exception {
        // @START_SNIPPET HTMLFormEditor_FillFormAndSubmitIt
        // Initialize an instance of HTML document from 'https://httpbin.org/forms/post' url
        HTMLDocument document = new HTMLDocument("https://httpbin.org/forms/post");

        // Create an instance of Form Editor
        FormEditor editor = FormEditor.create(document, 0);

        // You can fill the data up using direct access to the input elements, like this:
        editor.get_Item("custname").setValue("John Doe");

        document.save($o("out.html"));

        // or this:
        TextAreaElement comments = editor.getElement(TextAreaElement.class, "comments");
        comments.setValue("MORE CHEESE PLEASE!");

        // or even by performing a bulk operation, like this one:
        java.util.Map<String, String> map = new java.util.HashMap<>();
        map.put("custemail", "john.doe@gmail.com");
        map.put("custtel", "+1202-555-0290");
        editor.fill(map);

        // Create an instance of form submitter
        FormSubmitter submitter = new FormSubmitter(editor);

        // Submit the form data to the remote server.
        // If you need you can specify user-credentials and timeout for the request, etc.
        SubmissionResult result = submitter.submit();

        // Check the status of the result object
        if (result.isSuccess()) {
            // Check whether the result is in json format
            if (result.getResponseMessage().getHeaders().getContentType().getMediaType().equals("application/json")) {
                // Dump result data to the console
                System.out.println(result.getContent().readAsString());
            } else {
                // Load the result data as an HTML document
                Document resultDocument = result.loadDocument();

                // Inspect HTML document here.
                System.out.println(resultDocument.getDocumentElement().getTextContent());
            }

        }
        //@END_SNIPPET
    }
}
