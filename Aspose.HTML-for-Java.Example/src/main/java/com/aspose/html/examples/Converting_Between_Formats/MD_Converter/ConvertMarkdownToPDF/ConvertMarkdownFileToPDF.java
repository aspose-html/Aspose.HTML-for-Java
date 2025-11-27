package com.aspose.html.examples.Converting_Between_Formats.MD_Converter.ConvertMarkdownToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertMarkdownFileToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMarkdownFileToPdf.java
        // Convert Markdown to PDF using Java
        // Learn more: https://docs.aspose.com/html/java/convert-markdown-to-html/

        // Convert Markdown to HTML
        HTMLDocument document = Converter.convertMarkdown($i("nature.md"));

        // Initialize PdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();

        // Convert the HTML document to PDF file format
        Converter.convertHTML(document, options, $o("nature-output.pdf"));
        // @END_SNIPPET
    }
}