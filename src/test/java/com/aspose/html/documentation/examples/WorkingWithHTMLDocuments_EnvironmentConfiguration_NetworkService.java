package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_NetworkService {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_NetworkService
        // Prepare an HTML code with missing image file
        String code = "<img src=\"https://docs.aspose.com/svg/net/drawing-basics/filters-and-gradients/park.jpg\" >\r\n" +
                "<img src=\"https://docs.aspose.com/html/net/missing1.jpg\" >\r\n" +
                "<img src=\"https://docs.aspose.com/html/net/missing2.jpg\" >\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter("document.html")) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Add ErrorMessageHandler to the chain of existing message handlers
            com.aspose.html.services.INetworkService network = configuration.getService(com.aspose.html.services.INetworkService.class);
            com.aspose.html.net.MessageHandler logHandler = new LogMessageHandler();
            network.getMessageHandlers().addItem(logHandler);

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
