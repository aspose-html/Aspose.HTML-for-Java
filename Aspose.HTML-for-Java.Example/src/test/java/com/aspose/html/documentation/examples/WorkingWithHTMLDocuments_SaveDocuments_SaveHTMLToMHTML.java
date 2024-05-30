package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_SaveDocuments_SaveHTMLToMHTML {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_SaveDocuments_SaveHTMLToMHTML
        // Prepare an output path for a document saving
        String documentPath = "save-to-MTHML.mht";

        // Prepare a simple HTML file with a linked document
        java.nio.file.Files.write(java.nio.file.Paths.get("document.html"), "<p>Hello World!</p><a href='linked-file.html'>linked file</a>".getBytes());
        // Prepare a simple linked HTML file
        java.nio.file.Files.write(java.nio.file.Paths.get("linked-file.html"), "<p>Hello linked file!</p>".getBytes());

        // Load the "document.html" into memory
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("document.html");

        // Save the document to MHTML format
        document.save(documentPath, com.aspose.html.saving.HTMLSaveFormat.MHTML);
        // END_SNIPPET
    }
}
