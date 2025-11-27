package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMarkdown;

import com.aspose.html.converters.Converter;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertMarkdownFileToHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMarkdownFileToHtml.java
        // Convert Markdown to HTML using Java
        // Learn more: https://docs.aspose.com/html/java/convert-markdown-to-html/

        // Convert Markdown to HTML
        Converter.convertMarkdown($i("nature.md"), $o("nature-output.html"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}