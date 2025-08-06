package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.saving.XpsSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyXpsSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToXPS_SpecifyXpsSaveOptions
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Create an instance of XpsSaveOptions. Set up the page-size and change the background color to LightGray
        XpsSaveOptions options = new XpsSaveOptions();
        options.setBackgroundColor(Color.getLightGray());
        options.getPageSetup().setAnyPage(new Page());
        options.getPageSetup().getAnyPage().setSize(new Size(Length.fromPixels(500), Length.fromPixels(500)));

        // Call the convertEPUB() method
        Converter.convertEPUB(fileInputStream, options, $o("input-options.xps"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("input-options.xps")));
    }
}
