package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToPDF_ConvertMHTMLFileToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("sample.mht"))) {
            // Create an instance of PdfSaveOptions.
            com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();

            // Call the ConvertMHTML method to convert the MHTML to PDF.
            com.aspose.html.converters.Converter.convertMHTML(
                    fileInputStream,
                    options,
                    Resources.output("output.pdf")
            );
        }
    }
}