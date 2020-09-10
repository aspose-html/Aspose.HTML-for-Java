package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_MarkdownOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", Resources.outputDirectory());
        try {
            // Save to markdown by using default for the GIT formatting model
            document.save(Resources.output("Markdown-with-options.out.md"), com.aspose.html.saving.MarkdownSaveOptions.getGit());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
