package com.aspose.html.examples.Advanced_Programming;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.examples.MemoryOutputStreamProvider;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static com.aspose.html.examples.utils.Resources.$o;

public class MemoryStreamToFile {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_ConvertHtmlToJpegUsingMemoryStreamProvider.java
        // Convert HTML to JPEG in memory using Aspose.HTML for Java and save the result to a file
        // Learn more: https://docs.aspose.com/html/java/output-streams/

        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Initialize an HTMLDocument instance
        HTMLDocument document = new HTMLDocument("<span>Hello, World!!</span>", ".");

        // Convert HTML to JPG using the MemoryStreamProvider
        Converter.convertHTML(document, new ImageSaveOptions(ImageFormat.Jpeg), streamProvider.lStream);

        // Get access to the memory stream that contains the result data
        java.io.InputStream memory = streamProvider.lStream.get(0);
        memory.reset();

        // Flush the result data to the output file
        Path outputFile = new File($o("output.jpg")).toPath();
        Files.copy(memory, outputFile, StandardCopyOption.REPLACE_EXISTING);
        // @END_SNIPPET
    }
}