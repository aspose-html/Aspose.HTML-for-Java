package com.aspose.html.examples;

public class Examples_Java_Conversion_MHTMLtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Source MHTML document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Initialize pdfSaveOptions
            com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();
            options.setJpegQuality(100);
            // Output file path
            String outputFile = Resources.output("MHTMLtoPDF_Output.pdf");
            // Convert MHTML to PDF
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}