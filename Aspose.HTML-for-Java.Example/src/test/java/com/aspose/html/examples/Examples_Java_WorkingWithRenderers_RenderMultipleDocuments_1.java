package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderMultipleDocuments_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(
                "<style>p { color: green; }</style><p>my first paragraph0</p>",
                Resources.outputDirectory()
        );
        com.aspose.html.HTMLDocument document2 = new com.aspose.html.HTMLDocument(
                "<style>p { color: blue; }</style><p>my first paragraph1</p>",
                Resources.outputDirectory()
        );
        try {
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(Resources.output("document_out.xps"));
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