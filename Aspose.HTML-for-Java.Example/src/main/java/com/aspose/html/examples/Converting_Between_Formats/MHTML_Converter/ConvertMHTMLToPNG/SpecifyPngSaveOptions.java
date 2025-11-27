package com.aspose.html.examples.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToPNG;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;

public class SpecifyPngSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMHtmlToPngWithImageSaveOptions.java
        // Convert MHTML to PNG in Java with custom settings
        // Learn more: https://docs.aspose.com/html/java/convert-mhtml-to-png/

        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Initialize the ImageSaveOptions with a custom page-size and background-color
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Png);
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
        options.setBackgroundColor(Color.getGreen());

        // Call the convertMHTML() method to convert MHTML to PNG
        Converter.convertMHTML(fileInputStream, options, "sample-options.png");
        // @END_SNIPPET
    }
}