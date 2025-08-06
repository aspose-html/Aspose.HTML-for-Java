package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertSVGDocumentToXPS {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToXPS_ConvertSVGDocumentToXPS
        // Prepare SVG code and save it to a file
        String code =
                "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                        "<circle cx ='100' cy ='100' r ='60' fill='none' stroke='red' stroke-width='10' />\n" +
                        "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the svg file
        SVGDocument document = new SVGDocument($o("document.svg"));

        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        // Convert SVG to XPS
        Converter.convertSVG(document, options, $o("output.xps"));
        // @END_SNIPPET
    }
}