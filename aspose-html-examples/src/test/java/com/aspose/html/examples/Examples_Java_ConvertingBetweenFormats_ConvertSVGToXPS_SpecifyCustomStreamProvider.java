package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToXPS_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
// Create an instance of MemoryStreamProvider
        try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
            // Prepare an SVG code
            String code = "<svg xmlns='http://www.w3.org/2000/svg'>\n" +
                          "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />\n" +
                          "</svg>\n";

            // Initialize an SVG document
            com.aspose.html.dom.svg.SVGDocument document = new com.aspose.html.dom.svg.SVGDocument(code, ".");
            try {
                // Convert SVG to XPS by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertSVG(
                        document,
                        new com.aspose.html.saving.XpsSaveOptions(),
                        streamProvider.lStream
                );

                // Get access to the memory stream that contains the resulted data
                java.io.InputStream inputStream = streamProvider.lStream.stream().findFirst().get();

                // Flush the result data to the output file
                try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(Resources.output("output.xps"))) {
                    byte[] buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);
                    fileOutputStream.write(buffer);
                }
            } finally {
                if (document != null) {
                    document.dispose();
                }
            }
        }
    }
}