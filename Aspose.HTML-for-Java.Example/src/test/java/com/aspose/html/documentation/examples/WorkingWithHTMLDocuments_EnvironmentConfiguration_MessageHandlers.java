package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_MessageHandlers {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_MessageHandlers
        // @md products/html/en/java/working-with-documents/environment-configuration/_index.md
        // @code-snippet6

// Create a MessageHandler. This message handler logs all failed requests to the console
MessageHandler handler = new MessageHandler() {
            @Override
    public void invoke(INetworkOperationContext context) {
        if (context.getResponse().getStatusCode() != HttpStatusCode.OK)
                {
                    System.out.println(String.format("File '%s' Not Found", context.getRequest().getRequestUri().toString()));
                }

                // Invoke the next message handler in the chain
        next(context);
            }
        };

        // END_SNIPPET
    }
}
