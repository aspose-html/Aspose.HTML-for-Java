package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToImage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertHTMLToGIF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToGif.java
        // Convert HTML to GIF using Java
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-image/

        // Prepare HTML code and save it to a file
        String code = "<span>Hello,</span> <span>World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("gif.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($o("gif.html"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Gif);

        // Convert HTML to GIF
        Converter.convertHTML(document, options, $o("gif-output.gif"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}