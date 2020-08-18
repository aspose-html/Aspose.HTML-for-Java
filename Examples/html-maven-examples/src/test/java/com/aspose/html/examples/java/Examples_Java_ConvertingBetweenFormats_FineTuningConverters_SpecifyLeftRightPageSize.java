package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyLeftRightPageSize {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code = """
                <style>
                    div { page-break-after: always; }
                </style>
                < div > First Page</div >
                <div > Second Page</div >
                <div > Third Page</div >
                <div > Fourth Page</div > 
                """;

        // Initialize the HTML document from the HTML code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of Rendering Options and set a custom page-size
            var options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.getPageSetup().setLeftRightPage(
                    new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(400, 200)),
                    new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(400, 100))
            );

            // Create the PDF Device and specify options and output file
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