package com.aspose.html.examples.java;

public class Examples_Java_Conversion_MHTMLtoImage_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source MHTML document
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Initialize ImageSaveOptions
            var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
            // Output file path
            var outputFile = dataDir + "MHTMLtoImage.jpeg";
            // Convert SVG to Image
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}