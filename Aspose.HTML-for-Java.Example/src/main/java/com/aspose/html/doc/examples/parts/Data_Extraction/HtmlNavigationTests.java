package com.aspose.html.doc.examples.parts.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.HTMLImageElement;
import com.aspose.html.collections.NodeList;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.Node;
import com.aspose.html.dom.traversal.ITreeWalker;
import com.aspose.html.dom.traversal.filters.NodeFilter;
import com.aspose.html.dom.xpath.IXPathResult;
import com.aspose.html.dom.xpath.XPathResultType;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class HtmlNavigationTests {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Navigate Through HTML")
    public final void navigateThroughHTMLTest() {
        // @START_SNIPPET NavigateThroughHTML
        // Prepare HTML code
        String html_code = "<span>Hello,</span> <span>World!</span>";

        // Initialize a document from the prepared code
        final HTMLDocument document = new HTMLDocument(html_code, ".");
        // Get the reference to the first child (first <span>) of the <body>
        Node element = document.getBody().getFirstChild();
        System.out.println(element.getTextContent());
        // @output: Hello,

        // Get the reference to the whitespace between html elements
        element = element.getNextSibling();
        System.out.println(element.getTextContent());
        // @output: ' '

        // Get the reference to the second <span> element
        element = element.getNextSibling();
        System.out.println(element.getTextContent());
        // @output: World!

        // Set an html variable for the document
        String html = document.getDocumentElement().getOuterHTML();
        System.out.println(html);
        // @output: <html><head></head><body><span>Hello,</span> <span>World!</span></body></html>
        // @END_SNIPPET NavigateThroughHTML
        Assert.StartsWith("<html", html.trim());
        Assert.Contains("</html>", html);
        Assert.Contains("<span>Hello,</span> <span>World!</span>", html);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Inspection of the HTML Document")
    public final void inspectHtmlDocumentTest() {
        // @START_SNIPPET InspectHtmlDocument
        // Load a document from a file
        String documentPath = $i("html_file.html");
        final HTMLDocument document = new HTMLDocument(documentPath);

        // Get the html element of the document
        Element element = document.getDocumentElement();
        System.out.println(element.getTagName());
        // Output: HTML
        Assert.Equal("HTML", element.getTagName());

        // Get the last element of the html element
        element = element.getLastElementChild();
        System.out.println(element.getTagName());
        // Output: BODY
        Assert.Equal("BODY", element.getTagName());

        // Get the first element in the body element
        element = element.getFirstElementChild();
        System.out.println(element.getTagName());
        // Output: H1
        System.out.println(element.getTextContent());
        // Output: Header 1

        Assert.Equal("H1", element.getTagName());
        Assert.Equal("Header 1", element.getTextContent());
        // @END_SNIPPET InspectHtmlDocument
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Node Filter Usage")
    public final void nodeFilterUsageTest() {
        // @START_SNIPPET NodeFilterUsage
        // Prepare HTML code
        String code =
                "<p>Hello,</p>\n" +
                        "<img src='image1.png'>\n" +
                        "<img src='image2.png'>\n" +
                        "<p>World!</p>";

        // Initialize a document based on the prepared code
        final HTMLDocument document = new HTMLDocument(code, ".");

        // To start HTML navigation, we need to create an instance of TreeWalker
        // The specified parameters mean that it starts walking from the root of the document,
        // iterating all nodes and using our custom implementation of the filter
        final ITreeWalker iterator = document.createTreeWalker(document, NodeFilter.SHOW_ALL, new OnlyImageFilter());

        while (iterator.nextNode() != null) {
            // Since we are using our own filter, the current node
            // will always be an instance of the HTMLImageElement
            // So, we don't need the additional validations here
            HTMLImageElement image = (HTMLImageElement) iterator.getCurrentNode();

            System.out.println(image.getSrc());
            // @output: image1.png
            // @output: image2.png

            // Set an html variable for the document
            String html = document.getDocumentElement().getOuterHTML();
            Assert.Contains("<p>", html);
        }
        // @END_SNIPPET NodeFilterUsage
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("XPath Query Usage")
    public final void XPathQueryUsageTest() {
        // @START_SNIPPET XPathQueryUsage
        // Prepare HTML code
        String code =
                "<div class='happy'>\n" +
                        "    <div>\n" +
                        "        <span>Hello,</span>\n" +
                        "    </div>\n" +
                        "</div>\n" +
                        "<p class='happy'>\n" +
                        "    <span>World!</span>\n" +
                        "</p>";

        // Initialize a document based on the prepared code
        final HTMLDocument document = new HTMLDocument(code, ".");
        // Here we evaluate the XPath expression where we select all child <span> elements
        // from elements whose 'class' attribute equals to 'happy':
        IXPathResult result = document.evaluate("//*[@class='happy']//span",
                document,
                null,
                XPathResultType.Any,
                null);

        // Iterate over the resulted nodes
        for (Node node; (node = result.iterateNext()) != null; ) {
            System.out.println(node.getTextContent());
            // @output: Hello,
            // @output: World!
        }
        Assert.True(document.querySelectorAll("div").getLength() > 0);
        // @END_SNIPPET XPathQueryUsage
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("CSS Selector Usage")
    public final void CSSSelectorUsageTest() {
        // @START_SNIPPET CSSSelectorUsage
        // Prepare HTML code
        String code =
                "<div class='happy'>\n" +
                        "    <div>\n" +
                        "        <span>Hello,</span>\n" +
                        "    </div>\n" +
                        "</div>\n" +
                        "<p class='happy'>\n" +
                        "    <span>World!</span>\n" +
                        "</p>\n";

        // Initialize a document based on the prepared code
        final HTMLDocument document = new HTMLDocument(code, ".");

        // Here we create a CSS Selector that extracts all elements
        // whose 'class' attribute equals 'happy' and their child <span> elements
        NodeList elements = document.querySelectorAll(".happy span");

        // Iterate over the resulted list of elements
        for (Node element : elements) {
            System.out.println(((HTMLElement) element).getInnerHTML());
            // @output: Hello,
            // @output: World!
        }
        Assert.Equal("HTML", document.getDocumentElement().getTagName());
        // @END_SNIPPET CSSSelectorUsage
    }

    // @START_SNIPPET OnlyImageFilter
    public static class OnlyImageFilter extends NodeFilter {
        @Override
        public short acceptNode(Node n) {
            // The current filter skips all elements, except IMG elements.
            return "img".equals(n.getLocalName())
                    ? FILTER_ACCEPT
                    : FILTER_SKIP;
        }
    }
    // @END_SNIPPET OnlyImageFilter
}

