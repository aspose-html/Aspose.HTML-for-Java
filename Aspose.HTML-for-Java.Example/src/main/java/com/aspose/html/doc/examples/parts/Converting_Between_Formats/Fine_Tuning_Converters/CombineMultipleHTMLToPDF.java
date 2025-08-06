package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CombineMultipleHTMLToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_CombineMultipleHTMLToPDF
        // Prepare HTML code
        String code1 = "<br><span style='color: green'>Hello, World!!</span>";
        String code2 = "<br><span style='color: blue'>Hello, World!!</span>";
        String code3 = "<br><span style='color: red'>Hello, World!!</span>";

        // Create three HTML documents to merge later
        HTMLDocument document1 = new HTMLDocument(code1, ".");
        HTMLDocument document2 = new HTMLDocument(code2, ".");
        HTMLDocument document3 = new HTMLDocument(code3, ".");

        // Create an instance of HTML Renderer
        HtmlRenderer renderer = new HtmlRenderer();

        // Create an instance of the PdfDevice class
        PdfDevice device = new PdfDevice($o("output.pdf"));

        // Merge all HTML documents to PDF
        renderer.render(device, new HTMLDocument[]{document1, document2, document3});
        // @END_SNIPPET
    }
}
