package com.aspose.html.examples.java;

public class Examples_Java_WebScraping_WebScraping_NodeFilterUsageExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Prepare an HTML code
        var code = """
                    < p > Hello </p >
                    <img src = 'image1.png' >
                    <img src = 'image2.png' >
                    <p > World ! </p >
                """;

        // Initialize a document based on the prepared code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // To start HTML navigation we need to create an instance of TreeWalker.
            // The specified parameters mean that it starts walking from the root of the document, iterating all nodes and use our custom implementation of the filter
            var iterator = document.createTreeWalker(document, com.aspose.html.dom.traversal.filters.NodeFilter.SHOW_ALL, new OnlyImageFilter());
            // Use
            while (iterator.nextNode() != null) {
                // Since we are using our own filter, the current node will always be an instance of the HTMLImageElement.
                // So, we don't need the additional validations here.
                var image = (com.aspose.html.HTMLImageElement) iterator.getCurrentNode();

                System.out.println(image.getSrc());
                // output: image1.png
                // output: image2.png
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}