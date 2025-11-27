package com.aspose.html.examples.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

public class LoadFromURL {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_LoadHtmlDocumentFromUrl.java
        // Load HTML from a URL using Java
        // Learn more: https://docs.aspose.com/html/java/create-a-document/

        // Load a document from https://docs.aspose.com/html/files/document.html web page
        HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/files/document.html");

        System.out.println(document.getDocumentElement().getOuterHTML());
        // @END_SNIPPET
    }
}