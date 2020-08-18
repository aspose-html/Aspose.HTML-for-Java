package com.aspose.html.examples.java;

public class Examples_Java_AdvancedUsage_HTML5Canvas_ManipulateUsingCode {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Create an empty HTML document
        var document = new com.aspose.html.HTMLDocument();
        try {
            // Create the Canvas element
            var canvas = (com.aspose.html.HTMLCanvasElement) document.createElement("canvas");

            // with a specified size
            canvas.setWidth(300);
            canvas.setHeight(150);

            // and append it to the document body
            document.getBody().appendChild(canvas);

            // Get the canvas rendering context to draw
            var context = (com.aspose.html.dom.canvas.ICanvasRenderingContext2D) canvas.getContext("2d");

            // Prepare the gradient brush
            var gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
            gradient.addColorStop(0, "magenta");
            gradient.addColorStop(0.5, "blue");
            gradient.addColorStop(1.0, "red");

            // Assign brush to the content
            context.setFillStyle(gradient);
            context.setStrokeStyle(gradient);

            // Write the Text
            context.fillText("Hello World!", 10, 90, 500d);

            // Fill the Rectangle
            context.fillRect(0, 95, 300, 20);

            // Create the PDF output device
            var device = new com.aspose.html.rendering.pdf.PdfDevice(dataDir + "canvas.pdf");
            try {
                // Render HTML5 Canvas to PDF
                document.renderTo(device);
            } finally {
                if (device != null) {
                    device.dispose();
                }
            }
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}