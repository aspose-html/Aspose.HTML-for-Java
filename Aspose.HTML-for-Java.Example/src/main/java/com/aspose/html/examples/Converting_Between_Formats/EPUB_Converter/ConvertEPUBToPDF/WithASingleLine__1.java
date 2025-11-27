package com.aspose.html.examples.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class WithASingleLine__1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertEpubToPdfInTwoLinesOfCode.java
        // Convert EPUB to PDF using Java
        // Learn more: https://docs.aspose.com/html/java/convert-epub-to-pdf/

        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Invoke the convertEPUB() method to convert EPUB to PDF
        Converter.convertEPUB(fileInputStream, new PdfSaveOptions(), $o("convert-by-two-lines.pdf"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("convert-by-two-lines.pdf")));
    }
}