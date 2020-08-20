package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromURL {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Load a document from 'https://html.spec.whatwg.org/multipage/introduction.html' web page
        var document = new com.aspose.html.HTMLDocument("https://www.facebook.com/");
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