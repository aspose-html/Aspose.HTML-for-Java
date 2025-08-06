package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.dom.svg.SVGDocument;

public class SVGDocumentFromString {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // Initialize the SVG Document from the string object
        SVGDocument document = new SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", ".");

        // Write the document content to the output stream.
        System.out.println(document.getDocumentElement().getOuterHTML());
    }
}
