package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MD_Converter.ConvertMarkdownToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertMarkdownFileToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertingBetweenFormats_ConvertMarkdownFileToPDF
        // Convert Markdown to HTML
        HTMLDocument document = Converter.convertMarkdown($i("nature.md"));

        // Initialize PdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();

        // Convert the HTML document to PDF file format
        Converter.convertHTML(document, options, $o("nature-output.pdf"));
        // @END_SNIPPET
    }
}
