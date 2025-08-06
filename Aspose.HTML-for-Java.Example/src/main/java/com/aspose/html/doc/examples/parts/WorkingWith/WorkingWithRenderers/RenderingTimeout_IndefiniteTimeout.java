package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithRenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RenderingTimeout_IndefiniteTimeout {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Create an instance of the HTML document
        HTMLDocument document = new HTMLDocument();

        // Async loading of the external html file
        document.navigate($i("input.html"));

        // Create a renderer and output device
        HtmlRenderer renderer = new HtmlRenderer();
        ImageDevice device = new ImageDevice($o("document.png"));

        // Delay the rendering indefinitely until there are no scripts or any other internal tasks to execute
        renderer.render(device, -1l, document);
    }
}