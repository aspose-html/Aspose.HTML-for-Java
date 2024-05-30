package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_SVG {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_SVG
        // Initialize an SVG document from a string object
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", ".");

        // Write the document content to the output stream
        System.out.println(document.getDocumentElement().getOuterHTML());
        // END_SNIPPET
    }
}
