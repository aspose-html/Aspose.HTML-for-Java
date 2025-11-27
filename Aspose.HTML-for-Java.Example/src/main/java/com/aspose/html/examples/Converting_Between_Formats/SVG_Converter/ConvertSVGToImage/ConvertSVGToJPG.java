package com.aspose.html.examples.Converting_Between_Formats.SVG_Converter.ConvertSVGToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertSVGToJPG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertSvgToJpg.java
        // Convert SVG to JPG using Java
        // Learn more: https://docs.aspose.com/html/java/convert-svg-to-jpg/

        // Prepare SVG code and save it to a file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.svg"))) {
            fileWriter.write(code);
        }

        // Initialize an SVG document from the SVG file
        SVGDocument document = new SVGDocument($o("document.svg"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);

        // Convert SVG to JPG
        Converter.convertSVG(document, options, $o("output.jpg"));
        // @END_SNIPPET
    }
}