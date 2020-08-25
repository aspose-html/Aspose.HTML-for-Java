package com.aspose.html.examples;

public class Examples_Java_Conversion_CanvasToPDF_CanvasToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument(dataDir + "canvas.html");
        try {
            // Create an instance of HTML renderer and XPS output device
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "canvas.pdf");
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
    }
}