package com.aspose.html.documentation.examples;

public class Advanced_MemoryStreamToFile {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET Advanced_MemoryStreamToFile
        // @md products/html/en/java/advanced-programming/output-streams/_index.md
        // Create an instance of MemoryStreamProvider
        MemoryStreamProvider streamProvider = new MemoryStreamProvider();

        // Initialize an HTMLDocument instance
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<span>Hello World!!</span>");

        // Convert HTML to JPG using the MemoryStreamProvider
        com.aspose.html.converters.Converter.convertHTML(document, new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg), streamProvider.lStream);

        // Get access to the memory stream that contains the result data
        java.io.InputStream memory = streamProvider.lStream.get(0);
        memory.reset();

        // Flush the result data to the output file
        java.io.FileOutputStream fs = new java.io.FileOutputStream("output.jpg");
        java.nio.file.Files.copy(memory, new java.io.File("output.jpg").toPath());
        // END_SNIPPET
    }
}
