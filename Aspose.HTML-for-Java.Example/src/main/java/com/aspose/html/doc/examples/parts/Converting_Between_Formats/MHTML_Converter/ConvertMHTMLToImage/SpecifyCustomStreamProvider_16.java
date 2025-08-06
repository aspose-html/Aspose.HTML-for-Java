package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToImage;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class SpecifyCustomStreamProvider_16 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToImage_SpecifyCustomStreamProvider
        // Open an existing MHTML file for reading
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Convert MHTML to JPG by using the MemoryStreamProvider class
        Converter.convertMHTML(fileInputStream, new ImageSaveOptions(ImageFormat.Jpeg), streamProvider);

        // Get access to the memory streams that contain the resulted data
        for (int i = 0; i < streamProvider.getStreams().size(); i++) {
            OutputStream memory = streamProvider.getStreams().get(i);
            memory.seek(0, SeekOrigin.Begin);

            // Flush the page to the output file
            java.io.File fs = new java.io.File("stream-provider.jpg");
            FileHelper.save(memory, fs);
        }
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
