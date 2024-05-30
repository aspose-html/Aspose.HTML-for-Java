package com.aspose.html.documentation.examples;

import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageFilter;

// START_SNIPPET MessageHandlers_CustomeShemaMessageFilter
public class CustomSchemaMessageFilter extends MessageFilter {

    private final String schema;

    CustomSchemaMessageFilter(String schema) {
        this.schema = schema;
    }

    @Override
    public boolean match(INetworkOperationContext context) {
        String protocol = context.getRequest().getRequestUri().getProtocol();
        return (schema+":").equals(protocol);
    }
}
// END_SNIPPET
