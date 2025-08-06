package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine__7 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToImage_WithASingleLine
        // Invoke the convertHTML() method to convert HTML code to image
        Converter.convertHTML(
                "<h1>Convert HTML to JPG!</h1>",
                ".",
                new ImageSaveOptions(ImageFormat.Jpeg),
                $o("convert-with-single-line.jpg")
        );
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("convert-with-single-line.jpg"));
    }
}
