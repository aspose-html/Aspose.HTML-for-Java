package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromMemoryStream {
    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Create a memory stream object
        java.io.InputStream inputStream =
                new java.io.ByteArrayInputStream(
                        "<p>Hello World!</p>".getBytes(java.nio.charset.StandardCharsets.UTF_8)
                );
        // Initialize document from the string variable
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(inputStream, ".");
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