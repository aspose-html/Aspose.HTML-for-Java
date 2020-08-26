package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_ConvertMHTMLToImage_SpecifyCustomStreamProvider {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Open an existing MHTML file for reading.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(dataDir + "sample.mht")) {
            // Create an instance of MemoryStreamProvider
            try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
                // Convert MHTML to Image by using the MemoryStreamProvider
                com.aspose.html.converters.Converter.convertMHTML(
                        fileInputStream,
                        new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg),
                        streamProvider.lStream
                );

                // Get access to the memory streams that contain the resulted data
                int bound = streamProvider.lStream.size();
                for (int value = 0; value < bound; value++) {
                    // Flush the page to the output file
                    try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(dataDir + "page_{" + (value + 1) + "}.jpg")) {
                        java.io.InputStream inputStream = streamProvider.lStream.get(value);
                        byte[] buffer = new byte[inputStream.available()];
                        inputStream.read(buffer);
                        fileOutputStream.write(buffer);
                    }
                }
            }
        }
    }
}