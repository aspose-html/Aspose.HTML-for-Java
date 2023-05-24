package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_EmptyHTML {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_EmptyHTML
        // Initialize an empty HTML Document.
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Save the document to disk.
            document.save("create-empty-document.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        // END_SNIPPET
    }
}
