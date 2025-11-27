package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.collections.NodeList;

public class CSSSelectorUsageExample {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_SelectHtmlElementsUsingCssSelector.java
        // Select HTML elements using CSS selector querySelectorAll method in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/html-navigation/

        // Prepare HTML code
        String code = "< div class='happy' >\n" +
                "        <div >\n" +
                "            <span > Hello, </span >\n" +
                "        </div >\n" +
                "    </div >\n" +
                "    <p class='happy' >\n" +
                "        <span > World ! </span >\n" +
                "    </p >\n";

        // Initialize a document based on the prepared code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Here, we create a CSS Selector that extracts all elements whose 'class' attribute equals to 'happy' and their child SPAN elements
        NodeList elements = document.querySelectorAll(".happy span");

        // Iterate over the resulted list of elements
        elements.forEach(element -> {
            System.out.println(((HTMLElement) element).getInnerHTML());
            // @output: Hello,
            // @output: World!
        });
        // @END_SNIPPET
    }
}