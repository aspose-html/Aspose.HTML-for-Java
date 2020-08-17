package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToPDF_WithASingleLine {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Open an existing EPUB file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("input.epub"))) {
            // Call the ConvertEPUB method to convert the EPUB to PDF.
            com.aspose.html.converters.Converter.convertEPUB(
                    fileInputStream,
                    new com.aspose.html.saving.PdfSaveOptions(),
                    Resources.output("output.pdf")
            );
        }
    }
}
