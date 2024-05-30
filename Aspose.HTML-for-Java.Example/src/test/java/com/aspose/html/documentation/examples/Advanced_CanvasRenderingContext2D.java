package com.aspose.html.documentation.examples;

public class Advanced_CanvasRenderingContext2D {
    public static void main(String[] args) throws java.io.IOException {
        // START_SNIPPET Advanced_HTML5Canvas
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Create an empty HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        com.aspose.html.HTMLCanvasElement canvas = (com.aspose.html.HTMLCanvasElement) document.createElement("canvas");

        // with a specified size
        canvas.setWidth(300);
        canvas.setHeight(150);

        // and append it to the document body
        document.getBody().appendChild(canvas);

        // Get the canvas rendering context to draw
        com.aspose.html.dom.canvas.ICanvasRenderingContext2D context = (com.aspose.html.dom.canvas.ICanvasRenderingContext2D) canvas.getContext("2d");

        // Prepare the gradient brush
        com.aspose.html.dom.canvas.ICanvasGradient gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
        gradient.addColorStop(0, "magenta");
        gradient.addColorStop(0.5, "blue");
        gradient.addColorStop(1.0, "red");

        // Assign brush to the content
        context.setFillStyle(gradient);
        context.setStrokeStyle(gradient);

        // Write the Text
        context.fillText("Hello World!", 10, 90, 500);

        // Fill the Rectangle
        context.fillRect(0, 95, 300, 20);

        // Create the PDF output device
        com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice("canvas.pdf");

        // Render HTML5 Canvas to PDF
        document.renderTo(device);
        // END_SNIPPET
    }
}
