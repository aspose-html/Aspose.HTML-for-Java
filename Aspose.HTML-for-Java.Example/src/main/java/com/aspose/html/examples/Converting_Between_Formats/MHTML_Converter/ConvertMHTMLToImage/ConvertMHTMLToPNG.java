package com.aspose.html.examples.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;

public class ConvertMHTMLToPNG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMHtmlToPng.java
        // Convert MHTML to PNG using Java
        // Learn more: https://docs.aspose.com/html/java/convert-mhtml-to-png/

        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Png);

        // Call the convertMHTML() method to convert MHTML to PNG
        Converter.convertMHTML(fileInputStream, options, "sample-output.png");
        // @END_SNIPPET
    }
}