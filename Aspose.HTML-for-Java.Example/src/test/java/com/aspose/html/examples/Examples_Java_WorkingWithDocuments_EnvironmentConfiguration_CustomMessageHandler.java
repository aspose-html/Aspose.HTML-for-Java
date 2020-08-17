package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_EnvironmentConfiguration_CustomMessageHandler {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code with missing image file
        String code = "<img src='missing.jpg'>";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Add ErrorMessageHandler to the chain of existing message handlers
            com.aspose.html.services.INetworkService network = configuration.getService(com.aspose.html.services.INetworkService.class);
            network.getMessageHandlers().addItem(new LogMessageHandler());

            // Initialize an HTML document with specified configuration
            // During the document loading, the application will try to load the image and we will see the result of this operation in the console.
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("document.html"), configuration);
            try {
                // Convert HTML to PNG
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.ImageSaveOptions(),
                        Resources.output("output.png")
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
    }
}
