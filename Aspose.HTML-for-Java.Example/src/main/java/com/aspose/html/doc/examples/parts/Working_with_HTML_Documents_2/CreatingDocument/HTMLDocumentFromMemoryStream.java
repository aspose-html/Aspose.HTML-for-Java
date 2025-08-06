package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLDocumentFromMemoryStream {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Create a memory stream object
        java.io.InputStream inputStream =
                new java.io.ByteArrayInputStream(
                        "<p>Hello World!</p>".getBytes(java.nio.charset.StandardCharsets.UTF_8)
                );
        // Initialize document from the string variable
        HTMLDocument document = new HTMLDocument(inputStream, ".");

        // Save the document to disk.
        document.save($o("document.html"));
    }
}
