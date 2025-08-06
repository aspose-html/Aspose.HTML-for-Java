package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MD_Converter.ConvertMarkdownToHTML;

import com.aspose.html.converters.Converter;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine_18 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMarkdownToHTML_WithASingleLine
        // Prepare a simple Markdown example
        String code = "### Hello, World\n\n" +
                "[visit applications](https://products.aspose.app/html/family)\n";

        // Create a Markdown file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.md"))) {
            fileWriter.write(code);
        }

        // Convert Markdown to HTML
        Converter.convertMarkdown($o("document.md"), $o("document.html"));
        // @END_SNIPPET
    }
}
