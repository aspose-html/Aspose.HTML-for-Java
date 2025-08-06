package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithRenderers;

import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.SvgRenderer;
import com.aspose.html.rendering.image.ImageDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RenderSVGDocAsPNG_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        SVGDocument document = new SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", "c:\\work\\");

        SvgRenderer renderer = new SvgRenderer();
        ImageDevice device = new ImageDevice($o("document_out.png"));

        renderer.render(device, document);
    }
}