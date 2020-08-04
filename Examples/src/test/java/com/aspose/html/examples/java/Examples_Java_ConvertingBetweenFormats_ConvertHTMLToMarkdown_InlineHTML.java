package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_InlineHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = "text<div markdown='inline'><code>text</code></div>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Call ConvertHTML method to convert HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                dataDir + "document.html",
                new com.aspose.html.saving.MarkdownSaveOptions(),
                dataDir + "output.md"
        );
        // Output file will contain: text\r\n<div markdown="inline"><code>text</code></div>
    }
}