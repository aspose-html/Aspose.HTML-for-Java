package com.aspose.html.doc.examples.parts.Advanced_Programming;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTML5Canvas {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Advanced_HTML5Canvas
        // Prepare a document with HTML5 Canvas inside and save it to the file "document.html"
        String code = "<canvas id=myCanvas width='200' height='100' style='border:1px solid #d3d3d3;'></canvas>" +
                "<script>" +
                "var c = document.getElementById('myCanvas');" +
                "var context = c.getContext('2d');" +
                "context.font = '20px Arial';" +
                "context.fillStyle = 'red';" +
                "context.fillText('Hello World', 40, 50);" +
                "</script>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the HTML file
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("output.pdf"));
        // @END_SNIPPET
    }
}
