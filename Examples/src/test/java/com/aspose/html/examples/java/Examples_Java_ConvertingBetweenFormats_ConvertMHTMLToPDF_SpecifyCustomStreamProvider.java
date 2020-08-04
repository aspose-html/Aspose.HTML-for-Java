package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToPDF_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Open an existing MHTML file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of MemoryStreamProvider
            try (var streamProvider = new MemoryStreamProvider()) {
                // Convert MHTML to PDF by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertMHTML(
                        fileInputStream,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        streamProvider.lStream
                );

                // Get access to the memory stream that contains the resulted data
                var inputStream = streamProvider.lStream.stream().findFirst().orElseThrow();

                // Flush the result data to the output file
                try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "output.pdf")) {
                    byte[] buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);
                    fileOutputStream.write(buffer);
                }
            }
        }
    }
}