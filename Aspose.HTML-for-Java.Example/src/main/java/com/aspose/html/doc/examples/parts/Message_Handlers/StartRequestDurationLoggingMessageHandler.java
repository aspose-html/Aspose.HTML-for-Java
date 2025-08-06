package com.aspose.html.doc.examples.parts.Message_Handlers;
// @START_SNIPPET MessageHandlers_StartRequestDurationLoggingMessageHandler

import com.aspose.html.net.INetworkOperationContext;

public class StartRequestDurationLoggingMessageHandler extends RequestDurationLoggingMessageHandler {

    @Override
    public void invoke(INetworkOperationContext context) {
        // Start the stopwatch
        startTimer(context.getRequest().getRequestUri());

        // Invoke the next message handler in the chain
        invoke(context);
    }
}
// @END_SNIPPET
