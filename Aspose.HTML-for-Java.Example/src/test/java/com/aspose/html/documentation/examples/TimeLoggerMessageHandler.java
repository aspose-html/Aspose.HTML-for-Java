package com.aspose.html.documentation.examples;

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;

// START_SNIPPET MessageHandlers_TimeLoggerMessageHandler

public class TimeLoggerMessageHandler extends MessageHandler {
    @Override
    public void invoke(INetworkOperationContext context) {
        // Start the stopwatch
        long start = System.currentTimeMillis();

        // Invoke the next message handler in the chain
        invoke(context);

        // Stop the stopwatch
        long end = System.currentTimeMillis();

        // Print the result
        System.out.println("Request: " + context.getRequest().getRequestUri());
        System.out.println("Time: " + (end - start) + "ms");
    }
}
// END_SNIPPET