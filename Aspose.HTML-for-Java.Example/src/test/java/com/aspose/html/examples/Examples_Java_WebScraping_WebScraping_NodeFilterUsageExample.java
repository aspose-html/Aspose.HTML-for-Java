package com.aspose.html.examples;

public class Examples_Java_WebScraping_WebScraping_NodeFilterUsageExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Prepare an HTML code
        String code = "    < p > Hello </p >\n" +
                      "    <img src = 'image1.png' >\n" +
                      "    <img src = 'image2.png' >\n" +
                      "    <p > World ! </p >\n";

        // Initialize a document based on the prepared code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // To start HTML navigation we need to create an instance of TreeWalker.
            // The specified parameters mean that it starts walking from the root of the document, iterating all nodes and use our custom implementation of the filter
            com.aspose.html.dom.traversal.ITreeWalker iterator = document.createTreeWalker(document, com.aspose.html.dom.traversal.filters.NodeFilter.SHOW_ALL, new OnlyImageFilter());
            // Use
            while (iterator.nextNode() != null) {
                // Since we are using our own filter, the current node will always be an instance of the HTMLImageElement.
                // So, we don't need the additional validations here.
                com.aspose.html.HTMLImageElement image = (com.aspose.html.HTMLImageElement) iterator.getCurrentNode();

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
