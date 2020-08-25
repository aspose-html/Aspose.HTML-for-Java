package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertEPUBToImage_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Open an existing EPUB file for reading.
        try (var fileInputStream = new java.io.FileInputStream(dataDir + "input.epub")) {
            // Create an instance of MemoryStreamProvider
            try (var streamProvider = new MemoryStreamProvider()) {
                // Convert EPUB to Image by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertEPUB(
                        fileInputStream,
                        new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg),
                        streamProvider.lStream
                );

                // Get access to the memory streams that contain the resulted data
                int size = streamProvider.lStream.size();
                for (int i = 0; i < size; i++) {
                    var inputStream = streamProvider.lStream.get(i);

                    // Flush the page to the output file
                    try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "page_{" + (i + 1) + "}.jpg")) {
                        byte[] buffer = new byte[inputStream.available()];
                        inputStream.read(buffer);
                        fileOutputStream.write(buffer);
                    }
                }
            }
        }
    }
}