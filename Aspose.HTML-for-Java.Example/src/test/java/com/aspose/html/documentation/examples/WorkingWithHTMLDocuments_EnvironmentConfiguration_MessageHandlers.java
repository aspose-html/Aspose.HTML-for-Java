package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_MessageHandlers {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_MessageHandlers
        // Prepare an HTML code with missing image file
        String code = "<img src='missing.jpg'>";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter("document.html")) {
            fileWriter.write(code);
        }

        // Create MessageHandler
        com.aspose.html.net.MessageHandler handler = new com.aspose.html.net.MessageHandler() {
            @Override
            public void invoke(com.aspose.html.net.INetworkOperationContext context) {
                if (context.getResponse().getStatusCode() != 200)
                {
                    System.out.println(String.format("File '%s' Not Found", context.getRequest().getRequestUri().toString()));
                }

                // Invoke the next message handler in the chain
                invoke(context);
            }
        };

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Add ErrorMessageHandler to the chain of existing message handlers
            com.aspose.html.services.INetworkService network = configuration.getService(com.aspose.html.services.INetworkService.class);
            network.getMessageHandlers().addItem(handler);

            // Initialize an HTML document with specified configuration
            // During the document loading, the application will try to load the image and we will see the result of this operation in the console.
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("document.html", configuration);
            try {
                // Convert HTML to PNG
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.ImageSaveOptions(),
                        "output.png"
                );
            } finally {
                if (document != null) {
                    document.dispose();
                }
            }
        } finally {
            if (configuration != null) {
                configuration.dispose();
            }
        }
        // END_SNIPPET
    }
}
