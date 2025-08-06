package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPNG;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyPngSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToPNG_SpecifyPngSaveOptions
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Create an instance of the PngSaveOptions with a custom page-size and a background-color.
        ImageSaveOptions options = new ImageSaveOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page();
        anyPage.setSize(
                new Size(
                        Length.fromPixels(3000),
                        Length.fromPixels(1000)
                )
        );
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);
        options.setBackgroundColor(Color.getAliceBlue());

        // Call the ConvertEPUB method to convert the EPUB to PNG.
        Converter.convertEPUB(fileInputStream, options, $o("output.png"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("output.png")));
    }
}
