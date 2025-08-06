package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.rendering.xps.XpsRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyXpsRenderingOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_SpecifyXpsRenderingOptions
        // Prepare HTML code
        String code = "<span>Hello, World!!</span>";

        // Initialize an HTML document from the HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of XpsRenderingOptions and set a custom page-size
        XpsRenderingOptions options = new XpsRenderingOptions();
        Page anyPage = new Page();
        anyPage.setSize(
                new Size(
                        Length.fromInches(5),
                        Length.fromInches(2)
                )
        );
        options.getPageSetup().setAnyPage(anyPage);

        // Create an XPS Device and specify options and output file
        XpsDevice device = new XpsDevice(options, $o("output.xps"));

        // Render HTML to XPS
        document.renderTo(device);
        // @END_SNIPPET
    }
}
