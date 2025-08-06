package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class ConvertMHTMLToJPG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToImage_ConvertMHTMLToJPG
        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Create an instance of the ImageSaveOptions class
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);

        // Call the convertMHTML() method to convert MHTML to JPG
        Converter.convertMHTML(fileInputStream, options, "sample-output.jpg");
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("sample-output.jpg"));
    }
}
