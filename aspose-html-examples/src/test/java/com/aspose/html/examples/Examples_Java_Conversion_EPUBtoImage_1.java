package com.aspose.html.examples;

public class Examples_Java_Conversion_EPUBtoImage_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Source EPUB document
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Initialize ImageSaveOptions
            var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
            // Output file path
            var outputFile = dataDir + "EPUBtoImageOutput.jpeg";
            // Convert SVG to Image
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}