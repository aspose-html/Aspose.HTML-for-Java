package com.aspose.html.examples.java;

public class Examples_Java_Conversion_HtmlToPdf_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source HTML document
        var htmlDocument = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        // Initialize PdfSaveOptions
        var options = new com.aspose.html.saving.PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        var outputPDF = dataDir + "HTMLtoPDF_Output.pdf";
        // Convert HTML to PDF
        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, outputPDF);
    }
}