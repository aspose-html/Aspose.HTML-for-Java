package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_MarkdownOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", dataDir);
        try {
            // Save to markdown by using default for the GIT formatting model
            document.save(dataDir + "Markdown.md", com.aspose.html.saving.MarkdownSaveOptions.getGit());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}