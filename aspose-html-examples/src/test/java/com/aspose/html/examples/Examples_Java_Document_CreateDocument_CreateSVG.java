package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_CreateSVG {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        com.aspose.html.dom.svg.SVGDocument document =
                new com.aspose.html.dom.svg.SVGDocument(
                        "<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>",
                        "about:blank"
                );
        try {
            // do some actions over the document here...
        } finally {
            document.dispose();
        }
    }
}