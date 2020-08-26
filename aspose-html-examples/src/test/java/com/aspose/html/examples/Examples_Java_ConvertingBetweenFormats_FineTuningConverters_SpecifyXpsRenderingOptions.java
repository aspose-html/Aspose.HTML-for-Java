package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyXpsRenderingOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code
        String code = "<span>Hello World!!</span>";

        // Initialize the HTML document from the HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of XpsRenderingOptions and set a custom page-size
            com.aspose.html.rendering.xps.XpsRenderingOptions options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
            com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page();
            anyPage.setSize(
                    new com.aspose.html.drawing.Size(
                            com.aspose.html.drawing.Length.fromInches(5),
                            com.aspose.html.drawing.Length.fromInches(2)
                    )
            );
            options.getPageSetup().setAnyPage(anyPage);

            // Create the XPS Device and specify options and output file
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(options, dataDir + "output.xps");
            try {
                // Render HTML to XPS
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