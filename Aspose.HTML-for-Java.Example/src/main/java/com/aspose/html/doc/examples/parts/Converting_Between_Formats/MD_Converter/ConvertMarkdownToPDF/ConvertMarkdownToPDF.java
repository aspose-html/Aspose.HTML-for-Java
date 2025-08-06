package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MD_Converter.ConvertMarkdownToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertMarkdownToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertingBetweenFormats_ConvertMarkdownToPDF
        // Prepare a simple Markdown example
        String code = "### Hello, World! \n\n" +
                "[visit applications](https://products.aspose.app/html/applications)";

        // Create a Markdown file
        FileHelper.writeAllText($o("document.md"), code);

        // Convert Markdown to HTML
        HTMLDocument document = Converter.convertMarkdown($o("document.md"));

        // Convert the HTML document to PDF file format
        Converter.convertHTML(document, new PdfSaveOptions(), $o("document-output.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
