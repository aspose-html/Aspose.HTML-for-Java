package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_CombineMultipleHTMLToPDF {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code1 = "<br><span style='color: green'>Hello World!!</span>";
        var code2 = "<br><span style='color: blue'>Hello World!!</span>";
        var code3 = "<br><span style='color: red'>Hello World!!</span>";

        // Create three HTML documents to merge later
        var document1 = new com.aspose.html.HTMLDocument(code1, ".");
        var document2 = new com.aspose.html.HTMLDocument(code2, ".");
        var document3 = new com.aspose.html.HTMLDocument(code3, ".");
        try {
            // Create an instance of HTML Renderer
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create an instance of PDF device
                var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "output.pdf");
                try {
                    // Merge all HTML documents into PDF
                    renderer.render(device, new com.aspose.html.HTMLDocument[]{document1, document2, document3});
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
            if (document1 != null) {
                document1.dispose();
            }
            if (document2 != null) {
                document2.dispose();
            }
            if (document3 != null) {
                document3.dispose();
            }
        }
    }
}