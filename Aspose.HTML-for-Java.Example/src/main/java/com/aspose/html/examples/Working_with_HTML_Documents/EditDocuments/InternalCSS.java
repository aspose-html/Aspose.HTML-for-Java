package com.aspose.html.examples.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.dom.Element;
import com.aspose.html.rendering.pdf.PdfDevice;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class InternalCSS {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_EditInternalCss.java
        // Edit HTML with internal CSS using Java
        // Learn more: https://docs.aspose.com/html/java/edit-a-document/

        // Create an instance of an HTML document with specified content
        String content = "<div><p>Internal CSS</p><p>An internal CSS is used to define a style for a single HTML page</p></div>";
        HTMLDocument document = new HTMLDocument(content, ".");

        // Create a style element with text content
        Element style = document.createElement("style");
        style.setTextContent(".frame1 { margin-top:50px; margin-left:50px; padding:20px; width:360px; height:90px; background-color:#a52a2a; font-family:verdana; color:#FFF5EE;} \r\n" +
                ".frame2 { margin-top:-90px; margin-left:160px; text-align:center; padding:20px; width:360px; height:100px; background-color:#ADD8E6;}");

        // Find the document header element and append the style element to the header
        Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(style);

        // Find the first paragraph element to inspect the styles
        HTMLElement paragraph = (HTMLElement) document.getElementsByTagName("p").get_Item(0);
        paragraph.setClassName("frame1");

        // Find the last paragraph element to inspect the styles
        HTMLElement lastParagraph = (HTMLElement) document.getElementsByTagName("p").get_Item(document.getElementsByTagName("p").getLength() - 1);
        lastParagraph.setClassName("frame2");

        // Set a font-size to the first paragraph
        paragraph.getStyle().setFontSize("250%");
        paragraph.getStyle().setTextAlign("center");

        // Set a color and font-size to the last paragraph
        lastParagraph.getStyle().setColor("#434343");
        lastParagraph.getStyle().setFontSize("150%");
        lastParagraph.getStyle().setFontFamily("verdana");

        // Save the HTML document to a file
        document.save($o("edit-internal-css.html"));

        // Create an instance of the PDF output device and render the document on that device
        PdfDevice device = new PdfDevice($o("edit-internal-css.html"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}