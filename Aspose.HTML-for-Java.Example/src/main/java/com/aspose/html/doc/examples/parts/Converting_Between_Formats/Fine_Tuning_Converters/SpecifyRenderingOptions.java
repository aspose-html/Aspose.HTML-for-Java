package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyRenderingOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_SpecifyRenderingOptions
        // Prepare HTML code
        String code = "<span>Hello, World!!</span>";

        // Initialize a HTML document from the HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of PdfRenderingOptions and set a custom page-size
        PdfRenderingOptions options = new PdfRenderingOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page();
        anyPage.setSize(
                new Size(
                        Length.fromInches(5),
                        Length.fromInches(2)
                )
        );
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);

        // Create a PDF Device and specify options and output file
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}
