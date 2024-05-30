package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_EditDocuments_DocumentTree2 {
    public static void main(String [] args) throws java.io.IOException {

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_DocumentTree2
        // Create an instance of an HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Create a style element and assign the green color for all elements with class-name equals 'gr'.
        com.aspose.html.dom.Element style = document.createElement("style");
        style.setTextContent(".gr { color: green }");

        // Find the document header element and append the style element to the header
        com.aspose.html.dom.Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(style);

        // Create a paragraph element with class-name 'gr'.
        com.aspose.html.HTMLParagraphElement p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");
        p.setClassName("gr");

        // Create a text node
        com.aspose.html.dom.Text text = document.createTextNode("Hello World!!");

        // Append the text node to the paragraph
        p.appendChild(text);

        // Append the paragraph to the document body element
        document.getBody().appendChild(p);

        // Save the HTML document to a file
        document.save("using-dom.html");

        // Create an instance of the PDF output device and render the document into this device
        com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice("using-dom.pdf");

        // Render HTML to PDF
        document.renderTo(device);
        // END_SNIPPET
    }
}
