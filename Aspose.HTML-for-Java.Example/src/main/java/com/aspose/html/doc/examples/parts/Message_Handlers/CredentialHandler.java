package com.aspose.html.doc.examples.parts.Message_Handlers;
// @START_SNIPPET MessageHandlers_CredentialHandler

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;

public class CredentialHandler extends MessageHandler {
    @Override
    public void invoke(INetworkOperationContext context) {
        context.getRequest().setPreAuthenticate(true);

        invoke(context);
    }
}
// @END_SNIPPET
