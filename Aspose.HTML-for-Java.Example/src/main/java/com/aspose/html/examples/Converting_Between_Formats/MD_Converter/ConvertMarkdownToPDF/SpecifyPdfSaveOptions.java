package com.aspose.html.examples.Converting_Between_Formats.MD_Converter.ConvertMarkdownToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Resolution;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute()
            throws
            Exception {
        // @START_SNIPPET Example_ConvertMarkdownToPdfWithCustomSettings.java
        // Convert Markdown to PDF in Java with custom settings
        // Learn more: https://docs.aspose.com/html/java/convert-markdown-to-pdf/

        // Convert Markdown to HTML
        HTMLDocument document = Converter.convertMarkdown($i("nature.md"));

        // Initialize PdfSaveOptions. Set up the resolutions, JpegQuality and change the background color to AliceBlue
        PdfSaveOptions options = new PdfSaveOptions();
        options.setHorizontalResolution(Resolution.to_Resolution(200));
        options.setVerticalResolution(Resolution.to_Resolution(200));
        options.setBackgroundColor(Color.getAliceBlue());
        options.setJpegQuality(100);

        // Convert the HTML document to PDF file format
        Converter.convertHTML(document, options, $o("nature-output.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}