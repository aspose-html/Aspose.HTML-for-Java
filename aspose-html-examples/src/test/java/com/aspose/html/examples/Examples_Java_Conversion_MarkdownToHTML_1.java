package com.aspose.html.examples;

public class Examples_Java_Conversion_MarkdownToHTML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Convert markdown to HTML
        com.aspose.html.converters.Converter.convertMarkdown(
                dataDir + "Markdown.md",
                dataDir + "MarkdownToHTML.html"
        );
    }
}