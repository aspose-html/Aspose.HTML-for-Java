package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine_15 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPDF_WithASingleLine
        // Prepare SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";

        // Call the convertSVG() method to convert SVG to PDF
        Converter.convertSVG(code, ".", new PdfSaveOptions(), $o("output.pdf"));
        // @END_SNIPPET
    }
}
