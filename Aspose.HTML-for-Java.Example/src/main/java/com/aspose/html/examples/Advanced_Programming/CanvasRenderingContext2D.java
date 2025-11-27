package com.aspose.html.examples.Advanced_Programming;

import com.aspose.html.HTMLCanvasElement;
import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.canvas.ICanvasGradient;
import com.aspose.html.dom.canvas.ICanvasRenderingContext2D;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.examples.utils.Resources.$o;

public class CanvasRenderingContext2D {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_CreateHtmlCanvasWithGradientAndConvertToPdf.java
        // Create HTML5 canvas with gradient text and rectangle, convert to PDF with Java
        // Learn more: https://docs.aspose.com/html/java/edit-html5-canvas/

        // Create an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create a canvas element
        HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement("canvas");

        // with a specified size
        canvas.setWidth(300);
        canvas.setHeight(150);

        // Append the canvas element to the document body
        document.getBody().appendChild(canvas);

        // Get the canvas rendering context to draw
        ICanvasRenderingContext2D context = (ICanvasRenderingContext2D) canvas.getContext("2d");

        // Prepare a gradient brush
        ICanvasGradient gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
        gradient.addColorStop(0, "magenta");
        gradient.addColorStop(0.5, "blue");
        gradient.addColorStop(1.0, "red");

        // Assign the brush to the content
        context.setFillStyle(gradient);
        context.setStrokeStyle(gradient);

        // Write the text
        context.fillText("Hello, World!", 10, 90, 500);

        // Fill the rectangle
        context.fillRect(0, 95, 300, 20);

        // Create a PDF output device
        PdfDevice device = new PdfDevice($o("canvas.output.pdf"));

        // Render HTML5 Canvas to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}
