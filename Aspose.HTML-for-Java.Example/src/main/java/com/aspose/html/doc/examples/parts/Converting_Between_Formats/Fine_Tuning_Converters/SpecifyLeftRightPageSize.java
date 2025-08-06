package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyLeftRightPageSize {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_SpecifyLeftRightPageSize
        // Prepare HTML code
        String code = "<style>\n" +
                "    div { page-break-after: always; }\n" +
                "</style>\n" +
                "< div > First Page</div >\n" +
                "<div > Second Page</div >\n" +
                "<div > Third Page</div >\n" +
                "<div > Fourth Page</div >\n";

        // Initialize the HTML document from the HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create the instance of the PdfRenderingOptions class and set a custom page-size
        PdfRenderingOptions options = new PdfRenderingOptions();
        options.getPageSetup().setLeftRightPage(
                new Page(new Size(400, 200)),
                new Page(new Size(400, 100))
        );

        // Create an instance of the PdfDevice class
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}