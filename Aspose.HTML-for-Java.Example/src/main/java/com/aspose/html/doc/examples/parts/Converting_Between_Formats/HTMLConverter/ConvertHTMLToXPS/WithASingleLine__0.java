package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine__0 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToXPS_WithASingleLine
        // Invoke the convertHTML() method to convert HTML to XPS
        Converter.convertHTML("<h1>Convert HTML to XPS!</h1>", ".", new XpsSaveOptions(), $o("convert-with-single-line.xps"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("convert-with-single-line.xps"));
    }
}
