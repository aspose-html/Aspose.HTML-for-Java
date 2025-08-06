package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class MHTMLtoXPS_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET MHTMLtoXPS_1
        // Source EPUUB document
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));
        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        options.setBackgroundColor(Color.getCyan());
        // Output file path
        String outputFile = $o("MHTMLtoXPS_Output.xps");
        // Convert MHTML to XPS
        Converter.convertMHTML(fileInputStream, options, outputFile);
        // @END_SNIPPET
    }
}