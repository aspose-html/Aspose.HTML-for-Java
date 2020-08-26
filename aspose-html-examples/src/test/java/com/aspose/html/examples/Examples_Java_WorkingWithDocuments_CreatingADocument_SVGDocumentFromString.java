package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_SVGDocumentFromString {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Initialize the SVG Document from the string object
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", ".");
        try {
            // Write the document content to the output stream.
            System.out.println(document.getDocumentElement().getOuterHTML());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
