package com.aspose.html.examples;

/// <summary>
/// This message handler logs all failed requests to the console.
/// </summary>
public class LogMessageHandler extends com.aspose.html.net.MessageHandler {

    public void invoke(com.aspose.html.net.INetworkOperationContext context) {
        // Check whether response is OK
        if (context.getResponse().getStatusCode() != HttpStatus.SC_OK) {
            // Log information to console
            System.out.println("File Not Found: " + context.getRequest().getRequestUri());
        }

        // Invoke the next message handler in the chain.
        //Next(context);
    }

}
