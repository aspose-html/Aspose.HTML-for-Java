package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_SaveSVG {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_SaveSVG
        // Prepare an output path for an SVG document saving
        String documentPath = "save-to-SVG.svg";

        // Prepare SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg' height='200' width='300'>" +
            "<g fill='none' stroke-width= '10' stroke-dasharray='30 10'>" +
                "<path stroke='red' d='M 25 40 l 215 0' />" +
                "<path stroke='black' d='M 35 80 l 215 0' />" +
                "<path stroke='blue' d='M 45 120 l 215 0' />" +
            "</g>" +
        "</svg>";

        // Initialize an SVG instance from the content string
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument(code, ".");

        // Save the SVG file to a disk
        document.save(documentPath);
        // END_SNIPPET
    }
}
