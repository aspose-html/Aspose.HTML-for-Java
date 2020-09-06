package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare a 'document.html' file.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write("Hello World!");
        }

        // Load from a 'document.html' file.
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("document.html"));
        // Write the document content to the output stream.
        System.out.println(document.getDocumentElement().getOuterHTML());
    }
}