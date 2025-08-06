package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RendererTimeoutExample {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_RendererTimeoutExample
        // Prepare HTML code
        String code = "< script >\n" +
                "        var count = 0;\n" +
                "        setInterval(function()\n" +
                "        {\n" +
                "            var element = document.createElement('div');\n" +
                "            var message = (++count) + '. ' + 'Hello, World!!';\n" +
                "            var text = document.createTextNode(message);\n" +
                "            element.appendChild(text);\n" +
                "            document.body.appendChild(element);\n" +
                "        },1000);\n" +
                "</script >\n";

        // Initialize an HTML document based on prepared HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of HTML Renderer
        HtmlRenderer renderer = new HtmlRenderer();

        // Create an instance of the PdfDevice class
        PdfDevice device = new PdfDevice($o("output.pdf"));

        // Render HTML to PDF
        renderer.render(device, 5, document);
        // @END_SNIPPET
    }
}
