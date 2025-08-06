package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CanvasToPDF_CanvasToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET CanvasToPDF_CanvasToPDF
        HTMLDocument document = new HTMLDocument($i("canvas.html"));

        // Create an instance of HTML renderer and XPS output device
        HtmlRenderer renderer = new HtmlRenderer();

        PdfDevice device = new PdfDevice($o("canvas.output.pdf"));

        //  Render the document to the specified device
        renderer.render(device, document);

        //@END_SNIPPET
    }
}