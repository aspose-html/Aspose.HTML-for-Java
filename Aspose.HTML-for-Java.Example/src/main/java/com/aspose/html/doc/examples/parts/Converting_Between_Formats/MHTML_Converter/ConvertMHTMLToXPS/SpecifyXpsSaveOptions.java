package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToXPS_SpecifyXpsSaveOptions
        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Create an instance of XpsSaveOptions. Set up a page-size and change the background color to AliceBlue
        XpsSaveOptions options = new XpsSaveOptions();
        options.getPageSetup().setAnyPage(new Page(new Size(Length.fromInches(8.3f), Length.fromInches(5.8f))));
        options.setBackgroundColor(Color.getAliceBlue());

        // Call the convertMHTML() method to convert MHTML to XPS
        Converter.convertMHTML(fileInputStream, options, "sample-options.xps");
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
