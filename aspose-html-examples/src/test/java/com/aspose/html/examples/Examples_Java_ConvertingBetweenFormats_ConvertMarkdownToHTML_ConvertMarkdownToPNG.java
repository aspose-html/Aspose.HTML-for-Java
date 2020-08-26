package com.aspose.html.examples;


public class Examples_Java_ConvertingBetweenFormats_ConvertMarkdownToHTML_ConvertMarkdownToPNG {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare a simple Markdown example
        String code = "### Hello World\n" +
                      "\r\n\n" +
                      "\n" +
                      "[visit applications](https://products.aspose.app/html/family)\n";
        // Create a Markdown file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter(dataDir + "document.md")) {
            fileWriter.write(code);
        }

        // Convert Markdown to HTML document
        com.aspose.html.HTMLDocument document = com.aspose.html.converters.Converter.convertMarkdown(dataDir + "document.md");
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