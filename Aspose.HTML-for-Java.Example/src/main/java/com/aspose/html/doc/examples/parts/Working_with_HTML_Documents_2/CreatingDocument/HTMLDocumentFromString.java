package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.HTMLDocument;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLDocumentFromString {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare HTML code
        String html_code = "<p>Hello, World!</p>";

        // Initialize document from the string variable
        HTMLDocument document = new HTMLDocument(html_code, ".");

        // Save the document to disk.
        document.save($o("document.html"));
    }
}
