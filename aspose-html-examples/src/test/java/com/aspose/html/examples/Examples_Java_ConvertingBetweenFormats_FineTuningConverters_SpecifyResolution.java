package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyResolution {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Prepare an HTML code and save it to the file.
        String code = "< style >\n" +
                      "                p\n" +
                      "        {\n" +
                      "            background:\n" +
                      "            blue;\n" +
                      "        }\n" +
                      "        @media(min - resolution:300dpi)\n" +
                      "        {\n" +
                      "            p\n" +
                      "            {\n" +
                      "                /* high resolution screen color */\n" +
                      "                background:\n" +
                      "                green\n" +
                      "            }\n" +
                      "        }\n" +
                      "    </style >\n" +
                      "    <p > Hello World !! </p >\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("document.html"));
        try {
            // Create options for low-resolution screens
            com.aspose.html.rendering.pdf.PdfRenderingOptions options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.setHorizontalResolution(com.aspose.html.drawing.Resolution.to_Resolution(50d));
            options.setVerticalResolution(com.aspose.html.drawing.Resolution.to_Resolution(50d));

            // Create an instance of PDF device
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(
                    options,
                    Resources.output("output_resolution_50.pdf")
            );
            try {
                // Render HTML to PDF
                document.renderTo(device);
            } finally {
                if (device != null) {
                    device.dispose();
                }
            }

            // Create options for high-resolution screens
            options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.setHorizontalResolution(com.aspose.html.drawing.Resolution.to_Resolution(300d));
            options.setVerticalResolution(com.aspose.html.drawing.Resolution.to_Resolution(300d));

            // Create an instance of PDF device
            device = new com.aspose.html.rendering.pdf.PdfDevice(
                    options,
                    Resources.output("output_resolution_300.pdf")
            );
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