package com.aspose.html.examples.Converting_Between_Formats;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.MHTMLSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class HTMLtoMHTML_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToMHtml.java
        // Convert HTML to MHTML in Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-mhtml/

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($i("drawing.html"));

        // Initialize MHTMLSaveOptions
        MHTMLSaveOptions options = new MHTMLSaveOptions();

        // Convert HTML to MHTML
        Converter.convertHTML(document, options, $o("drawing-output.mht"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}