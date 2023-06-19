package com.aspose.html.documentation.examples;

import com.aspose.html.net.INetworkOperationContext;

// START_SNIPPET MessageHandlers_StopRequestDurationLoggingMessageHandler
public class StopRequestDurationLoggingMessageHandler extends RequestDurationLoggingMessageHandler {

    @Override
    public void invoke(INetworkOperationContext context) {
        // Start the stopwatch
        stopTimer(context.getRequest().getRequestUri());

        // Invoke the next message handler in the chain
        a(context);
    }
}
// END_SNIPPET
