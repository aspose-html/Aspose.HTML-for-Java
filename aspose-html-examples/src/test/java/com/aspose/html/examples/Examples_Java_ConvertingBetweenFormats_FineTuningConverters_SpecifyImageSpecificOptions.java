package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyImageSpecificOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code
        String code = "<div>Hello World!!</div>";

        // Initialize an instance of HTML document based on prepared code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create an instance of Rendering Options
            com.aspose.html.rendering.image.ImageRenderingOptions options = new com.aspose.html.rendering.image.ImageRenderingOptions();
            options.setFormat(com.aspose.html.rendering.image.ImageFormat.Jpeg);
            // Disable smoothing mode
            options.setSmoothingMode(com.aspose.html.drawing.SmoothingMode.None);
            // Set the image resolution as 75 dpi
            options.setVerticalResolution(com.aspose.html.drawing.Resolution.fromDotsPerInch(75));
            options.setHorizontalResolution(com.aspose.html.drawing.Resolution.fromDotsPerInch(75));

            // Create an instance of Image Device
            com.aspose.html.rendering.image.ImageDevice device = new com.aspose.html.rendering.image.ImageDevice(options, dataDir + "output.jpg");
            try {
                // Render HTML to Image
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