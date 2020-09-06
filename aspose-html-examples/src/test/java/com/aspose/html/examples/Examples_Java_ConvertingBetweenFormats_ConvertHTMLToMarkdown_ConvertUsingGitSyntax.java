package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_ConvertUsingGitSyntax {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare an HTML code and save it to the file.
        String code = "<h1>Header 1</h1>\n" +
                      "<h2>Header 2</h2>\n" +
                      "<p>Hello World!!</p>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Call ConvertHTML method to convert HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                Resources.output("document.html"),
                com.aspose.html.saving.MarkdownSaveOptions.getGit(),
                Resources.output("output.md")
        );
    }
}