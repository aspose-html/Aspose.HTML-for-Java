package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.services.INetworkService;

import static com.aspose.html.doc.examples.utils.Resources.$i;

public class WebRequestExecution {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_WebRequestExecution
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the TimeLoggerMessageHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        handlers.insertItem(0, new TimeLoggerMessageHandler());

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($i("input.htm"), configuration);
        // @END_SNIPPET
    }
}
