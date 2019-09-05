package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLCanvasElement;
import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.canvas.ICanvasGradient;
import com.aspose.html.dom.canvas.ICanvasRenderingContext2D;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.xps.XpsDevice;


public class ManipulateCanvas
{
    public static void run()
    {
        // ExStart:ManipulateCanvas
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        // Create an empty document
        HTMLDocument document = new HTMLDocument();
        try
        {
            // Create a Canvas element
           HTMLCanvasElement canvas = (HTMLCanvasElement) document.createElement("canvas");
            // Set the canvas size
            canvas.setWidth(300);
            canvas.setHeight(150);
            // Append created element to the document
            document.getBody().appendChild(canvas);

            // Initialize a canvas 2D context
           ICanvasRenderingContext2D context = (ICanvasRenderingContext2D) canvas.getContext("2d");

            // Prepare a gradient brush
           ICanvasGradient gradient = context.createLinearGradient(0, 0, canvas.getWidth(), 0);
            gradient.addColorStop(0, "magenta");
            gradient.addColorStop(0.5, "blue");
            gradient.addColorStop(1.0, "red");

            // Set the previously prepared brush to the fill and stroke properties
            context.setFillStyle(gradient);
            context.setStrokeStyle(gradient);
            // Fill a rectange
            context.fillRect(0, 95, 300, 20);
            // Write a text
            context.fillText("Hello World!", 10, 90, 500.0);

            // Create an instance of HTML renderer and XPS output device
            HtmlRenderer renderer = new HtmlRenderer();
            try
            {
            XpsDevice device = new XpsDevice(StringExtensions.concat(dataDir,  "canvas.xps"));
            try
            {
                //  Render the document to the specified device
                renderer.render(device, document);
            }
            finally { if (device != null) device.dispose(); }
            }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:ManipulateCanvas
    }
}
