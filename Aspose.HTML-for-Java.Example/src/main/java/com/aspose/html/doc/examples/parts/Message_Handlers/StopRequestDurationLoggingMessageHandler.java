package com.aspose.html.doc.examples.parts.Message_Handlers;
// @START_SNIPPET MessageHandlers_StopRequestDurationLoggingMessageHandler

import com.aspose.html.net.INetworkOperationContext;

public class StopRequestDurationLoggingMessageHandler extends RequestDurationLoggingMessageHandler {

    @Override
    public void invoke(INetworkOperationContext context) {
        // Start the stopwatch
        stopTimer(context.getRequest().getRequestUri());

        // Invoke the next message handler in the chain
        invoke(context);
    }
}
// @END_SNIPPET
