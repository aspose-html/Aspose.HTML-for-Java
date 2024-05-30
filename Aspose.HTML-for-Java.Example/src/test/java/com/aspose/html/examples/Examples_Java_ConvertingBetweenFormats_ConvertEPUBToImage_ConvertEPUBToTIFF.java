package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToImage_ConvertEPUBToTIFF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing EPUB file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("input.epub"))) {
            // Initialize ImageSaveOptions
            com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Tiff);

            // Call the ConvertEPUB method to convert the EPUB file to TIFF.
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    Resources.output("output.tiff")
            );
        }
    }
}
