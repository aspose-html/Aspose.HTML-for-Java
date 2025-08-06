package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMarkdown;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine__8 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToMarkdown_WithASingleLine
        // Prepare HTML code and save it to a file
        String code = "<h1>Header 1</h1>\n" +
                "<h2>Header 2</h2>\n" +
                "<p>Hello, World!!</p>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Call ConvertHTML method to convert HTML to Markdown.
        Converter.convertHTML($o("document.html"), new MarkdownSaveOptions(), $o("output.md"));
        // @END_SNIPPET
    }
}
