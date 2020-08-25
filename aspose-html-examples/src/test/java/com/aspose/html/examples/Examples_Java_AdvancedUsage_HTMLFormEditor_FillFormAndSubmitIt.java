package com.aspose.html.examples;

public class Examples_Java_AdvancedUsage_HTMLFormEditor_FillFormAndSubmitIt {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Initialize an instance of HTML document from 'https://httpbin.org/forms/post' url
        var document = new com.aspose.html.HTMLDocument("https://httpbin.org/forms/post");
        try {
            // Create an instance of Form Editor
            var editor = com.aspose.html.forms.FormEditor.create(document, 0);
            try {
                // You can fill the data up using direct access to the input elements, like this:
                editor.get_Item("custname").setValue("John Doe");

                document.save(dataDir + "out.html");

                // or this:
                var comments = editor.getElement(com.aspose.html.forms.TextAreaElement.class, "comments");
                comments.setValue("MORE CHEESE PLEASE!");

                // or even by performing a bulk operation, like this one:
                java.util.Map<String, String> map = new java.util.HashMap<>();
                map.put("custemail", "john.doe@gmail.com");
                map.put("custtel", "+1202-555-0290");
                var dictionary = new com.aspose.html.forms.collection.MapDictionary(
                        map,
                        com.aspose.html.forms.collection.enumeration.CaseComparer.ORDINALIGNORECASE
                );
                editor.fill(dictionary);

                // Create an instance of form submitter
                var submitter = new com.aspose.html.forms.FormSubmitter(editor);
                try {
                    // Submit the form data to the remote server.
                    // If you need you can specify user-credentials and timeout for the request, etc.
                    var result = submitter.submit();

                    // Check the status of the result object
                    if (result.isSuccess()) {
                        // Check whether the result is in json format
                        if (result.getResponseMessage().getHeaders().getContentType().getMediaType().equals("application/json")) {
                            // Dump result data to the console
                            System.out.println(result.getContent().readAsString());
                        } else {
                            // Load the result data as an HTML document
                            var resultDocument = result.loadDocument();
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
    }
}