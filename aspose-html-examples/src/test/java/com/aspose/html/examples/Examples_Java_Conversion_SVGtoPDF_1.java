package com.aspose.html.examples;

public class Examples_Java_Conversion_SVGtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Source SVG document
        com.aspose.html.dom.svg.SVGDocument svgDocument = new com.aspose.html.dom.svg.SVGDocument(Resources.input("input.svg"));
        // Initialize pdfSaveOptions
        com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        String outputFile = Resources.output("SVGtoPDF_Output.pdf");
        // Convert SVG to PDF
        com.aspose.html.converters.Converter.convertSVG(svgDocument, options, outputFile);
    }
}