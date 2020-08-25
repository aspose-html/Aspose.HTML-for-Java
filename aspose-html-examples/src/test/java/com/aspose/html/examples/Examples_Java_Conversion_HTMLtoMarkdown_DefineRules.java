package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_DefineRules {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        var document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", dataDir);
        try {
            // Create MarkdownSaveOptions object
            var options = new com.aspose.html.saving.MarkdownSaveOptions();

            // Set the rules: only <a>, <img> and <p> elements will be converted to markdown.
            options.setFeatures(com.aspose.html.saving.MarkdownFeatures.Link | com.aspose.html.saving.MarkdownFeatures.Image | com.aspose.html.saving.MarkdownFeatures.AutomaticParagraph);
            document.save(dataDir + "Markdown.md", options);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}