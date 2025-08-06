package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertSVGDocumentToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPDF_ConvertSVGDocumentToPDF
        // Prepare SVG code and save it to a file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the svg file
        SVGDocument document = new SVGDocument($o("document.svg"));

        // Initialize PdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();

        // Convert SVG to PDF
        Converter.convertSVG(document, options, $o("output.pdf"));
        // @END_SNIPPET
    }
}