package com.aspose.html.examples.java;

public class Examples_Java_Conversion_MHTMLtoPDF_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Source MHTML document
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Initialize pdfSaveOptions
            var options = new com.aspose.html.saving.PdfSaveOptions();
            options.setJpegQuality(100);
            // Output file path
            var outputFile = dataDir + "MHTMLtoPDF_Output.pdf";
            // Convert MHTML to PDF
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    outputFile
            );
        }
    }
}