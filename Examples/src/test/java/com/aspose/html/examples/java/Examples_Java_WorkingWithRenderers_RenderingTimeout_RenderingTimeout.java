package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithRenderers_RenderingTimeout_RenderingTimeout {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        // Create an instance of the HTML document
        var document = new com.aspose.html.HTMLDocument();
        try {
            // Async loading of the external html file
            document.navigate(dataDir + "input.html");

            // Create a renderer and output device
            var renderer = new com.aspose.html.rendering.HtmlRenderer();
            var device = new com.aspose.html.rendering.image.ImageDevice(dataDir + "document.png");
            try {
                // Delay rendering for 5 seconds
                // Note: document will be rendered into device if there are no scripts or any internal tasks to execute
                renderer.render(device, com.aspose.time.TimeSpan.fromSeconds(5), document);
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