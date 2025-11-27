package com.aspose.html.examples.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToPNG;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import java.io.FileInputStream;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class WithASingleLine__4 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertEpubToPngInTwoLinesOfCode.java
        // Convert EPUB to PNG using Java
        // Learn more: https://docs.aspose.com/html/java/convert-epub-to-png/

        // Open an existing EPUB file for reading
        FileInputStream inputStream = new FileInputStream($i("input.epub"));

        // Convert EPUB to PNG
        Converter.convertEPUB(inputStream, new ImageSaveOptions(), $o("convert-with-single-line.png"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("convert-with-single-line.png")));
    }
}