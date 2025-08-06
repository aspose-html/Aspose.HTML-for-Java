package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToImage;

import com.aspose.html.SmoothingMode;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.*;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToImage_SpecifyImageSaveOptions
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        options.setSmoothingMode(SmoothingMode.HighQuality);
        options.setHorizontalResolution(Resolution.to_Resolution(400));
        options.setVerticalResolution(Resolution.to_Resolution(400));
        options.setBackgroundColor(Color.getAliceBlue());
        options.getPageSetup().setAnyPage(new Page(new Size(800, 500), new Margin(30, 20, 10, 10)));

        // Convert EPUB to JPG
        Converter.convertEPUB(fileInputStream, options, $o("input-options.jpg"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("input-options.jpg")));
    }
}
