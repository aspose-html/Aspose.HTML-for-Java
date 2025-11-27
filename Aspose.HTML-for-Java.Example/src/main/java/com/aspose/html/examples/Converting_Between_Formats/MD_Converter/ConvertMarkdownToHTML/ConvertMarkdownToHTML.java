package com.aspose.html.examples.Converting_Between_Formats.MD_Converter.ConvertMarkdownToHTML;

import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertMarkdownToHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMarkdownToHtml.java
        // Convert Markdown to HTML in Java

        // Prepare a simple Markdown example
        String code = "### Hello, World! \n" +
                "[visit applications](https://products.aspose.app/html/family)";

        // Create a Markdown file
        FileHelper.writeAllText($o("document.md"), code);

        // Convert Markdown to HTML
        Converter.convertMarkdown($o("document.md"), $o("document-output.html"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
