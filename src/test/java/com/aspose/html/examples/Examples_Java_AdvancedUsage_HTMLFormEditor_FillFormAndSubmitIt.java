package com.aspose.html.examples;

public class Examples_Java_AdvancedUsage_HTMLFormEditor_FillFormAndSubmitIt {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        //@START
        // Initialize an instance of HTML document from 'https://httpbin.org/forms/post' url
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("https://httpbin.org/forms/post");
        try {
            // Create an instance of Form Editor
            com.aspose.html.forms.FormEditor editor = com.aspose.html.forms.FormEditor.create(document, 0);
            try {
                // You can fill the data up using direct access to the input elements, like this:
                editor.get_Item("custname").setValue("John Doe");

                document.save(Resources.output("out.html"));

                // or this:
                com.aspose.html.forms.TextAreaElement comments = editor.getElement(com.aspose.html.forms.TextAreaElement.class, "comments");
                comments.setValue("MORE CHEESE PLEASE!");

                // or even by performing a bulk operation, like this one:
                java.util.Map<String, String> map = new java.util.HashMap<>();
                map.put("custemail", "john.doe@gmail.com");
                map.put("custtel", "+1202-555-0290");
                editor.fill(map);

                // Create an instance of form submitter
                com.aspose.html.forms.FormSubmitter submitter = new com.aspose.html.forms.FormSubmitter(editor);
                try {
                    // Submit the form data to the remote server.
                    // If you need you can specify user-credentials and timeout for the request, etc.
                    com.aspose.html.forms.SubmissionResult result = submitter.submit();

                    // Check the status of the result object
                    if (result.isSuccess()) {
                        // Check whether the result is in json format
                        if (result.getResponseMessage().getHeaders().getContentType().getMediaType().equals("application/json")) {
                            // Dump result data to the console
                            System.out.println(result.getContent().readAsString());
                        } else {
                            // Load the result data as an HTML document
                            com.aspose.html.dom.Document resultDocument = result.loadDocument();
                            try {
                                // Inspect HTML document here.
                                System.out.println(resultDocument.getDocumentElement().getTextContent());
                            } finally {
                                if (resultDocument != null) {
                                    resultDocument.dispose();
                                }
                            }
                        }

                    }
                } finally {
                    if (submitter != null) {
                        submitter.dispose();
                    }
                }
            } finally {
                if (editor != null) {
                    editor.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        //@END
    }
}
