package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;

public class NavigateThroughHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_NavigateThroughHtml.java
        // Navigate the HTML DOM using Java
        // Learn more: https://docs.aspose.com/html/java/html-navigation/

        // Prepare HTML code
        String html_code = "<span>Hello,</span> <span>World!</span>";

        // Initialize a document from the prepared code
        HTMLDocument document = new HTMLDocument(html_code, ".");

        // Get the reference to the first child (first <span>) of the document body
        Element element = document.getBody().getFirstElementChild();
        System.out.println(element.getTextContent());
        // @output: Hello,

        // Get the reference to the second <span> element
        element = element.getNextElementSibling();
        System.out.println(element.getTextContent());
        // @output: World!
        // @END_SNIPPET
    }
}