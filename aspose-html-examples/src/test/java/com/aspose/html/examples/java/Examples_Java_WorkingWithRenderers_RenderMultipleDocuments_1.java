package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithRenderers_RenderMultipleDocuments_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument(
                "<style>p { color: green; }</style><p>my first paragraph0</p>",
                dataDir
        );
        var document2 = new com.aspose.html.HTMLDocument(
                "<style>p { color: blue; }</style><p>my first paragraph1</p>",
                dataDir
        );
        try {
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            var device = new com.aspose.html.rendering.xps.XpsDevice(dataDir + "document_out.xps");
            try {
                renderer.render(device, new com.aspose.html.HTMLDocument[]{document, document2});
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
            if (document2 != null) {
                document2.dispose();
            }
        }
    }
}