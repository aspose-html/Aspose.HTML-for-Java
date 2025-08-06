package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMHTML;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.MHTMLSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertHTMLDocumentToMHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToMHTML_ConvertHTMLDocumentToMHTML
        // Prepare HTML code and save it to a file
        String code = "<span>Hello, World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($o("document.html"));

        // Initialize MHTMLSaveOptions
        MHTMLSaveOptions options = new MHTMLSaveOptions();

        // Convert HTML to MHTML
        Converter.convertHTML(document, options, $o("output.mht"));
        // @END_SNIPPET
    }
}
