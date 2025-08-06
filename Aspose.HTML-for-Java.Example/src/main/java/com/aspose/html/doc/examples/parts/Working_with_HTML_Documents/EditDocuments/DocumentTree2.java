package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLParagraphElement;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.Text;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class DocumentTree2 {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {

        // @START_SNIPPET EditDocuments_DocumentTree2
        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument();

        // Create a style element and assign the green color for all elements with class-name equals "gr"
        Element style = document.createElement("style");
        style.setTextContent(".gr { color: green }");

        // Find the document header element and append the style element to the header
        Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(style);

        // Create a paragraph element with class-name "gr"
        HTMLParagraphElement p = (HTMLParagraphElement) document.createElement("p");
        p.setClassName("gr");

        // Create a text node
        Text text = document.createTextNode("Hello, World!!");

        // Append the text node to the paragraph
        p.appendChild(text);

        // Append the paragraph to the document body element
        document.getBody().appendChild(p);

        // Save the HTML document to a file
        document.save($o("using-dom.html"));

        // Create an instance of the PDF output device and render the document into this device
        PdfDevice device = new PdfDevice($o("using-dom.html"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}
