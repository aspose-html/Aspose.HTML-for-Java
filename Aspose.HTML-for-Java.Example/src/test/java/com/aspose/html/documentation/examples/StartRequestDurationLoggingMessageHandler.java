package com.aspose.html.documentation.examples;

import com.aspose.html.net.INetworkOperationContext;

// START_SNIPPET MessageHandlers_StartRequestDurationLoggingMessageHandler
public class StartRequestDurationLoggingMessageHandler extends RequestDurationLoggingMessageHandler {

    @Override
    public void invoke(INetworkOperationContext context) {
        // Start the stopwatch
        startTimer(context.getRequest().getRequestUri());

        // Invoke the next message handler in the chain
        invoke(context);
    }
}
// END_SNIPPET
