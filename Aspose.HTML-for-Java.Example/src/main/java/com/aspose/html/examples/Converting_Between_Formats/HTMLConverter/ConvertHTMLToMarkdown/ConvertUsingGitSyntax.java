package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMarkdown;

import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertUsingGitSyntax {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToMarkdownUsingGitSyntax.java
        // Convert HTML to Markdown in Java using Git syntax
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-markdown/

        // Prepare HTML code and save it to a file
        String code = "<h1>Header 1</h1>" +
                "<h2>Header 2</h2>" +
                "<p>Hello, World!!</p>";
        FileHelper.writeAllText($o("document.html"), code);

        // Call convertHTML() method to convert HTML to Markdown
        Converter.convertHTML($o("document.html"), MarkdownSaveOptions.getGit(), $o("output-git.md"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}