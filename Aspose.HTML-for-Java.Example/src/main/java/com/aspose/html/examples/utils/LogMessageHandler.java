package com.aspose.html.examples.utils;

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;

public class LogMessageHandler extends MessageHandler {
    @Override
    public void invoke(INetworkOperationContext context) {
        System.out.println("Start processing request: " + context.getRequest().getRequestUri());

        // Invoke the next message handler in the chain
        invoke(context);

        System.out.println("Finish processing request: " + context.getRequest().getRequestUri());
    }
}
