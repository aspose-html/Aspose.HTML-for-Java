package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderHTMLAsPNG_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(
                "<style>p { color: green; }</style><p>my first paragraph</p>",
                Resources.outputDirectory()
        );
        try {
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
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