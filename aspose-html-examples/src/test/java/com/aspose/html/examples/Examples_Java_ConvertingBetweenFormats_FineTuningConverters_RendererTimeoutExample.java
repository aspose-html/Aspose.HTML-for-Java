package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_RendererTimeoutExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare an HTML code
        String code = "< script >\n" +
                      "        var count = 0;\n" +
                      "        setInterval(function()\n" +
                      "        {\n" +
                      "            var element = document.createElement('div');\n" +
                      "            var message = (++count) + '. ' + 'Hello World!!';\n" +
                      "            var text = document.createTextNode(message);\n" +
                      "            element.appendChild(text);\n" +
                      "            document.body.appendChild(element);\n" +
                      "        },1000);\n" +
                      "</script >\n";

        // Initialize an HTML document based on prepared HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create an instance of HTML Renderer
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create an instance of PDF device
                com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(Resources.output("output.pdf"));
                try {
                    // Render HTML to PDF
                    renderer.render(device, 5, document);
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