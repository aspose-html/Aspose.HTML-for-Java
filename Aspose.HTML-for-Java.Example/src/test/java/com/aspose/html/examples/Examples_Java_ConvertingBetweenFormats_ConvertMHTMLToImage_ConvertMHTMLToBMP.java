package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToImage_ConvertMHTMLToBMP {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Initialize ImageSaveOptions
            com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Bmp);

            // Call the ConvertMHTML method to convert the MHTML file to BMP.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    Resources.output("output.bmp")
            );
        }
    }
}