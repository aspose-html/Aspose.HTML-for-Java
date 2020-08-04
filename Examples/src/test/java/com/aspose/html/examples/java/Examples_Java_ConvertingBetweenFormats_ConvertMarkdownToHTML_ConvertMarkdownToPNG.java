package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertMarkdownToHTML_ConvertMarkdownToPNG {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare a simple Markdown example
        var code = """
                ### Hello World
                \r\n
                                
                [visit applications](https://products.aspose.app/html/family)
                """;
        // Create a Markdown file
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.md")) {
            fileWriter.write(code);
        }

        // Convert Markdown to HTML document
        var document = com.aspose.html.converters.Converter.convertMarkdown(dataDir + "document.md");
        try {
            // Convert HTML document to PNG image file format
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    new com.aspose.html.saving.ImageSaveOptions(
                            com.aspose.html.rendering.image.ImageFormat.Png
                    ),
                    dataDir + "output_md.png"
            );
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}