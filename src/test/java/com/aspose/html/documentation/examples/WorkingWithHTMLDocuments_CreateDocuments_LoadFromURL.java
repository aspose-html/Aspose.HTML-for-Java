package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromURL {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromURL
        // Load a document from 'https://docs.aspose.com/html/net/creating-a-document/document.html' web page
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("https://docs.aspose.com/html/net/creating-a-document/document.html");

        System.out.println(document.getDocumentElement().getOuterHTML());
        // END_SNIPPET
    }
}
