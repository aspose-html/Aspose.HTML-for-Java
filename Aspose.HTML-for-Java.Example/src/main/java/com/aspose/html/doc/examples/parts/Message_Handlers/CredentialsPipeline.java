package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.net.MessageHandlerCollection;
import com.aspose.html.services.INetworkService;
import org.junit.jupiter.api.Disabled;

public class CredentialsPipeline {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @Disabled
    @org.junit.jupiter.api.Tag("remote")
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_CredentialsPipeline
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add the CredentialHandler to the chain of existing message handlers
        INetworkService service = configuration.getService(INetworkService.class);
        MessageHandlerCollection handlers = service.getMessageHandlers();
        handlers.insertItem(0, new CredentialHandler());

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument("https://httpbin.org/basic-auth/username/securelystoredpassword", configuration);
        // @END_SNIPPET
    }
}
