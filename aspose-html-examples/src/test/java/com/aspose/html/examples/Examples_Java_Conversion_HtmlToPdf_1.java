package com.aspose.html.examples;

public class Examples_Java_Conversion_HtmlToPdf_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Source HTML document
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(Resources.input("input.html"));
        // Initialize PdfSaveOptions
        com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        String outputPDF = Resources.output("HTMLtoPDF_Output.pdf");
        // Convert HTML to PDF
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputPDF);
    }
}