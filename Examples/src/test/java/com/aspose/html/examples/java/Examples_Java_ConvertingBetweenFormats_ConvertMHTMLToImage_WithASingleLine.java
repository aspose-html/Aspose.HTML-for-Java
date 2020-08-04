package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToImage_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Open an existing MHTML file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Call the ConvertMHTML method to convert the MHTML file to image.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    new com.aspose.html.saving.ImageSaveOptions(
                            com.aspose.html.rendering.image.ImageFormat.Jpeg),
                    dataDir + "output.jpg"
            );
        }
    }
}