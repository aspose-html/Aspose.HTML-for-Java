package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertEPUBFileToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 60, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToPDF_ConvertEPUBFileToPDF
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Create an instance of the PdfSaveOptions class
        PdfSaveOptions options = new PdfSaveOptions();

        // Call the convertEPUB() method to convert EPUB to PDF
        Converter.convertEPUB(fileInputStream, options, $o("output-epub-to-pdf.pdf"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("output-epub-to-pdf.pdf")));
    }
}