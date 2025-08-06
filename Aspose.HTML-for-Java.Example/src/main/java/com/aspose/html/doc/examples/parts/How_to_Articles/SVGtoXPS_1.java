package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.drawing.Color;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SVGtoXPS_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET SVGtoXPS_1
        // Source SVG document
        SVGDocument svgDocument = new SVGDocument($i("input.svg"));
        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        options.setBackgroundColor(Color.getCyan());
        // Output file path
        String outputFile = $o("SVGtoXPS_Output.xps");
        // Convert SVG to XPS
        Converter.convertSVG(svgDocument, options, outputFile);
        // @END_SNIPPET
    }
}