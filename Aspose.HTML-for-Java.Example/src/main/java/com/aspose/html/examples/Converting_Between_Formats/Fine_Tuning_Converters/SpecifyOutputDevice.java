package com.aspose.html.examples.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyOutputDevice {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_RenderHtmlToPdf.java
        // Render HTML to PDF using Java
        // Learn more: https://docs.aspose.com/html/java/fine-tuning-converters/

        // Prepare HTML code
        String code = "<span>Hello, World!!</span>";

        // Initialize an HTML document from HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of the PdfDevice class and specify the output file to render
        PdfDevice device = new PdfDevice($o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}