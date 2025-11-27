package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertHTMLDocumentToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToPdf.java
        // Convert HTML to PDF using Java
        // Learn more: https://docs.aspose.com/html/java/html-to-pdf-converter/

        // Prepare HTML code and save it to a file
        String code = "<span>Hello, World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("link-to-incoming-document.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($o("link-to-incoming-document.html"));

        // Initialize PdfSaveOptions
        PdfSaveOptions options = new PdfSaveOptions();

        // Convert HTML to PDF
        Converter.convertHTML(document, options, $o("document-output.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}