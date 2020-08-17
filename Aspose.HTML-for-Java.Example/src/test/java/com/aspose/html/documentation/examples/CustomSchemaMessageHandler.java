package com.aspose.html.documentation.examples;

import com.aspose.html.net.MessageHandler;

// START_SNIPPET MessageHandlers_CustomeShemaMessageHandler
public abstract class CustomSchemaMessageHandler extends MessageHandler {

    protected CustomSchemaMessageHandler(String schema) {
        getFilters().addItem(new CustomSchemaMessageFilter(schema));
    }
}
// END_SNIPPET
