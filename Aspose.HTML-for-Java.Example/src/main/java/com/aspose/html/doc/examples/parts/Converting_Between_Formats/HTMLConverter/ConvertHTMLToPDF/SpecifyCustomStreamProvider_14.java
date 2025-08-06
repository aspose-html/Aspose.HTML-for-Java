package com.aspose.html.doc.examples.parts.Converting_Between_Formats.HTMLConverter.ConvertHTMLToPDF;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyCustomStreamProvider_14 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToPDF_SpecifyCustomStreamProvider
        // Create an instance of MemoryStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Initialize an HTML document
        HTMLDocument document = new HTMLDocument("<h1>Convert HTML to PDF File Format!</h1>", ".");

        // Convert HTML to PDF using the MemoryStreamProvider
        Converter.convertHTML(document, new PdfSaveOptions(), streamProvider);

        // Get access to the memory stream that contains the result data
        OutputStream memory = streamProvider.getStreams().stream().findFirst().get();
        memory.seek(0, SeekOrigin.Begin);

        // Flush the result data to the output file
        java.io.File fs = new java.io.File($o("stream-provider.pdf"));
        FileHelper.save(memory, fs);
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists("stream-provider.pdf"));
    }
}
