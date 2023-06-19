package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_WebRequestExecution {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_WebRequestExecution
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the TimeLoggerMessageHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();

        handlers.insertItem(0, new TimeLoggerMessageHandler());

        // Prepare path to a source document file
        String documentPath = "input/input.htm";

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument(documentPath, configuration);
        // END_SNIPPET
    }
}
