package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_NetworkTimeout {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_NetworkTimeout
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Call the INetworkService which contains the functionality for managing network operations
        INetworkService network = configuration.getService(INetworkService.class);

        // Add the TimeoutMessageHandler to the top of existing message handler chain
        network.getMessageHandlers().insertItem(0, new TimeoutMessageHandler());

        // Prepare path to a source document file
        String documentPath = "input/document.html";

        // Prepare a path for converted file saving
        String savePath = "output/document.pdf";

        // Convert HTML to PDF with customized configuration
        Converter.convertHTML(documentPath, configuration, new PdfSaveOptions(), savePath);
        // END_SNIPPET
    }
}
