package com.aspose.html.examples;


public class Examples_Java_WorkingWithDocuments_EditingADocument_EditCSS {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Create an instance of HTML Document with specified content
        String content = "<style>p { color: red; }</style><p>Hello World!</p>";
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(content, ".");
        try {
            // Find the paragraph element to inspect the styles
            com.aspose.html.HTMLElement paragraph = (com.aspose.html.HTMLElement) document.getElementsByTagName("p").get_Item(0);

            // Get the reference to the IViewCSS interface.
            com.aspose.html.dom.css.IViewCSS view = (com.aspose.html.dom.css.IViewCSS) document.getContext().getWindow();

            // Get the calculated style value for the paragraph node
            com.aspose.html.dom.css.ICSSStyleDeclaration declaration = view.getComputedStyle(paragraph);

            // Read the "color" property value out of the style declaration object
            System.out.println(declaration.getPropertyCSSValue("color"));

            // Set the green color to the paragraph
            paragraph.getStyle().setProperty("color", "navy");

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
