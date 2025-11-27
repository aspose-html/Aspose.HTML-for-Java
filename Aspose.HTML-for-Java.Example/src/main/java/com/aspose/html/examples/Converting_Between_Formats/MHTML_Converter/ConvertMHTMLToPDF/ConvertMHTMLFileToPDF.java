package com.aspose.html.examples.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertMHTMLFileToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMHtmlToPdf.java
        // Convert MHTML to PDF using Java
        // Learn more: https://docs.aspose.com/html/java/convert-mhtml-to-pdf/

        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Create an instance of the PdfSaveOptions class
        PdfSaveOptions options = new PdfSaveOptions();

        // Call the convertMHTML() method to convert MHTML to PDF
        Converter.convertMHTML(fileInputStream, options, $o("sample-output.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}