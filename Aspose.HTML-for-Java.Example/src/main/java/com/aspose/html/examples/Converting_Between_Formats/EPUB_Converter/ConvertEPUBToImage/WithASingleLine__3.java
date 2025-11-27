package com.aspose.html.examples.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class WithASingleLine__3 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertEpubToJpgInTwoLinesOfCode.java
        // Convert EPUB to JPG using Java
        // Learn more: https://docs.aspose.com/html/java/convert-epub-to-jpg/

        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Invoke the convertEPUB() method to convert EPUB to JPG
        Converter.convertEPUB(fileInputStream, new ImageSaveOptions(ImageFormat.Jpeg), $o("convert-in-two-lines.jpg"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("convert-in-two-lines.jpg")));
    }
}