package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class MarkdownToHTML_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET MarkdownToHTML_1
        // Convert markdown to HTML
        Converter.convertMarkdown($i("input.md"), $o("Markdown-to-HTML.out.html"));
        // @END_SNIPPET
    }
}
