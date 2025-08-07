package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToMHTML;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.MHTMLSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine__2 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToMHTML_WithASingleLine
        // Invoke the convertHTML() method to convert HTML code to MHTML file
        Converter.convertHTML("<h1>Hello, Word!</h1>", ".", new MHTMLSaveOptions(), $o("convert-with-single-line.mht"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("convert-with-single-line.mht"));
    }
}
