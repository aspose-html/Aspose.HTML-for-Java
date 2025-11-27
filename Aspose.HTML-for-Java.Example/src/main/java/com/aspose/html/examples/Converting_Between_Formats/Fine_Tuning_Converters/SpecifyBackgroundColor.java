package com.aspose.html.examples.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Color;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyBackgroundColor {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_SpecifyBackgroundColorHtmlToPdf.java
        // Render HTML to PDF with custom background color using Java
        // Learn more: https://docs.aspose.com/html/java/fine-tuning-converters/

        // Prepare HTML code and save it to a file
        String code = "<p>Hello, World!!</p>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Initialize options with 'cyan' as a background-color
        PdfRenderingOptions options = new PdfRenderingOptions();
        options.setBackgroundColor(Color.getCyan());

        // Create an instance of the PdfDevice class
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}