package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Create an instance of MemoryStreamProvider
        try (var streamProvider = new MemoryStreamProvider()) {
            // Prepare an SVG code
            var code = """
                    <svg xmlns='http://www.w3.org/2000/svg'>
                    <circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />
                    </svg>
                    """;

            // Initialize an SVG document
            var document = new com.aspose.html.dom.svg.SVGDocument(code, ".");
            try {
                // Convert SVG to PDF by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertSVG(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        streamProvider.lStream
                );

                // Get access to the memory stream that contains the result data
                var inputStream = streamProvider.lStream.stream().findFirst().orElseThrow();

                // Flush the result data to the output file
                try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "output.pdf")) {
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