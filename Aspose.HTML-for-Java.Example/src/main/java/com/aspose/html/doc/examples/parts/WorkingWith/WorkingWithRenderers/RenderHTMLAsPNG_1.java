package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithRenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Resources;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RenderHTMLAsPNG_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        HTMLDocument document = new HTMLDocument(
                "<style>p { color: green; }</style><p>my first paragraph</p>",
                Resources.outputDirectory()
        );

        HtmlRenderer renderer = new HtmlRenderer();
        ImageDevice device = new ImageDevice($o("E2.png"));

        renderer.render(device, document);
    }
}