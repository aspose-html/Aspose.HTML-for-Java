package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_SaveDocuments_SaveHTMLToFile {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_SaveDocuments_SaveHTMLToFile
        // Prepare an output path for a document
        String documentPath = "save-with-linked-file.html";

        // Prepare a simple HTML file with a linked document
        java.nio.file.Files.write(java.nio.file.Paths.get(documentPath), "<p>Hello World!</p><a href='linked.html'>linked file</a>".getBytes());
        // Prepare a simple linked HTML file
        java.nio.file.Files.write(java.nio.file.Paths.get("linked.html"), "<p>Hello linked file!</p>".getBytes());

        // Load the "save-with-linked-file.html" into memory
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(documentPath);

        // Create a save options instance
        com.aspose.html.saving.HTMLSaveOptions options = new com.aspose.html.saving.HTMLSaveOptions();

        // The following line with value '0' cuts off all other linked HTML-files while saving this instance
        // If you remove this line or change value to the '1', the 'linked.html' file will be saved as well to the output folder
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Save the document with the save options
        document.save("save-with-linked-file_out.html", options);
        // END_SNIPPET
    }
}
