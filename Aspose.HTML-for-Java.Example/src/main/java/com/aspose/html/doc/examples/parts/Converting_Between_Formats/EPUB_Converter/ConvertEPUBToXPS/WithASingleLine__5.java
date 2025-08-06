package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToXPS;

import com.aspose.html.converters.Converter;
import com.aspose.html.saving.XpsSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine__5 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToXPS_WithASingleLine
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Invoke the ConvertEPUB() method to convert EPUB to XPS
        Converter.convertEPUB(fileInputStream, new XpsSaveOptions(), $o("convert-by-two-lines.xps"));
        // @END_SNIPPET
        Assertions.assertTrue(File.exists($o("convert-by-two-lines.xps")));
    }
}
