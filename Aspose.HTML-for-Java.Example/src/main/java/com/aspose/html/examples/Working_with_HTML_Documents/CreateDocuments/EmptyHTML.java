package com.aspose.html.examples.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.examples.utils.Resources.$o;

public class EmptyHTML {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_CreateEmptyHtmlDocument.java
        // Create an empty HTML document using Java
        // Learn more: https://docs.aspose.com/html/java/create-a-document/

        // Initialize an empty HTML Document
        HTMLDocument document = new HTMLDocument();

        // Save the document to disk
        document.save($o("create-empty-document.html"));
        // @END_SNIPPET
    }
}