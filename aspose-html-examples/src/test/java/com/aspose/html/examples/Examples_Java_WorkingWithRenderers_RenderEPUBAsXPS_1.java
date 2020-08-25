package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderEPUBAsXPS_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        try (var fileInputStream = new java.io.FileInputStream(dataDir + "document.epub")) {
            var device = new com.aspose.html.rendering.xps.XpsDevice(dataDir + "document_out.xps");
            var renderer = new com.aspose.html.rendering.EpubRenderer();
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