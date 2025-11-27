package com.aspose.html.examples.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.MediaType;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyMediaType {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_SpecifyMediaTypeWhenConvertHtmlToPdf.java
        // Render HTML to PDF with custom MediaType settings with Java
        // Learn more: https://docs.aspose.com/html/java/fine-tuning-converters/

        // Prepare HTML code
        String code = "<span>Hello, World!!</span>";

        // Initialize an HTML document from the HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of the PdfRenderingOptions class
        PdfRenderingOptions options = new PdfRenderingOptions();
        // Set the 'screen' media-type
        options.getCss().setMediaType(MediaType.Screen);

        // Create a PDF Device and specify options and output file
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}