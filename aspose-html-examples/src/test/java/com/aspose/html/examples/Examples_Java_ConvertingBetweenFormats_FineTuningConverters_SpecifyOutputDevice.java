package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyOutputDevice {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code = "<span>Hello World!!</span>";

        // Initialize the HTML document from the HTML code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the PDF Device and specify the output file to render
            var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "output.pdf");
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