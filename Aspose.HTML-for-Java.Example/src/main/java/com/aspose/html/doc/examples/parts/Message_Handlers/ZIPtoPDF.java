package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.services.INetworkService;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ZIPtoPDF {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_ZIPtoPDF
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the LogMessageHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        handlers.insertItem(0, new ZIPArchiveMessageHandler($i("test.zip")));

        HTMLDocument document = new HTMLDocument("zip:///test.html", configuration);

        // Create the PDF Device
        PdfDevice device = new PdfDevice($o($o("zip-to-pdf.pdf")));

        // Render ZIP to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}
