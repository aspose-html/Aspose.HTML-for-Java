package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class MHTMLtoPDF_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET MHTMLtoPDF_1
        // Source MHTML document
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));
        // Initialize pdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();
        options.setJpegQuality(100);
        // Output file path
        String outputFile = $o("MHTMLtoPDF_Output.pdf");
        // Convert MHTML to PDF
        Converter.convertMHTML(fileInputStream, options, outputFile);
        // @END_SNIPPET
    }
}