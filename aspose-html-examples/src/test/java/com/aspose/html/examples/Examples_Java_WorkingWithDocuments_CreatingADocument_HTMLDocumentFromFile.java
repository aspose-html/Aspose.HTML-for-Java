package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare a 'document.html' file.
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write("Hello World!");
        }

        // Load from a 'document.html' file.
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        // Write the document content to the output stream.
        System.out.println(document.getDocumentElement().getOuterHTML());
    }
}