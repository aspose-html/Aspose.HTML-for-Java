package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromStream {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromStream
        // Create a memory stream object
        String code = "<p>Hello World! I love HTML!</p>";
        java.io.InputStream is = new java.io.ByteArrayInputStream(code.getBytes());

        // Initialize a document from the stream variable
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(is, ".");

        // Save the document to a disk
        document.save("load-from-stream.html");
        // END_SNIPPET
    }
}
