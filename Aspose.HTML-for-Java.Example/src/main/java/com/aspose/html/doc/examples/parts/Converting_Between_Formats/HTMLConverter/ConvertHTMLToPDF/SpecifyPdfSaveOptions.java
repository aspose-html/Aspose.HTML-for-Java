package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.*;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToPDF_SpecifyPdfSaveOptions
        // Initialize an HTML document from a file
        HTMLDocument document = new HTMLDocument($i("drawing.html"));

        // Initialize PdfSaveOptions. Set up the page-size 500x300 pixels, margins,
        // resolutions and change the background color to AliceBlue
        PdfSaveOptions options = new PdfSaveOptions();
        options.setHorizontalResolution(new Resolution(200, UnitType.AUTO));
        options.setVerticalResolution(new Resolution(200, UnitType.AUTO));
        ;
        options.setBackgroundColor(Color.getAliceBlue());
        options.setJpegQuality(100);
        options.getPageSetup().setAnyPage(new Page(new Size(500, 300), new Margin(20, 10, 10, 10)));

        // Convert HTML to PDF
        Converter.convertHTML(document, options, $o("drawing-options.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
