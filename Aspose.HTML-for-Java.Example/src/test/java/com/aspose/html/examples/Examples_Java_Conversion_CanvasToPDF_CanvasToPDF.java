package com.aspose.html.examples;

public class Examples_Java_Conversion_CanvasToPDF_CanvasToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        //@START
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.input("canvas.html"));
        try {
            // Create an instance of HTML renderer and XPS output device
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(Resources.output("canvas.output.pdf"));
                try {
                    //  Render the document to the specified device
                    renderer.render(device, document);
                } finally {
                    if (device != null) {
                        device.dispose();
                    }
                }
            } finally {
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        //@END
    }
}