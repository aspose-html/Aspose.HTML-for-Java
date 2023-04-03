package com.aspose.html.examples;

public class Examples_Java_Conversion_EPUBtoImage_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        //@START
        // Source EPUB document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("input.epub"))) {
            // Initialize ImageSaveOptions
            com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
            // Output file path
            String outputFile = Resources.output("EPUBtoImageOutput.jpeg");
            // Convert SVG to Image
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
        //@END
    }
}