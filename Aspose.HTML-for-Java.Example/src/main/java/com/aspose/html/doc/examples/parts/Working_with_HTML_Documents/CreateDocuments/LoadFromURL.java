package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;

public class LoadFromURL {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_LoadFromURL
        // Load a document from https://docs.aspose.com/html/net/creating-a-document/document.html web page
        HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/creating-a-document/document.html");

        System.out.println(document.getDocumentElement().getOuterHTML());
        // @END_SNIPPET
    }
}
