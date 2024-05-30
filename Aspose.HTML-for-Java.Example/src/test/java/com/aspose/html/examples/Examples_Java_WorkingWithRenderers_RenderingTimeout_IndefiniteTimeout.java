package com.aspose.html.examples;

public class Examples_Java_WorkingWithRenderers_RenderingTimeout_IndefiniteTimeout {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Create an instance of the HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Async loading of the external html file
            document.navigate(Resources.input("input.html"));

            // Create a renderer and output device
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            com.aspose.html.rendering.image.ImageDevice device = new com.aspose.html.rendering.image.ImageDevice(Resources.output("document.png"));
            try {
                // Delay the rendering indefinitely until there are no scripts or any other internal tasks to execute
                renderer.render(device, -1l, document);
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