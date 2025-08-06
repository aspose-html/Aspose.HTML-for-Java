package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.saving.XpsSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class EPUBtoXPS_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET EPUBtoXPS_1
        // Source EPUB document
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));
        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        options.setBackgroundColor(Color.getCyan());
        // Output file path
        String outputFile = $o("EPUBtoXPS_Output.xps");
        // Convert EPUB to XPS
        Converter.convertEPUB(fileInputStream, options, outputFile);
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("EPUBtoXPS_Output.xps")));

    }
}