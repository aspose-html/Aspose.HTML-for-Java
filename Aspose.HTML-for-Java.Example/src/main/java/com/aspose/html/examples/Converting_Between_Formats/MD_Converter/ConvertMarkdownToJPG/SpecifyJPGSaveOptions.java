package com.aspose.html.examples.Converting_Between_Formats.MD_Converter.ConvertMarkdownToJPG;

import com.aspose.html.HTMLDocument;
import com.aspose.html.SmoothingMode;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.*;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyJPGSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute()
            throws
            Exception {
        // @START_SNIPPET Example_ConvertMarkdownToJpgWithImageSaveOptions.java
        // Convert Markdown to JPG in Java with custom settings
        // Learn more: https://docs.aspose.com/html/java/convert-markdown-to-image/

        // Convert Markdown to HTML
        HTMLDocument document = Converter.convertMarkdown($i("nature.md"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        options.setSmoothingMode(SmoothingMode.HighQuality);
        options.setHorizontalResolution(Resolution.to_Resolution(200));
        options.setVerticalResolution(Resolution.to_Resolution(200));
        options.setBackgroundColor(Color.getAliceBlue());
        options.getPageSetup().setAnyPage(new Page(new Size(600, 950), new Margin(30, 20, 10, 10)));

        // Convert HTML to JPG
        Converter.convertHTML(document, options, $o("nature-options.jpg"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}