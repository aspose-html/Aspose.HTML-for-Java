package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SVGtoPDF_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET SVGtoPDF_1
        // Source SVG document
        SVGDocument svgDocument = new SVGDocument($i("input.svg"));
        // Initialize pdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        String outputFile = $o("SVGtoPDF_Output.pdf");
        // Convert SVG to PDF
        Converter.convertSVG(svgDocument, options, outputFile);
        // @END_SNIPPET
    }
}