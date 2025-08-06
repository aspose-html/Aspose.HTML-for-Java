package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPNG;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider__0 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPNG_SpecifyCustomStreamProvider
        // Create an instance of MemoryStreamProvider
        final MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();
        // Prepare SVG code
        String code = "<svg xmlns='http://www.w3.org/2000/svg'>" +
                "<circle cx='50' cy='50' r='40' stroke='black' stroke-width='3' fill='red' />" +
                "</svg>";

        // Convert SVG to PNG using the MemoryStreamProvider
        Converter.convertSVG(code, ".", new ImageSaveOptions(), streamProvider);

        // Get access to the memory stream that contains the result data
        OutputStream memory = streamProvider.getStreams().stream().findFirst().get();
        memory.seek(0, SeekOrigin.Begin);

        // Flush the result data to the output file
        final java.io.File fs = new java.io.File($o("stream-provider.png"));
        FileHelper.save(memory, fs);
        // @END_SNIPPET
        Assert.True(FileHelper.exists($o("stream-provider.png")));
    }
}
