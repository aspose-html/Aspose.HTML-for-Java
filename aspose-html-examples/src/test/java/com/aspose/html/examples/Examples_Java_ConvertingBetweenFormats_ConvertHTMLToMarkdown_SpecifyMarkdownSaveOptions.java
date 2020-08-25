package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_SpecifyMarkdownSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = """
                <h1>Header 1</h1>
                <h2>Header 2</h2>
                <p>Hello World!!</p>
                <a href='aspose.com'>aspose</a>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Create an instance of SaveOptions and set up the rule:
        // - only <a> and <p> elements will be converted to markdown.
        var options = new com.aspose.html.saving.MarkdownSaveOptions();
        options.setFeatures(
                com.aspose.html.saving.MarkdownFeatures.Link
                        |
                com.aspose.html.saving.MarkdownFeatures.AutomaticParagraph
        );

        // Call the ConvertHTML method to convert the HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                options,
                dataDir + "output.md"
        );
    }
}