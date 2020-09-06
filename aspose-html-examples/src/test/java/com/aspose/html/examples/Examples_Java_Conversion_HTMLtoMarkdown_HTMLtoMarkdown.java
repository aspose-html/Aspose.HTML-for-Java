package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_HTMLtoMarkdown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(
                "<p>my first paragraph</p>" +
                "<p>my second paragraph</p>",
                Resources.outputDirectory()
        );

        try {
            document.save(Resources.output("output.html.to.md"), com.aspose.html.saving.HTMLSaveFormat.Markdown);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}