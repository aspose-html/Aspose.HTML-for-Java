package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToXPS;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertHTMLDocumentToXPS {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToXPS_ConvertHTMLDocumentToXPS
        // Prepare HTML code and save it to a file
        String code = "<span>Hello, World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Initialize XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        // Convert HTML to XPS
        Converter.convertHTML(document, options, $o("document-output.xps"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
