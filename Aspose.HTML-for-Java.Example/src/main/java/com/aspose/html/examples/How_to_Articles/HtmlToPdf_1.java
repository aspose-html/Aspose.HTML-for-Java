package com.aspose.html.examples.How_to_Articles;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class HtmlToPdf_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_Conversion_HtmlToPdf_1.java
        // Convert HTML to PDF
        // Learn more: https://docs.aspose.com/html/java/faq/

        Converter.convertHTML($i("document.html"), new PdfSaveOptions(), $o("output.pdf"));
        // @END_SNIPPET
    }
}