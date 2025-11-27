package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToImage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.drawing.*;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToJpgWithImageSaveOptions.java
        // Convert HTML to JPG in Java with with custom background, resolution, and page size settings
        // Learn more: https://docs.aspose.com/html/java/convert-html-to-image/

        // Prepare HTML code and save it to a file
        String code = "<h1>  Image SaveOptions </h1> " +
                "<p>Using ImageSaveOptions Class, you can programmatically apply a wide range of " +
                "conversion parameters such as BackgroundColor, Format, Compression, PageSetup, etc.</p>";

        FileHelper.writeAllText($o("save-options.html"), code);

        // Initialize an HTML Document from the HTML file
        HTMLDocument document = new HTMLDocument($o("save-options.html"));

        // Initialize an ImageSaveOptions object and customize save options
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        options.setHorizontalResolution(new Resolution(200, UnitType.AUTO));
        options.setVerticalResolution(new Resolution(200, UnitType.AUTO));
        options.setBackgroundColor(Color.getAntiqueWhite());
        options.getPageSetup().setAnyPage(new Page(new Size(500, 250), new Margin(40, 40, 20, 20)));

        // Convert HTML to JPG
        Converter.convertHTML(document, options, $o("save-options-output.jpg"));
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}