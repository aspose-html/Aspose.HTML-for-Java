package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMarkdown;

import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.saving.MarkdownFeatures;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyMarkdownSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToMarkdownWithMarkdownSaveOptions.java
        // Convert selective HTML tags to Markdown using Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-markdown/

        // Prepare HTML code and save it to the file
        String code = "<h1>Header 1</h1>" +
                "<h2>Header 2</h2>" +
                "<p>Hello, World!!</p>" +
                "<a href='aspose.com'>aspose</a>";
        FileHelper.writeAllText($o("options.html"), code);

        // Create an instance of SaveOptions and set up the rule:
        // - only <a> and <p> elements will be converted to Markdown
        MarkdownSaveOptions options = new MarkdownSaveOptions();
        options.setFeatures(MarkdownFeatures.Link | MarkdownFeatures.AutomaticParagraph);

        // Call the convertHTML() method to convert HTML to Markdown
        Converter.convertHTML($o("options.html"), options, $o("options-output.md"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}