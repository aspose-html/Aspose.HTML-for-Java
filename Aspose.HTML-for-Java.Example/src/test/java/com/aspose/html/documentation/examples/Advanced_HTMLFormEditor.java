package com.aspose.html.documentation.examples;

public class Advanced_HTMLFormEditor {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET Advanced_HTMLFormEditor
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-.NET
        // Initialize an instance of HTML document from 'https://httpbin.org/forms/post' url
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("https://httpbin.org/forms/post");

        // Create an instance of Form Editor
        com.aspose.html.forms.FormEditor editor = com.aspose.html.forms.FormEditor.create(document, 0);

        // You can fill the data up using direct access to the input elements, like this:
        com.aspose.html.forms.InputElement custname = editor.addInput("custname");
        custname.setValue("John Doe");

        document.save("output/out.html");

        // or this:
        com.aspose.html.forms.TextAreaElement comments = editor.getElement(com.aspose.html.forms.TextAreaElement.class, "comments");
        comments.setValue("MORE CHEESE PLEASE!");

        // or even by performing a bulk operation, like this one:
        java.util.Map<String, String> dictionary = new java.util.HashMap<>();
        dictionary.put("custemail", "john.doe@gmail.com");
        dictionary.put("custtel", "+1202-555-0290");

        // Create an instance of form submitter
        com.aspose.html.forms.FormSubmitter submitter = new com.aspose.html.forms.FormSubmitter(editor);

        // Submit the form data to the remote server.
        // If you need you can specify user-credentials and timeout for the request, etc.
        com.aspose.html.forms.SubmissionResult result = submitter.submit();

        // Check the status of the result object
        if (result.isSuccess()) {
            // Check whether the result is in json format
            if (result.getResponseMessage().getHeaders().getContentType().getMediaType().equals("application/json")) {
                // Dump result data to the console
                System.out.println(result.getContent().readAsString());
            }
            else {
                // Load the result data as an HTML document
                com.aspose.html.dom.Document doc = result.loadDocument();
                // Inspect HTML document here.
            }
        }
        // END_SNIPPET
    }
}
