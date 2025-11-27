package com.aspose.html.examples.Message_Handlers;
// @START_SNIPPET Example_CustomeShemaMessageFilter.java
// Create custom MessageFilter to match specific URL schemas in Aspose.HTML for Java

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
