package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMarkdown;

import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class InlineHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertInlineHtmlElementsToMarkdown.java
        // Convert inline HTML elements to Markdown using Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-markdown/

        // Prepare HTML code and save it to a file
        String code = "text<div markdown='inline'><code>text</code></div>";
        FileHelper.writeAllText($o("inline.html"), code);

        // Call convertHTML() method to convert HTML to Markdown
        Converter.convertHTML($o("inline.html"), new MarkdownSaveOptions(), $o("inline-html.md"));

        // Output file will contain: text\r\n<div markdown="inline"><code>text</code></div>
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}