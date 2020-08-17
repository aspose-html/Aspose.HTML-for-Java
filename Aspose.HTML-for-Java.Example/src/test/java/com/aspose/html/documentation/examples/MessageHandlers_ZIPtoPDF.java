package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_ZIPtoPDF {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_ZIPtoPDF
        // Prepare path to a source zip file
        String documentPath = "input/test.zip";

        // Prepare path for converted file saving
        String savePath = "output/zip-to-pdf.pdf";

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the LogMessageHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        handlers.insertItem(0, new ZIPArchiveMessageHandler(documentPath));

        HTMLDocument document = new HTMLDocument("zip:///test.html", configuration);

        // Create the PDF Device
        PdfDevice device = new PdfDevice(savePath);

        // Render ZIP to PDF
        document.renderTo(device);
        // END_SNIPPET
    }
}
