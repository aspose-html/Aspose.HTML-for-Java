package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromString {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var html_code = "<p>Hello World!</p>";

        // Initialize document from the string variable
        var document = new com.aspose.html.HTMLDocument(html_code, ".");
        try {
            // Save the document to disk.
            document.save(dataDir + "document.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}