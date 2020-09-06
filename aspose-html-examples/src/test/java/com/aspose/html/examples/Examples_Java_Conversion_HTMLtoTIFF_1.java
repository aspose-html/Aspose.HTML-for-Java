package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoTIFF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Source HTML document
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(Resources.input("input.html"));
        // Initialize ImageSaveOptions
        com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Tiff);
        // Output file path
        String outputFile = Resources.output("HTMLtoPNG_Output.tif");
        // Convert HTML to TIFF
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputFile);
    }
}