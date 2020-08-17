package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromURL {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Load a document from 'https://html.spec.whatwg.org/multipage/introduction.html' web page
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("https://www.facebook.com/");
        try {
            // Write the document content to the output stream.
            System.out.println(document.getDocumentElement().getOuterHTML());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}