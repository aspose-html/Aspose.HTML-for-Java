package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToImage_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an SVG code and save it to the file
        var code = """
                <svg xmlns='http://www.w3.org/2000/svg'>
                <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                </svg>
                """;

        // Create an instance of MemoryStreamProvider
        try (var streamProvider = new MemoryStreamProvider()) {
            // Initialize the SVG document
            var document = new com.aspose.html.dom.svg.SVGDocument(code, ".");
            try {
                // Convert SVG to Image by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertSVG(
                        document,
                        new com.aspose.html.saving.ImageSaveOptions(
                                com.aspose.html.rendering.image.ImageFormat.Jpeg
                        ),
                        streamProvider.lStream
                );

                // Get access to the memory stream that contains the result data
                var inputStream = streamProvider.lStream.stream().findFirst().orElseThrow();

                // Flush the result data to the output file
                try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "output.jpg")) {
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