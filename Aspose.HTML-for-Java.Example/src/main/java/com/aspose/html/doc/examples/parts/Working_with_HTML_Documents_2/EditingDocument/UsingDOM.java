package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.EditingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLParagraphElement;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.Text;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class UsingDOM {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Create the instance of HTML Document
        HTMLDocument document = new HTMLDocument();

        // Create the style element and assign the green color for all elements with class-name equals 'gr'.
        Element style = document.createElement("style");
        style.setTextContent(".gr { color: green }");

        // Find the document header element and append style element to the header
        Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(style);

        // Create the paragraph element with class-name 'gr'.
        HTMLParagraphElement p = (HTMLParagraphElement) document.createElement("p");
        p.setClassName("gr");

        // Create the text node
        Text text = document.createTextNode("Hello, World!!");

        // Append the text node to the paragraph
        p.appendChild(text);

        // Append the paragraph to the document body element
        document.getBody().appendChild(p);

        // Create the instance of the PDF output device and render the document into this device
        PdfDevice device = new PdfDevice($o("output.pdf"));

        document.renderTo(device);
    }
}