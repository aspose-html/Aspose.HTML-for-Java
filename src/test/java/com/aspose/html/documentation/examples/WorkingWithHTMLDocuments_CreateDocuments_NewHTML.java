package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_NewHTML {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_NewHTML
        // Initialize an empty HTML Document.
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Prepare an output path for a document saving
        String documentPath = "create-new-document.html";

        try {
            // Create a text element and add it to the document
            com.aspose.html.dom.Text text = document.createTextNode("Hello World!");
            document.getBody().appendChild(text);

            // Save the document to a disk
            document.save(documentPath);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        // END_SNIPPET
    }
}
