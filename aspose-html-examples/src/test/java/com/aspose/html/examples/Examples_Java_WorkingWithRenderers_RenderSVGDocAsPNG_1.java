package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderSVGDocAsPNG_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", "c:\\work\\");
        try {
            com.aspose.html.rendering.SvgRenderer renderer = new com.aspose.html.rendering.SvgRenderer();
            com.aspose.html.rendering.image.ImageDevice device = new com.aspose.html.rendering.image.ImageDevice(Resources.output("document_out.png"));
            try {
                renderer.render(device, document);
            } finally {
                if (device != null) {
                    device.dispose();
                }
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}