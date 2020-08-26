package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_EditingADocument_UsingDOM {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Create the instance of HTML Document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create the style element and assign the green color for all elements with class-name equals 'gr'.
            com.aspose.html.dom.Element style = document.createElement("style");
            style.setTextContent(".gr { color: green }");

            // Find the document header element and append style element to the header
            com.aspose.html.dom.Element head = document.getElementsByTagName("head").get_Item(0);
            head.appendChild(style);

            // Create the paragraph element with class-name 'gr'.
            com.aspose.html.HTMLParagraphElement p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");
            p.setClassName("gr");

            // Create the text node
            com.aspose.html.dom.Text text = document.createTextNode("Hello World!!");

            // Append the text node to the paragraph
            p.appendChild(text);

            // Append the paragraph to the document body element
            document.getBody().appendChild(p);

            // Create the instance of the PDF output device and render the document into this device
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "output.pdf");
            try {
                document.renderTo(device);
            } finally {
                if (device != null) {
                    device.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}