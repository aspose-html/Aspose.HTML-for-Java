package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_SpecifyMarkdownSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code and save it to the file.
        String code = "<h1>Header 1</h1>\n" +
                      "<h2>Header 2</h2>\n" +
                      "<p>Hello World!!</p>\n" +
                      "<a href='aspose.com'>aspose</a>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of SaveOptions and set up the rule:
        // - only <a> and <p> elements will be converted to markdown.
        com.aspose.html.saving.MarkdownSaveOptions options = new com.aspose.html.saving.MarkdownSaveOptions();
        options.setFeatures(
                com.aspose.html.saving.MarkdownFeatures.Link
                |
                com.aspose.html.saving.MarkdownFeatures.AutomaticParagraph
        );

        // Call the ConvertHTML method to convert the HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                Resources.output("document.html"),
                options,
                Resources.output("output.md")
        );
    }
}
