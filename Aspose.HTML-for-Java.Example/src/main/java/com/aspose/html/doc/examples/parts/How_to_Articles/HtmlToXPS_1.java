package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HtmlToXPS_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HtmlToXPS_1
        // Source HTML document
        HTMLDocument htmlDocument = new HTMLDocument($i("input.html"));
        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        options.setBackgroundColor(Color.getCyan());
        // Output file path
        String outputFile = $o("output.html.to.xps");
        // Convert HTML to XPS
        Converter.convertHTML(htmlDocument, options, outputFile);
        // @END_SNIPPET
    }
}