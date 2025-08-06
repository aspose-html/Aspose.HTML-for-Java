package com.aspose.html.doc.examples.parts.Message_Handlers;
// @START_SNIPPET MessageHandlers_CustomeShemaMessageFilter

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageFilter;

public class CustomSchemaMessageFilter extends MessageFilter {

    private String schema;

    CustomSchemaMessageFilter(String schema) {
        this.schema = schema;
    }

    @Override
    public boolean match(INetworkOperationContext context) {
        String protocol = context.getRequest().getRequestUri().getProtocol();
        return (schema + ":").equals(protocol);
    }
}
// @END_SNIPPET
