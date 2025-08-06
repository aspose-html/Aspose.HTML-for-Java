package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;

public class HTMLDocumentFromURL {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void execute() throws Exception {
        // Load a document from 'https://html.spec.whatwg.org/multipage/introduction.html' web page
        HTMLDocument document = new HTMLDocument("https://www.facebook.com/");

        // Write the document content to the output stream
        System.out.println(document.getDocumentElement().getOuterHTML());
    }
}