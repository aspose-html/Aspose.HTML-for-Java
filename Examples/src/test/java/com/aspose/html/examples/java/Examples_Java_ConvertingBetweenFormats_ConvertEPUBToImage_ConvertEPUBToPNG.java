package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToImage_ConvertEPUBToPNG {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Opens an existing EPUB file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Initialize ImageSaveOptions
            var options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Png);

            // Call the ConvertEPUB method to convert the EPUB file to PNG.
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    dataDir + "output.png"
            );
        }
    }
}