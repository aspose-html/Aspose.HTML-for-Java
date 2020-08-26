package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_InlineHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code and save it to the file.
        String code = "text<div markdown='inline'><code>text</code></div>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
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