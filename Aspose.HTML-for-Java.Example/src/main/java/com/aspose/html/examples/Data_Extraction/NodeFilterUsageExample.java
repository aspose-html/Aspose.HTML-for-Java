package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLImageElement;
import com.aspose.html.dom.traversal.ITreeWalker;
import com.aspose.html.dom.traversal.filters.NodeFilter;
import com.aspose.html.dom.Node;


public class NodeFilterUsageExample {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_TraverseHtmlDocumentUsingTreeWalker.java
        // Filter HTML elements using TreeWalker and custom NodeFilter in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/html-navigation/

        // Prepare HTML code
        String code = "    < p > Hello, </p >\n" +
                "    <img src = 'image1.png' >\n" +
                "    <img src = 'image2.png' >\n" +
                "    <p > World ! </p >\n";

        // Initialize a document based on the prepared code
        HTMLDocument document = new HTMLDocument(code, ".");

        // To start HTML navigation, we need to create an instance of TreeWalker
        // The specified parameters mean that it starts walking from the root of the document, iterating all nodes, and using our custom implementation of the filter
        ITreeWalker iterator = document.createTreeWalker(document, NodeFilter.SHOW_ALL, new NodeFilterUsageExample.OnlyImageFilter());
        // Use
        while (iterator.nextNode() != null) {
            // Since we are using our own filter, the current node will always be an instance of the HTMLImageElement
            // So, we don't need the additional validations here
            HTMLImageElement image = (HTMLImageElement) iterator.getCurrentNode();

            System.out.println(image.getSrc());
            // @output: image1.png
            // @output: image2.png
        }
        // @END_SNIPPET
    }

    // @START_SNIPPET Example_CustomNodeFilterForImageElements.java
    // Create custom NodeFilter to accept only image elements in Java
    // Learn more: https://docs.aspose.com/html/java/html-navigation/

    public static class OnlyImageFilter extends NodeFilter {
        @Override
        public short acceptNode(Node n) {
            // The current filter skips all elements, except IMG elements
            return "img".equals(n.getLocalName())
                    ? FILTER_ACCEPT
                    : FILTER_SKIP;
        }
    }
    // @END_SNIPPET OnlyImageFilter
}