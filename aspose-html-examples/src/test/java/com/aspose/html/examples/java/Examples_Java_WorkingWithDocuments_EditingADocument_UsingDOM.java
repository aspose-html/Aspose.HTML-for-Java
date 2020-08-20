package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_EditingADocument_UsingDOM {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Create the instance of HTML Document
        var document = new com.aspose.html.HTMLDocument();
        try {
            // Create the style element and assign the green color for all elements with class-name equals 'gr'.
            var style = document.createElement("style");
            style.setTextContent(".gr { color: green }");

            // Find the document header element and append style element to the header
            var head = document.getElementsByTagName("head").get_Item(0);
            head.appendChild(style);

            // Create the paragraph element with class-name 'gr'.
            var p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");
            p.setClassName("gr");

            // Create the text node
            var text = document.createTextNode("Hello World!!");

            // Append the text node to the paragraph
            p.appendChild(text);

            // Append the paragraph to the document body element
            document.getBody().appendChild(p);

            // Create the instance of the PDF output device and render the document into this device
            var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "output.pdf");
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