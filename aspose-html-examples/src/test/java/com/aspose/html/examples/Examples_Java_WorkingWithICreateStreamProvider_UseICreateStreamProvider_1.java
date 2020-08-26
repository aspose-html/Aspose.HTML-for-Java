package com.aspose.html.examples;

public class Examples_Java_WorkingWithICreateStreamProvider_UseICreateStreamProvider_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        String dataDir = RunExamples.getResourcePath();
        // Create a custom StreamProvider based on ICreateStreamProvider interface
        try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
            // Create a simple HTML document
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
            try {
                // Add your first 'hello world' to the document.
                document.getBody().appendChild(document.createTextNode("Hello world!!!"));

                // Convert HTML document to XPS by using the custom StreamProvider
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.XpsSaveOptions(),
                        streamProvider.lStream
                );
                // Get access to the memory stream that contains the result data
                java.io.InputStream inputStream = streamProvider.lStream.stream().findFirst().get();

                // Flush the result data to the output file
                try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(dataDir + "output.xps")) {
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