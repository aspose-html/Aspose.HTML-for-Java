package com.aspose.html.documentation.examples;

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;

// START_SNIPPET MessageHandlers_CredentialHandler

public class CredentialHandler extends MessageHandler {
    @Override
    public void invoke(INetworkOperationContext context) {
        // TODO: NetworkCredential is hidden class
//        context.getRequest().setCredentials(new com.aspose.ms.System.Net.NetworkCredential("username", "securelystoredpassword");
        context.getRequest().setPreAuthenticate(true);

        a(context);
    }
}

// END_SNIPPET
