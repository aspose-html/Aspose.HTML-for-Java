package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class LoadFromFile {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_LoadFromFile
        // Prepare the "load-from-file.html" file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("load-from-file.html"))) {
            fileWriter.write("Hello, World!");
        }

        // Load HTML from the file
        HTMLDocument document = new HTMLDocument($o("load-from-file.html"));

        // Write the document content to the output stream
        System.out.println(document.getDocumentElement().getOuterHTML());
        // @END_SNIPPET
    }
}
