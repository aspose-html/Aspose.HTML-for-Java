package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SVGtoImage_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET SVGtoImage_1
        // Source SVG document
        SVGDocument svgDocument = new SVGDocument($i("input.svg"));
        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        // Output file path
        String outputFile = $o("SVGtoImage_Output.jpeg");
        // Convert SVG to Image
        Converter.convertSVG(svgDocument, options, outputFile);
        // @END_SNIPPET
    }
}