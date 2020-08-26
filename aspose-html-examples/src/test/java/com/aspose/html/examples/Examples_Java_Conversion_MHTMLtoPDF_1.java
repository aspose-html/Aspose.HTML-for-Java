package com.aspose.html.examples;

public class Examples_Java_Conversion_MHTMLtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Source MHTML document
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Initialize pdfSaveOptions
            com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();
            options.setJpegQuality(100);
            // Output file path
            String outputFile = dataDir + "MHTMLtoPDF_Output.pdf";
            // Convert MHTML to PDF
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}