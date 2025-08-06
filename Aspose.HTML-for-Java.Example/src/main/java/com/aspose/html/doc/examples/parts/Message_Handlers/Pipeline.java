package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.services.INetworkService;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class Pipeline {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_Pipeline
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        // Custom Schema: ZIP. Add ZipFileSchemaMessageHandler to the end of the pipeline
        handlers.addItem(new ZIPFileSchemaMessageHandler("test.zip"));

        // Duration Logging. Add the StartRequestDurationLoggingMessageHandler at the first place in the pipeline
        handlers.insertItem(0, new StartRequestDurationLoggingMessageHandler());

        // Add the StopRequestDurationLoggingMessageHandler to the end of the pipeline
        handlers.addItem(new StopRequestDurationLoggingMessageHandler());

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument("zip-file:///test.html", configuration);

        // Create the PDF Device
        PdfDevice device = new PdfDevice($o("zip-to-pdf-duration.pdf"));

        // Render ZIP to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}
