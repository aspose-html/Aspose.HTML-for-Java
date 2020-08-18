package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToXPS_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Open an existing EPUB file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Create an instance of MemoryStreamProvider
            try (var streamProvider = new MemoryStreamProvider()) {
                // Convert EPUB to XPS by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertEPUB(
                        fileInputStream,
                        new com.aspose.html.saving.XpsSaveOptions(),
                        streamProvider.lStream
                );

                // Get access to the memory stream that contains the resulted data
                var inputStream = streamProvider.lStream.stream().findFirst().orElseThrow();

                // Flush the result data to the output file
                try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "output.xps")) {
                    byte[] buffer = new byte[inputStream.available()];
                    inputStream.read(buffer);
                    fileOutputStream.write(buffer);
                }
            }
        }
    }
}