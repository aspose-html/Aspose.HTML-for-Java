package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToImage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertHTMLToBMP {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToImage_ConvertHTMLToBMP
        // Prepare HTML code and save it to a file
        String code = "<span>Hello,</span> <span>World!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("bmp.html"))) {
            fileWriter.write(code);
        }

        // Initialize an HTML document from the file
        HTMLDocument document = new HTMLDocument($o("bmp.html"));

        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Bmp);

        // Convert HTML to BMP
        Converter.convertHTML(document, options, $o("bmp-output.bmp"));
        // @END_SNIPPET
    }
}
