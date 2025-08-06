package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToXPS;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider__2 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToXPS_SpecifyCustomStreamProvider
        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Initialize an HTML document
        HTMLDocument document = new HTMLDocument("<h1>Convert HTML to XPS File Format!</h1>", ".");

        // Convert HTML to XPS using the MemoryStreamProvider
        Converter.convertHTML(document, new XpsSaveOptions(), streamProvider);

        // Get access to the memory stream that contains the result data
        OutputStream memory = streamProvider.getStreams().stream().findFirst().get();
        memory.seek(0, SeekOrigin.Begin);

        // Flush the result data to the output file
        java.io.File fs = new java.io.File($o("stream-provider.xps"));
        FileHelper.save(memory, fs);
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("stream-provider.xps"));
    }
}
