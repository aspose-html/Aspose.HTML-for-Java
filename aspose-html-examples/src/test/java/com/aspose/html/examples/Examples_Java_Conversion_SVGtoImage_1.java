package com.aspose.html.examples;

public class Examples_Java_Conversion_SVGtoImage_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Source SVG document
        com.aspose.html.dom.svg.SVGDocument svgDocument = new com.aspose.html.dom.svg.SVGDocument(Resources.input("input.svg"));
        // Initialize ImageSaveOptions
        com.aspose.html.saving.ImageSaveOptions options = new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);
        // Output file path
        String outputFile = Resources.output("SVGtoImage_Output.jpeg");
        // Convert SVG to Image
        com.aspose.html.converters.Converter.convertSVG(svgDocument, options, outputFile);
    }
}