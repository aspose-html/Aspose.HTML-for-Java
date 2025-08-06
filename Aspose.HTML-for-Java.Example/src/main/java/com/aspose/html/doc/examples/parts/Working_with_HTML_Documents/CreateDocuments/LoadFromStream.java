package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class LoadFromStream {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_LoadFromStream
        // Create a memory stream object
        String code = "<p>Hello, World! I love HTML!</p>";
        java.io.InputStream inputStream = new java.io.ByteArrayInputStream(code.getBytes());

        // Initialize a document from the stream variable
        HTMLDocument document = new HTMLDocument(inputStream, ".");

        // Save the document to disk
        document.save($o("load-from-stream.html"));
        // @END_SNIPPET
    }
}
