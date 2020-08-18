package com.aspose.html.examples.java;

public class Examples_Java_Conversion_EPUBtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source EPUB document
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Initialize pdfSaveOptions
            var options = new com.aspose.html.saving.PdfSaveOptions();
            options.setJpegQuality(100);
            // Output file path
            var outputFile = dataDir + "EPUBtoPDF_Output.pdf";
            // Convert EPUB to PDF
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}
