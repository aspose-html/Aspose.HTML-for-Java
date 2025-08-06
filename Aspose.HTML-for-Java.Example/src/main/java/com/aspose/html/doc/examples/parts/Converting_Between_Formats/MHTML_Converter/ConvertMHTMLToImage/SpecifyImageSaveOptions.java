package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToImage_SpecifyImageSaveOptions
        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Initialize the ImageSaveOptions with a custom page-size and background color
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        options.setBackgroundColor(Color.getGreen());
        options.getPageSetup().setAnyPage(new Page());
        options.getPageSetup().getAnyPage().setSize(new Size(Length.fromPixels(1000), Length.fromPixels(500)));

        // Call the convertMHTML() method to convert MHTML to JPG
        Converter.convertMHTML(fileInputStream, options, "sample-options.jpg");
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
