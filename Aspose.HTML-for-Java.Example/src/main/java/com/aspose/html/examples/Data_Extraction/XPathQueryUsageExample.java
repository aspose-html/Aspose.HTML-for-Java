package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Node;
import com.aspose.html.dom.xpath.IXPathResult;
import com.aspose.html.dom.xpath.XPathResultType;

public class XPathQueryUsageExample {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // @START_SNIPPET Example_SelectHtmlElementsUsingXPath.java
        // Select HTML elements using XPath expression in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/html-navigation/

        // Prepare HTML code
        String code = "< div class='happy' >\n" +
                "        <div >\n" +
                "            <span > Hello! </span >\n" +
                "        </div >\n" +
                "    </div >\n" +
                "    <p class='happy' >\n" +
                "        <span > World! </span >\n" +
                "    </p >\n";

        // Initialize a document based on the prepared code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Here, we evaluate the XPath expression where we select all child <span> elements from elements whose 'class' attribute equals to 'happy'
        IXPathResult result = document.evaluate("//*[@class='happy']//span",
                document,
                null,
                XPathResultType.Any,
                null
        );

        // Iterate over the resulted nodes
        for (Node node; (node = result.iterateNext()) != null; ) {
            System.out.println(node.getTextContent());
            // @output: Hello!
            // @output: World!
        }
        // @END_SNIPPET
    }
}