package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertEPUBToBMP {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToImage_ConvertEPUBToBMP
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Bmp);

        // Call the convertEPUB() method to convert the EPUB file to BMP
        Converter.convertEPUB(fileInputStream, options, $o("output.bmp"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("output.bmp")));
    }
}