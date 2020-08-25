package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_ConvertUsingGitSyntax {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = """
                <h1>Header 1</h1>
                <h2>Header 2</h2>
                <p>Hello World!!</p>
                """;
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Call ConvertHTML method to convert HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                com.aspose.html.saving.MarkdownSaveOptions.getGit(),
                dataDir + "output.md"
        );
    }
}