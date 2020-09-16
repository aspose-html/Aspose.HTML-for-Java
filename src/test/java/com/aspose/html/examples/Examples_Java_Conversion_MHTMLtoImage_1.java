package com.aspose.html.examples;

public class Examples_Java_Conversion_MHTMLtoImage_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Source MHTML document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Initialize ImageSaveOptions
            com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
            // Output file path
            String outputFile = Resources.output("MHTMLtoImage.jpeg");
            // Convert SVG to Image
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}