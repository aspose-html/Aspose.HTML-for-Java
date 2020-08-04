package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithRenderers_RenderSVGDocAsPNG_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.dom.svg.SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", "c:\\work\\");
        try {
            var renderer = new com.aspose.html.rendering.SvgRenderer();
            var device = new com.aspose.html.rendering.image.ImageDevice(dataDir + "document_out.png");
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