package com.aspose.html.examples.java;

public class Examples_Java_Conversion_SVGtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source SVG document
        var svgDocument = new com.aspose.html.dom.svg.SVGDocument(dataDir + "input.svg");
        // Initialize pdfSaveOptions
        var options = new com.aspose.html.saving.PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        var outputFile = dataDir + "SVGtoPDF_Output.pdf";
        // Convert SVG to PDF
        com.aspose.html.converters.Converter.convertSVG(svgDocument, options, outputFile);
    }
}