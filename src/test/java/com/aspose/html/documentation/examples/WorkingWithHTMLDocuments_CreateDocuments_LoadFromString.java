package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromString {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromString
        // Prepare HTML code
        String html_code = "<p>Hello World!</p>";

        // Initialize a document from the string variable
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(html_code, ".");

        // Save the document to a disk
        document.save("create-from-string.html");
        // END_SNIPPET
    }
}
