package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyPdfSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPDF_SpecifyPdfSaveOptions
        // Prepare SVG code and save it to a file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Set A5 as a page-size and change the background color to green
        PdfSaveOptions options = new PdfSaveOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page();
        anyPage.setSize(new Size(Length.fromInches(8.3f), Length.fromInches(5.8f)));
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);
        options.setBackgroundColor(Color.getGreen());

        // Convert SVG to PDF
        Converter.convertSVG($o("document.svg"), options, $o("output.pdf"));
        // @END_SNIPPET
    }
}
