package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyOutputDevice {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code
        String code = "<span>Hello World!!</span>";

        // Initialize the HTML document from the HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the PDF Device and specify the output file to render
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(Resources.output("output.pdf"));
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
