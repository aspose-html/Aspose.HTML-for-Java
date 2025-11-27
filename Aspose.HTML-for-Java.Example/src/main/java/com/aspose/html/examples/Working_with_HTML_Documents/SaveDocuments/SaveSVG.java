package com.aspose.html.examples.Working_with_HTML_Documents.SaveDocuments;

import com.aspose.html.dom.svg.SVGDocument;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class SaveSVG {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_SaveHtmlToSvg.java
        // Save HTML as SVG using Java
        // Learn more: https://docs.aspose.com/html/java/save-a-document/

        // Prepare SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg' height='200' width='300'>" +
                "<g fill='none' stroke-width= '10' stroke-dasharray='30 10'>" +
                "<path stroke='red' d='M 25 40 l 215 0' />" +
                "<path stroke='black' d='M 35 80 l 215 0' />" +
                "<path stroke='blue' d='M 45 120 l 215 0' />" +
                "</g>" +
                "</svg>";

        // Initialize an SVG instance from the content string
        SVGDocument document = new SVGDocument(code, ".");

        // Save the SVG file to disk
        document.save($o("save-to-SVG.svg"));
        // @END_SNIPPET
    }
}