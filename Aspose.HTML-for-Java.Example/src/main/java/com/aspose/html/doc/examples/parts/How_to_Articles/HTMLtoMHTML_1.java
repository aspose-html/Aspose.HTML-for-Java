package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.MHTMLSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLtoMHTML_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLtoMHTML_1
        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($i("drawing.html"));

        // Initialize MHTMLSaveOptions
        MHTMLSaveOptions options = new MHTMLSaveOptions();

        // Convert HTML to MHTML
        Converter.convertHTML(document, options, $o("drawing-output.mht"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
