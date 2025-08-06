package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithICreateStreamProvider;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.parts.MemoryOutputStreamProvider;
import com.aspose.html.saving.XpsSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class UseICreateStreamProvider_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // Create a custom StreamProvider based on ICreateOutputStreamProvider interface
        MemoryOutputStreamProvider streamProvider = new MemoryOutputStreamProvider();
        // Create a simple HTML document
        HTMLDocument document = new HTMLDocument();
        // Add your first 'hello world' to the document.
        document.getBody().appendChild(document.createTextNode("Hello world!!!"));

        // Convert HTML document to XPS by using the custom StreamProvider
        Converter.convertHTML(document, new XpsSaveOptions(), streamProvider.lStream);
        // Get access to the memory stream that contains the result data
        java.io.InputStream inputStream = streamProvider.lStream.stream().findFirst().get();

        // Flush the result data to the output file
        try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream($o("output.xps"))) {
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            fileOutputStream.write(buffer);
        }
    }
}