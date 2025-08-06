package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Resolution;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyResolution {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_SpecifyResolution
        // Prepare HTML code and save it to a file
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

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Create options for low-resolution screens
        PdfRenderingOptions options = new PdfRenderingOptions();
        options.setHorizontalResolution(Resolution.to_Resolution(50d));
        options.setVerticalResolution(Resolution.to_Resolution(50d));

        // Create an instance of the PdfDevice
        PdfDevice device = new PdfDevice(options, $o("output_resolution_50.pdf"));

        // Render HTML to PDF
        document.renderTo(device);

        // Create options for high-resolution screens
        options = new PdfRenderingOptions();
        options.setHorizontalResolution(Resolution.to_Resolution(300d));
        options.setVerticalResolution(Resolution.to_Resolution(300d));

        // Create an instance of PDF device
        device = new PdfDevice(options, $o("output_resolution_300.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}