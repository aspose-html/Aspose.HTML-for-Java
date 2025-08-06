package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class LoadFromString {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_LoadFromString
        // Prepare HTML code
        String html_code = "<p>Hello, World!</p>";

        // Initialize a document from a string variable
        HTMLDocument document = new HTMLDocument(html_code, ".");

        // Save the document to disk
        document.save($o("create-from-string.html"));
        // @END_SNIPPET
    }
}
