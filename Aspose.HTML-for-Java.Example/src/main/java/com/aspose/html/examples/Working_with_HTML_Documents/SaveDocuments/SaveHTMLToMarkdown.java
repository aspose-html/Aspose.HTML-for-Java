package com.aspose.html.examples.Working_with_HTML_Documents.SaveDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveFormat;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class SaveHTMLToMarkdown {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_SaveHtmlToMarkdown.java
        // Save HTML as a Markdown file using Java
        // Learn more: https://docs.aspose.com/html/java/save-a-document/

        // Prepare HTML code
        String html_code = "<H2>Hello, World!</H2>";

        // Initialize a document from a string variable
        HTMLDocument document = new HTMLDocument(html_code, ".");

        // Save the document as a Markdown file
        document.save($o("save-to-MD.md"), HTMLSaveFormat.Markdown);
        // @END_SNIPPET
    }
}