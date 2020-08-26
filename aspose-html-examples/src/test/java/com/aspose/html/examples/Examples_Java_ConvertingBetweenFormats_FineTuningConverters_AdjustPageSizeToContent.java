package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_AdjustPageSizeToContent {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code
        String code = "    <style>\n" +
                      "        div {\n" +
                      "            page - break -after:always;\n" +
                      "        }\n" +
                      "    </style >\n" +
                      "    <div style = 'border: 1px solid red; width: 400px' > First Page</div >\n" +
                      "    <div style = 'border: 1px solid red; width: 600px' > Second Page</div >\n";
        // Initialize the HTML document from the HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of Rendering Options and set a custom page-size
            com.aspose.html.rendering.pdf.PdfRenderingOptions options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.getPageSetup().setAnyPage(new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(500, 200)));

            // Enable auto-adjusting for the page size
            options.getPageSetup().setAdjustToWidestPage(true);

            // Create the PDF Device and specify options and output file
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(options, dataDir + "output.pdf");
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