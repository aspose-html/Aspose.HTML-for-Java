package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderEPUBAsXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("document.epub"))) {
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(Resources.output("document_out.xps"));
            com.aspose.html.rendering.EpubRenderer renderer = new com.aspose.html.rendering.EpubRenderer();
            try {
                renderer.render(device, fileInputStream, new com.aspose.html.Configuration());
            } finally {
                if (device != null) {
                    device.dispose();
                }
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        }
    }
}