package com.aspose.html.doc.examples.parts.Converting_Between_Formats.MHTML_Converter.ConvertMHTMLToPDF;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.io.OutputStream;
import com.aspose.html.io.SeekOrigin;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class SpecifyCustomStreamProvider__6 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertMHTMLToPDF_SpecifyCustomStreamProvider
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();

        // Open an existing MHTML file for reading
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));

        // Convert MHTML to PDF by using the MemoryStreamProvider class
        Converter.convertMHTML(fileInputStream, new PdfSaveOptions(), streamProvider);

        // Get access to the memory stream that contains the result data
        OutputStream memory = streamProvider.getStreams().stream().findFirst().get();
        memory.seek(0, SeekOrigin.Begin);

        // Flush the result data to the output file
        java.io.File fs = new java.io.File("stream-provider.pdf");
        FileHelper.save(memory, fs);
        // @END_SNIPPET
        // Assertions.assertTrue(File.exists(savePath));
    }
}
