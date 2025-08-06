package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithRenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Resources;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.xps.XpsDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RenderMultipleDocuments_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        HTMLDocument document = new HTMLDocument(
                "<style>p { color: green; }</style><p>my first paragraph0</p>",
                Resources.outputDirectory()
        );
        HTMLDocument document2 = new HTMLDocument(
                "<style>p { color: blue; }</style><p>my first paragraph1</p>",
                Resources.outputDirectory()
        );
        HtmlRenderer renderer = new HtmlRenderer();
        XpsDevice device = new XpsDevice($o("document_out.xps"));
        renderer.render(device, new HTMLDocument[]{document, document2});
    }
}