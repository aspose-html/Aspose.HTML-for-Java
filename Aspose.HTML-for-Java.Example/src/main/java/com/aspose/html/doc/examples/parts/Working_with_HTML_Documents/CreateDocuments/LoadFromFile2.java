package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class LoadFromFile2 {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_LoadFromFile2
        // Initialize an HTML document from a file
        HTMLDocument document = new HTMLDocument($i("Sprite.html"));

        document.save($o("Sprite_out.html"));
        // @END_SNIPPET
    }
}
