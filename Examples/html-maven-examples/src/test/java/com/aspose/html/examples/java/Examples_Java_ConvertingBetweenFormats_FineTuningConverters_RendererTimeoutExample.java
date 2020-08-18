package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_RendererTimeoutExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code = """
                < script >
                        var count = 0;
                        setInterval(function()
                        {
                            var element = document.createElement('div');
                            var message = (++count) + '. ' + 'Hello World!!';
                            var text = document.createTextNode(message);
                            element.appendChild(text);
                            document.body.appendChild(element);
                        },1000);
                </script >
                """;

        // Initialize an HTML document based on prepared HTML code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create an instance of HTML Renderer
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create an instance of PDF device
                var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "output.pdf");
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