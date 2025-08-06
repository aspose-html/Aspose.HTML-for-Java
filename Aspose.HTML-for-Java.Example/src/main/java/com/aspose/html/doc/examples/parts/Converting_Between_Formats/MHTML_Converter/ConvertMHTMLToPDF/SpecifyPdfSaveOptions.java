package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToPDF_SpecifyPdfSaveOptions
        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Create an instance of PdfSaveOptions. Set up the page-size and change the background color to AliceBlue
        PdfSaveOptions options = new PdfSaveOptions();
        options.setBackgroundColor(Color.getAliceBlue());
        options.getPageSetup().setAnyPage(new Page());
        options.getPageSetup().getAnyPage().setSize(new Size(Length.fromPixels(3000), Length.fromPixels(1000)));

        // Call the convertMHTML() method to convert MHTML to PDF
        Converter.convertMHTML(fileInputStream, options, "sample-options.pdf");
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
