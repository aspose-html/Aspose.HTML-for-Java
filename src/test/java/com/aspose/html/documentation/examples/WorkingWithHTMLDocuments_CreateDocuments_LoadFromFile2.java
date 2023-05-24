package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile2 {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile2
        // Prepare a path to a file
        String documentPath = "Sprite.html";

        // Initialize an HTML document from a file
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(documentPath);

        document.save("Sprite_out.html");
        // END_SNIPPET
    }
}
