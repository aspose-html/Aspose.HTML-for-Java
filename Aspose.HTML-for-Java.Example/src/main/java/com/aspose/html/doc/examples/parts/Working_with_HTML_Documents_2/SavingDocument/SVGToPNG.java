package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.SavingDocument;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SVGToPNG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute2() throws Exception {
        // @START_SNIPPET SavingADocument_SVGToPNG
        // Initialize an SVG document from the file
        SVGDocument document = new SVGDocument($i("gradient.svg"));

        // Initialize an instance of ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions();

        // Convert SVG to PNG
        Converter.convertSVG(document, options, $o("gradient-options.png"));
        // @END_SNIPPET
        // Save the SVG file to the disk
//        document.save($o("document.svg");
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET SavingADocument_SVGToFile
        // Initialize an SVG document from the file
        SVGDocument document = new SVGDocument($i("gradient.svg"));

        // Initialize an instance of ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions();

        // Convert SVG to PNG
        Converter.convertSVG(document, options, $o("gradient-options.png"));
        // @END_SNIPPET
        // Save the SVG file to the disk
//        document.save($o("document.svg");
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void test1() throws Exception {
        // @START_SNIPPET SavingADocument_SVGToFile_1
        // Prepare an SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg' height='80' width='300'>\n" +
                "        <g fill='none'>\n" +
                "            <path stroke='red' d='M5 20 l215 0' />\n" +
                "            <path stroke='black' d='M5 40 l215 0' />\n" +
                "            <path stroke='blue' d='M5 60 l215 0' />\n" +
                "        </g>\n" +
                "    </svg>\n";

        // Initialize a SVG instance from the content string
        SVGDocument document = new SVGDocument(code, ".");

        // Initialize an instance of ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Png);

        // Convert SVG to PNG
        Converter.convertSVG(document, options, $o("gradient-options.png"));
        // @END_SNIPPET
        // Save the SVG file to the disk
//        document.save($o("document.svg");
    }
}