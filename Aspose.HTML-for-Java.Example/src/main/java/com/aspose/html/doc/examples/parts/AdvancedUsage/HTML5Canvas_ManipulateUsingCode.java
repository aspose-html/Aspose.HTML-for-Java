package com.aspose.html.doc.examples.parts.AdvancedUsage;

import com.aspose.html.HTMLCanvasElement;
import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.canvas.ICanvasGradient;
import com.aspose.html.dom.canvas.ICanvasRenderingContext2D;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTML5Canvas_ManipulateUsingCode {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTML5Canvas_ManipulateUsingCode
        // Create an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create the Canvas element
        HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement("canvas");

        // with a specified size
        canvas.setWidth(300);
        canvas.setHeight(150);

        // and append it to the document body
        document.getBody().appendChild(canvas);

        // Get the canvas rendering context to draw
        ICanvasRenderingContext2D context = (ICanvasRenderingContext2D) canvas.getContext("2d");

        // Prepare the gradient brush
        ICanvasGradient gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
        gradient.addColorStop(0, "magenta");
        gradient.addColorStop(0.5, "blue");
        gradient.addColorStop(1.0, "red");

        // Assign brush to the content
        context.setFillStyle(gradient);
        context.setStrokeStyle(gradient);

        // Write the Text
        context.fillText("Hello, World!", 10, 90, 500d);

        // Fill the Rectangle
        context.fillRect(0, 95, 300, 20);

        // Create the PDF output device
        PdfDevice device = new PdfDevice($o("canvas.output.2.pdf"));

        // Render HTML5 Canvas to PDF
        document.renderTo(device);
        //@END_SNIPPET
    }
}
