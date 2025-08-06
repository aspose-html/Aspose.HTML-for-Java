package com.aspose.html.doc.examples.parts.Converting_Between_Formats.EPUB_Converter.ConvertEPUBToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.utils.ms.System.IO.File;
import org.junit.jupiter.api.Assertions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider_12 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertEPUBToImage_SpecifyCustomStreamProvider
        // Open an existing EPUB file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("input.epub"));

        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Convert HTML to JPG using the MemoryStreamProvider
        Converter.convertEPUB(fileInputStream, new ImageSaveOptions(ImageFormat.Jpeg), streamProvider);

        // Get access to the memory streams that contain the resulted data
        for (int i = 0; i < streamProvider.getStreams().size(); i++) {
            OutputStream memory = streamProvider.getStreams().get(i);
            memory.seek(0, SeekOrigin.Begin);

            // Flush the page to the output file
            java.io.File fs = new java.io.File($o("page_{" + (i + 1) + "}.jpg"));

            FileHelper.save(memory, fs);
            Assertions.assertTrue(File.exists($o("page_{" + (i + 1) + "}.jpg")));
        }
        // @END_SNIPPET

    }
}
