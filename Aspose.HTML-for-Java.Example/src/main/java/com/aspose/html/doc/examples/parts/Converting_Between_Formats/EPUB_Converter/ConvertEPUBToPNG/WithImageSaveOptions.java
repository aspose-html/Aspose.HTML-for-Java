package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPNG;

import com.aspose.html.SmoothingMode;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Resolution;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithImageSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToPNG_WithImageSaveOptions
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions();
        options.setBackgroundColor(Color.getAliceBlue());
        options.setSmoothingMode(SmoothingMode.HighQuality);
        options.setVerticalResolution(Resolution.to_Resolution(400));
        options.setHorizontalResolution(Resolution.to_Resolution(400));

        // Call the convertEPUB() method to convert EPUB to PNG
        Converter.convertEPUB(fileInputStream, options, $o("input-options.png"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("input-options.png")));
    }
}
