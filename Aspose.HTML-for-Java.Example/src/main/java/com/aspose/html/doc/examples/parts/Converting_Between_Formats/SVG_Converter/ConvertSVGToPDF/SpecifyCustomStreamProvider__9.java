package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider__9 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPDF_SpecifyCustomStreamProvider
        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Prepare an SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                "</svg>\n";

        // Initialize an SVG document
        SVGDocument document = new SVGDocument(code, ".");

        // Convert SVG to PDF by using the MemoryStreamProvider
        Converter.convertSVG(document, new PdfSaveOptions(), streamProvider.lStream);

        // Get access to the memory stream that contains the result data
        java.io.InputStream inputStream = streamProvider.lStream.stream().findFirst().get();

        // Flush the result data to the output file
        try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream($o("output.pdf"))) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            fileOutputStream.write(buffer);
        }
        // @END_SNIPPET
    }
}
