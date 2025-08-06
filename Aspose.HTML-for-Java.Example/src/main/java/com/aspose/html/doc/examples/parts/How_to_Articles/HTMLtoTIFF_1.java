package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLtoTIFF_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET HTMLtoTIFF_1
        // Source HTML document
        HTMLDocument htmlDocument = new HTMLDocument($i("input.html"));
        // Initialize ImageSaveOptions
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Tiff);
        // Output file path
        String outputFile = $o("HTMLtoPNG_Output.tif");
        // Convert HTML to TIFF
        Converter.convertHTML(htmlDocument, options, outputFile);
        // @END_SNIPPET
    }
}