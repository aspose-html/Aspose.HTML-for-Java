package com.aspose.html.examples;

public class Examples_Java_Conversion_SVGtoXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Source SVG document
        com.aspose.html.dom.svg.SVGDocument svgDocument = new com.aspose.html.dom.svg.SVGDocument(Resources.input("input.svg"));
        // Initialize XpsSaveOptions
        com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();

        options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());
        // Output file path
        String outputFile = Resources.output("SVGtoXPS_Output.xps");
        // Convert SVG to XPS
        com.aspose.html.converters.Converter.convertSVG(svgDocument, options, outputFile);
    }
}