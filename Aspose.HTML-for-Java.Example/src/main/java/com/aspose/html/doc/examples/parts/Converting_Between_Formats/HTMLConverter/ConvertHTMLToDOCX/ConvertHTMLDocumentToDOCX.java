package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToDOCX;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.DocSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertHTMLDocumentToDOCX {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToDOCX_ConvertHTMLDocumentToDOCX
        // Initialize an HTML document from a file
        HTMLDocument document = new HTMLDocument($i("canvas.html"));

        // Initialize DocSaveOptions
        DocSaveOptions options = new DocSaveOptions();

        // Convert HTML to DOCX
        Converter.convertHTML(document, options, $o("canvas-output.docx"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
