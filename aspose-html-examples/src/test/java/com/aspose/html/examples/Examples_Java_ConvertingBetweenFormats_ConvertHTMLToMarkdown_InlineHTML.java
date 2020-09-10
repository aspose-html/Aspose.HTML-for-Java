package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToMarkdown_InlineHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code and save it to the file.
        String code = "text<div markdown='inline'><code>text</code></div>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Call ConvertHTML method to convert HTML to Markdown.
        com.aspose.html.converters.Converter.convertHTML(
                Resources.output("document.html"),
                new com.aspose.html.saving.MarkdownSaveOptions(),
                Resources.output("output.md")
        );
        // Output file will contain: text\r\n<div markdown="inline"><code>text</code></div>
    }
}
