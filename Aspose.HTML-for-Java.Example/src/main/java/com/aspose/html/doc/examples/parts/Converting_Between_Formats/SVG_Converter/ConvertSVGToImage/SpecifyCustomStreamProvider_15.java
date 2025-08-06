package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider_15 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToImage_SpecifyCustomStreamProvider
        // Prepare an SVG code and save it to the file
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";

        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Initialize the SVG document
        SVGDocument document = new SVGDocument(code, ".");

        // Convert SVG to Image by using the MemoryStreamProvider
        Converter.convertSVG(document, new ImageSaveOptions(ImageFormat.Jpeg), streamProvider.lStream);

        // Get access to the memory stream that contains the result data
        java.io.InputStream inputStream = streamProvider.lStream.stream().findFirst().get();

        // Flush the result data to the output file
        try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream($o("output.jpg"))) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            fileOutputStream.write(buffer);
        }
        // @END_SNIPPET
    }
}