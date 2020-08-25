package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertHTMLToPDF_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Create an instance of MemoryStreamProvider
        try (var streamProvider = new MemoryStreamProvider()) {
            // Initialize an HTML document
            var document = new com.aspose.html.HTMLDocument("<span>Hello World!!</span>", ".");
            try {
                // Convert HTML to PDF by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertHTML(
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