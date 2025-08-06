package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLDocumentFromFile {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare a 'document.html' file.
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write("Hello, World!");
        }

        // Load from a 'document.html' file
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Write the document content to the output stream
        System.out.println(document.getDocumentElement().getOuterHTML());
    }
}
