package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_Pipeline {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_Pipeline
        // Prepare path to a source zip file
        String documentPath = "input/test.zip";

        // Prepare path for converted file saving
        String savePath = "output/zip-to-pdf-duration.pdf";

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        // Custom Schema: ZIP. Add ZipFileSchemaMessageHandler to the end of the pipeline
        handlers.addItem(new ZIPFileSchemaMessageHandler(documentPath));

        // Duration Logging. Add the StartRequestDurationLoggingMessageHandler at the first place in the pipeline
        handlers.insertItem(0, new StartRequestDurationLoggingMessageHandler());

        // Add the StopRequestDurationLoggingMessageHandler to the end of the pipeline
        handlers.addItem(new StopRequestDurationLoggingMessageHandler());

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument("zip-file:///test.html", configuration);

        // Create the PDF Device
        PdfDevice device = new PdfDevice(savePath);

        // Render ZIP to PDF
        document.renderTo(device);
        // END_SNIPPET
    }
}
