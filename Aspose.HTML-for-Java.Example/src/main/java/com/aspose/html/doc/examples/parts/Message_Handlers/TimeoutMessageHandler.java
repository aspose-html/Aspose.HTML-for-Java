package com.aspose.html.doc.examples.parts.Message_Handlers;
// @START_SNIPPET MessageHandlers_TimeoutMessageHandler

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;
import com.aspose.html.utils.TimeSpan;

public class TimeoutMessageHandler extends MessageHandler {

    @Override
    public void invoke(INetworkOperationContext context) {
        context.getRequest().setTimeout(TimeSpan.fromSeconds(1));
        invoke(context);
    }
}
// @END_SNIPPET
