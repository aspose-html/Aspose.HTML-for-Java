package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.SavingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.HTMLSaveFormat;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLToMarkdown {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare an HTML code
        String html_code = "<H2>Hello World!</H2>";

        // Initialize document from the string variable
        HTMLDocument document = new HTMLDocument(html_code, ".");

        // Save the document as a Markdown file.
        document.save($o("document.md"), HTMLSaveFormat.Markdown);
    }
}
