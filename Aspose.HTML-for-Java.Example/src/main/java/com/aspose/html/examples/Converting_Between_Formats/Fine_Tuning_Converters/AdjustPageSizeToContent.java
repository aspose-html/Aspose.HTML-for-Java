package com.aspose.html.examples.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class AdjustPageSizeToContent {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_PageSetupAdjustToWidestPage.java
        // Render HTML to PDF and adjust to the widest page with Java
        // Learn more: https://docs.aspose.com/html/java/fine-tuning-converters/

        // Prepare HTML code
        String code = "    <style>\n" +
                "        div {\n" +
                "            page - break -after:always;\n" +
                "        }\n" +
                "    </style >\n" +
                "    <div style = 'border: 1px solid red; width: 400px' > First Page</div >\n" +
                "    <div style = 'border: 1px solid red; width: 600px' > Second Page</div >\n";
        // Initialize an HTML document from HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of the PdfRenderingOptions class and set a custom page-size
        PdfRenderingOptions options = new PdfRenderingOptions();
        options.getPageSetup().setAnyPage(new Page(new Size(500, 200)));

        // Enable auto-adjusting for the page size
        options.getPageSetup().setAdjustToWidestPage(true);

        // Create an instance of the PdfDevice class and specify options and output file
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}