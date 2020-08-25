package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToPDF_ConvertMHTMLFileToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Open an existing MHTML file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of PdfSaveOptions.
            var options = new com.aspose.html.saving.PdfSaveOptions();

            // Call the ConvertMHTML method to convert the MHTML to PDF.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    dataDir + "output.pdf"
            );
        }
    }
}