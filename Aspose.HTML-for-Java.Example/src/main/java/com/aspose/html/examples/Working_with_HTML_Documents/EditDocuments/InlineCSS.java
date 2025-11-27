package com.aspose.html.examples.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.examples.utils.Resources.$o;

public class InlineCSS {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_EditInlineCss.java
        // Edit inline CSS of an HTML element and render HTML to PDF using Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/edit-a-document/

        // Create an instance of an HTML document with specified content
        String content = "<p> Inline CSS </p>";
        HTMLDocument document = new HTMLDocument(content, ".");

        // Find the paragraph element to set a style attribute
        HTMLElement paragraph = (HTMLElement) document.getElementsByTagName("p").get_Item(0);

        // Set the style attribute
        paragraph.setAttribute("style", "font-size: 250%; font-family: verdana; color: #cd66aa");

        // Save the HTML document to a file
        document.save($o("edit-inline-css.html"));

        // Create an instance of the PDF output device and render the document into this device
        PdfDevice device = new PdfDevice($o("edit-inline-css.html"));
        document.renderTo(device);
        // @END_SNIPPET
    }
}