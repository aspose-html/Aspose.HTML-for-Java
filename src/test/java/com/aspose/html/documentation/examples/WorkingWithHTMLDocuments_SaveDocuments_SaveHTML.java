package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_SaveDocuments_SaveHTML {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_SaveDocuments_SaveHTML
        // Prepare an output path for a document saving
        String documentPath = "save-to-file.html";

        // Initialize an empty HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Create a text node and add it to the document
        com.aspose.html.dom.Text text = document.createTextNode("Hello World!");
        document.getBody().appendChild(text);

        // Save the HTML document to the file on a disk
        document.save(documentPath);
        // END_SNIPPET
    }
}
