package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Resources;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLtoMarkdown_MarkdownOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLtoMarkdown_MarkdownOptions
        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", Resources.outputDirectory());

        // Save to markdown by using default for the GIT formatting model
        document.save($o("Markdown-with-options.out.md"), MarkdownSaveOptions.getGit());
        // @END_SNIPPET
    }
}
