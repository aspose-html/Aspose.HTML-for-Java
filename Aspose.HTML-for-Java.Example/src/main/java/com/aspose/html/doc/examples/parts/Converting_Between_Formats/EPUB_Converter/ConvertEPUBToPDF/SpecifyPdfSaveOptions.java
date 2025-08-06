package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToPDF_SpecifyPdfSaveOptions
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Create an instance of PdfSaveOptions. Set up the page-size and change the background color to AliceBlue
        PdfSaveOptions options = new PdfSaveOptions();
        options.setBackgroundColor(Color.getAliceBlue());
        options.getPageSetup().setAnyPage(new Page());
        options.getPageSetup().getAnyPage().setSize(new Size(Length.fromPixels(1000), Length.fromPixels(1000)));

        // Call the convertEPUB() method to convert EPUB to PDF
        Converter.convertEPUB(fileInputStream, options, $o("input-options.pdf"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("input-options.pdf")));
    }
}