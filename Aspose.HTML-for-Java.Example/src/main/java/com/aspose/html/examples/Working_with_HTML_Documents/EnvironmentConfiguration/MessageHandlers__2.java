package com.aspose.html.examples.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;

import java.io.IOException;
import java.net.HttpURLConnection;

public class MessageHandlers__2 {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_MessageHandlerToLogFailedRequests.java
        // Log failed HTTP requests with a custom MessageHandler
        // Learn more: https://docs.aspose.com/html/java/environment-configuration/

        // Message handler logs all failed requests to the console
        class LogMessageHandler extends MessageHandler {

            @Override
            public void invoke(INetworkOperationContext context) {
                int statusCode = context.getResponse().getStatusCode();

                if (statusCode < 200 || statusCode >= 300) {
                    System.out.println(String.format(
                            "Resource '%s' returned HTTP status %d.",
                            context.getRequest().getRequestUri(),
                            statusCode));
                }

                // Invoke the next message handler in the chain
                next(context);
            }
        }
        // @END_SNIPPET
    }
}