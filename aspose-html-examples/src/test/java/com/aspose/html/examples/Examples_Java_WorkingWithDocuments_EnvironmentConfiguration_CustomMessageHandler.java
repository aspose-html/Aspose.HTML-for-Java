package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_EnvironmentConfiguration_CustomMessageHandler {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        // Prepare an HTML code with missing image file
        var code = "<img src='missing.jpg'>";

        try (var fileWriter = new java.io.FileWriter(dataDir + "document.html")) {
            fileWriter.write(code);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        // Create an instance of Configuration
        var configuration = new com.aspose.html.Configuration();
        try {
            // Add ErrorMessageHandler to the chain of existing message handlers
            var network = configuration.getService(com.aspose.html.services.INetworkService.class);
            network.getMessageHandlers().addItem(new LogMessageHandler());

            // Initialize an HTML document with specified configuration
            // During the document loading, the application will try to load the image and we will see the result of this operation in the console.
            var document = new com.aspose.html.HTMLDocument(dataDir + "document.html", configuration);
            try {
                // Convert HTML to PNG
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.ImageSaveOptions(),
                        dataDir + "output.png"
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