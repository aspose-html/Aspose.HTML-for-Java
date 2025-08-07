package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.saving.MarkdownSaveOptions;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLtoMarkdown_HTMLtoMarkdown {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLtoMarkdown_HTMLtoMarkdown
        // Prepare HTML code and save it to a file
        String code = "<h1>Convert HTML to Markdown Using Java</h1>" +
                "<h2>How to Convert HTML to MD in Java</h2>" +
                "<p>The Aspose.HTML for Java library allows you to convert HTML to Markdown.</p>";
        FileHelper.writeAllText($o("conversion.html"), code);

        // Call ConvertHTML() method to convert HTML to Markdown
        Converter.convertHTML($o("conversion.html"), new MarkdownSaveOptions(), $o("conversion.md"));
        // @END_SNIPPET
        Assertions.assertTrue(FileHelper.exists($o("conversion.md")));
    }
}
