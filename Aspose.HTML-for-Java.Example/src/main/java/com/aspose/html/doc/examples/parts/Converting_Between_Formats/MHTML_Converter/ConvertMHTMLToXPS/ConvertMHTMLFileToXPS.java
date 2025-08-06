package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class ConvertMHTMLFileToXPS {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToXPS_ConvertMHTMLFileToXPS
        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Create an instance of XpsSaveOptions
        XpsSaveOptions options = new XpsSaveOptions();

        // Call the convertMHTML() method to convert MHTML to XPS
        Converter.convertMHTML(fileInputStream, options, "sample-output.xps");
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
