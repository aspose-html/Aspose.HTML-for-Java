package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithICreateStreamProvider_UseICreateStreamProvider_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Create a custom StreamProvider based on ICreateStreamProvider interface
        try (var streamProvider = new MemoryStreamProvider()) {
            // Create a simple HTML document
            var document = new com.aspose.html.HTMLDocument();
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
                var inputStream = streamProvider.lStream.stream().findFirst().orElseThrow();

                // Flush the result data to the output file
                try (var fileOutputStream = new java.io.FileOutputStream(dataDir + "output.xps")) {
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