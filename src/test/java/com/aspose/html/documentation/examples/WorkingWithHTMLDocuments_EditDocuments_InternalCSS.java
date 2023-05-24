package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_InternalCSS {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_InternalCSS
        // Create an instance of an HTML document with specified content
        String content = "<div><p>Internal CSS</p><p>An internal CSS is used to define a style for a single HTML page</p></div>";
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(content, ".");

        com.aspose.html.dom.Element style = document.createElement("style");
        style.setTextContent(".frame1 { margin-top:50px; margin-left:50px; padding:20px; width:360px; height:90px; background-color:#a52a2a; font-family:verdana; color:#FFF5EE;} \r\n" +
                ".frame2 { margin-top:-90px; margin-left:160px; text-align:center; padding:20px; width:360px; height:100px; background-color:#ADD8E6;}");

        // Find the document header element and append the style element to the header
        com.aspose.html.dom.Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(style);

        // Find the first paragraph element to inspect the styles
        com.aspose.html.HTMLElement paragraph = (com.aspose.html.HTMLElement) document.getElementsByTagName("p").get_Item(0);
        paragraph.setClassName("frame1");

        // Find the last paragraph element to inspect the styles
        com.aspose.html.HTMLElement lastParagraph = (com.aspose.html.HTMLElement) document.getElementsByTagName("p").get_Item(document.getElementsByTagName("p").getLength() - 1);
        lastParagraph.setClassName("frame2");

        // Set a font-size to the first paragraph
        paragraph.getStyle().setFontSize("250%");
        paragraph.getStyle().setTextAlign("center");

        // Set a color and font-size to the last paragraph
        lastParagraph.getStyle().setColor("#434343");
        lastParagraph.getStyle().setFontSize("150%");
        lastParagraph.getStyle().setFontFamily("verdana");

        // Save the HTML document to a file
        document.save("edit-internal-css.html");

        // Create the instance of the PDF output device and render the document into this device
        com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice("edit-internal-css.pdf");

        // Render HTML to PDF
        document.renderTo(device);
        // END_SNIPPET
    }
}
