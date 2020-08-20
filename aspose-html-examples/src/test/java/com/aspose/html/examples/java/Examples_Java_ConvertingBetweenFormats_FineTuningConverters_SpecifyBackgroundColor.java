package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyBackgroundColor {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = "<p>Hello World!!</p>";
        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Create an instance of HTML document
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Initialize options with 'cyan' as a background-color
            var options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();

            options.setBackgroundColor(com.aspose.html.drawing.Color.getCyan());

            // Create an instance of PDF device
            var device = new com.aspose.html.rendering.pdf.PdfDevice(options, dataDir + "output.pdf");
            try {
                // Render HTML to PDF
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