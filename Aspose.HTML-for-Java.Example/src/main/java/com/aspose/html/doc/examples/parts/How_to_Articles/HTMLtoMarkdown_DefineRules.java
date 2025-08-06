package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Resources;
import com.aspose.html.saving.MarkdownFeatures;
import com.aspose.html.saving.MarkdownSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLtoMarkdown_DefineRules {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLtoMarkdown_DefineRules
        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", Resources.outputDirectory());

        // Create MarkdownSaveOptions object
        MarkdownSaveOptions options = new MarkdownSaveOptions();

        // Set the rules: only <a>, <img> and <p> elements will be converted to markdown.
        options.setFeatures(MarkdownFeatures.Link | MarkdownFeatures.Image | MarkdownFeatures.AutomaticParagraph);
        document.save($o("output.rules.html.to.md"), options);
        // @END_SNIPPET
    }
}