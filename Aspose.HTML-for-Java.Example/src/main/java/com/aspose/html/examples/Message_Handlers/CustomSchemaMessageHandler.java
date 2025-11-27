package com.aspose.html.examples.Message_Handlers;

import com.aspose.html.net.MessageHandler;

// @START_SNIPPET Example_CustomSchemaMessageHandler.java
// Create custom MessageHandler with schema filter in Aspose.HTML for Java

public abstract class CustomSchemaMessageHandler extends MessageHandler {

    protected CustomSchemaMessageHandler(String schema) {
        getFilters().addItem(new CustomSchemaMessageFilter(schema));
    }
}
// @END_SNIPPET
