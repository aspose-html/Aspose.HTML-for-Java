package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.LogMessageHandler;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.services.INetworkService;

import java.io.IOException;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class NetworkService {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET EnvironmentConfiguration_NetworkService
        // Prepare HTML code with missing image file
        String code = "<img src='missing.jpg'>";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add ErrorMessageHandler to the chain of existing message handlers
        INetworkService network = configuration.getService(INetworkService.class);
        LogMessageHandler logHandler = new LogMessageHandler();
        network.getMessageHandlers().addItem(logHandler);

        // Initialize an HTML document with specified configuration
        // During the document loading, the application will try to load the image and we will see the result of this operation in the console
        HTMLDocument document = new HTMLDocument($o("document.html"), configuration);

        // Convert HTML to PNG
        Converter.convertHTML(document, new ImageSaveOptions(), $o("output.png"));
        // @END_SNIPPET
    }
}
