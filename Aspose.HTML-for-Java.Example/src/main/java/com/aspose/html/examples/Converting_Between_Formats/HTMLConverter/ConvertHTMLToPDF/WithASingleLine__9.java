package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class WithASingleLine__9 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToPdfInOneLine.java
        // Convert HTML to PDF in one line using Java
        // Learn more: https://docs.aspose.com/html/java/html-to-pdf-converter/

        // Invoke the convertHTML() method to convert the HTML to PDF
        Converter.convertHTML("<h1>Convert HTML to PDF!</h1>", ".", new PdfSaveOptions(), $o("convert-with-single-line.pdf"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("convert-with-single-line.pdf"));
    }
}