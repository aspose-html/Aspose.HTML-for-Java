package com.aspose.html.examples.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPNG;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertHTMLDocumentToPNG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToPngImage.java
        // Convert HTML to PNG in Java
        // Learn more: https://docs.aspose.com/html/java/html-converter/

        // Initialize an HTML document from a file
        HTMLDocument document = new HTMLDocument($i("nature.html"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Png);

        // Convert HTML to PNG
        Converter.convertHTML(document, options, $o("nature-output.png"));
        // @END_SNIPPET
    }
}