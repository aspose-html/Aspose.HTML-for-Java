package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_CredentialsPipeline {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_CredentialsPipeline
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the CredentialHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();
        handlers.insertItem(0, new CredentialHandler());

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument("https://httpbin.org/basic-auth/username/securelystoredpassword", configuration);
        // END_SNIPPET
    }
}
