package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.SaveDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveFormat;

import java.io.IOException;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SaveHTMLToMHTML {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET SaveDocuments_SaveHTMLToMHTML
        // Prepare a simple HTML file with a linked document
        java.nio.file.Files.write(
                java.nio.file.Paths.get($o("document.html")),
                "<p>Hello, World!</p><a href='linked-file.html'>linked file</a>".getBytes());

        // Prepare a simple linked HTML file
        java.nio.file.Files.write(
                java.nio.file.Paths.get($o("linked-file.html")),
                "<p>Hello, linked file!</p>".getBytes());

        // Load the "document.html" into memory
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Save the document to MHTML format
        document.save($o("save-to-MTHML.mht"), HTMLSaveFormat.MHTML);
        // @END_SNIPPET
    }
}
