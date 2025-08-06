package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class EPUBtoPDF_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Conversion_EPUBtoPDF_1
        // Source EPUB document
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));
        // Initialize pdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        String outputFile = $o("EPUBtoPDF_Output.pdf");
        // Convert EPUB to PDF
        Converter.convertEPUB(fileInputStream, options, outputFile);
        //@END_SNIPPET
        Assertions.assertTrue(File.exists($o("EPUBtoPDF_Output.pdf")));
    }
}
