package com.aspose.html.examples;

public class Examples_Java_Document_ManipulateCanvas_ManipulateCanvas {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Create an empty document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create a Canvas element
            com.aspose.html.HTMLCanvasElement canvas = (com.aspose.html.HTMLCanvasElement) document.createElement("canvas");
            // Set the canvas size
            canvas.setWidth(300);
            canvas.setHeight(150);
            // Append created element to the document
            document.getBody().appendChild(canvas);

            // Initialize a canvas 2D context
            com.aspose.html.dom.canvas.ICanvasRenderingContext2D context = (com.aspose.html.dom.canvas.ICanvasRenderingContext2D) canvas.getContext("2d");

            // Prepare a gradient brush
            com.aspose.html.dom.canvas.ICanvasGradient gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
            gradient.addColorStop(0, "magenta");
            gradient.addColorStop(0.5, "blue");
            gradient.addColorStop(1.0, "red");

            // Set the previously prepared brush to the fill and stroke properties
            context.setFillStyle(gradient);
            context.setStrokeStyle(gradient);
            // Fill a rectange
            context.fillRect(0, 95, 300, 20);
            // Write a text
            context.fillText("Hello World!", 10, 90, 500d);

            // Create an instance of HTML renderer and XPS output device
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(Resources.output("canvas.xps"));
            try {
                //  Render the document to the specified device
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