package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToDOCX;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.saving.DocSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyDocxSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToDocxWithDocSaveOptions.java
        // Convert HTML to DOCX in Java with custom page size and margins
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-docx/

        // Initialize an HTML document from a file
        HTMLDocument document = new HTMLDocument($i("canvas.html"));

        // Initialize DocSaveOptions. Set up the pag size 600x400 pixels and margins
        DocSaveOptions options = new DocSaveOptions();
        options.getPageSetup().setAnyPage(new Page(new Size(600, 400), new Margin(10, 10, 10, 10)));

        // Convert HTML to DOCX
        Converter.convertHTML(document, options, $o("canvas-output-options.docx"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }

}