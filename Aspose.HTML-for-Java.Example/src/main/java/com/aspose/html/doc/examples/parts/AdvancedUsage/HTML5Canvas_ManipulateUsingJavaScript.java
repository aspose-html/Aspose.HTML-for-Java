package com.aspose.html.doc.examples.parts.AdvancedUsage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTML5Canvas_ManipulateUsingJavaScript {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTML5Canvas_ManipulateUsingJavaScript
        // Prepare a document with HTML5 Canvas inside and save it to the file 'document.html'
        String code = "< canvas id = myCanvas width = '200' height = '100' style = 'border:1px solid #d3d3d3;' ></canvas >\n" +
                "<script >\n" +
                "    var c = document.getElementById('myCanvas');\n" +
                "    var context = c.getContext('2d');\n" +
                "    context.font = '20px Arial';\n" +
                "    context.fillStyle = 'red';\n" +
                "    context.fillText('Hello, World', 40, 50);\n" +
                "</script >\n";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the html file
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("output.pdf"));
        //@END_SNIPPET
    }
}
