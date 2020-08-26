package com.aspose.html.examples;


public class Examples_Java_WorkingWithRenderers_RenderMHTMLAsXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();

        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "document.mht")) {
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(dataDir + "document_out.xps");
            com.aspose.html.rendering.MhtmlRenderer renderer = new com.aspose.html.rendering.MhtmlRenderer();
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