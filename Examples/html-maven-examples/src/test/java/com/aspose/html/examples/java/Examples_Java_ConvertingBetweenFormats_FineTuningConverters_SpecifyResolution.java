package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyResolution {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code and save it to the file.
        var code = """
                < style >
                                p
                        {
                            background:
                            blue;
                        }
                        @media(min - resolution:300dpi)
                        {
                            p
                            {
                                /* high resolution screen color */
                                background:
                                green
                            }
                        }
                    </style >
                    <p > Hello World !! </p >
                """;

        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        }

        // Create an instance of HTML document
        var document = new com.aspose.html.HTMLDocument(dataDir + "document.html");
        try {
            // Create options for low-resolution screens
            var options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            options.setHorizontalResolution(com.aspose.html.drawing.Resolution.to_Resolution(50d));
            options.setVerticalResolution(com.aspose.html.drawing.Resolution.to_Resolution(50d));

            // Create an instance of PDF device
            var device = new com.aspose.html.rendering.pdf.PdfDevice(
                    options,
                    dataDir + "output_resolution_50.pdf"
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
                    dataDir + "output_resolution_300.pdf"
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