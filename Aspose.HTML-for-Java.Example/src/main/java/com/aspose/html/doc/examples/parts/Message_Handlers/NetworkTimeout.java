package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.INetworkService;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class NetworkTimeout {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_NetworkTimeout
        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Call the INetworkService which contains the functionality for managing network operations
        INetworkService network = configuration.getService(INetworkService.class);

        // Add the TimeoutMessageHandler to the top of existing message handler chain
        network.getMessageHandlers().insertItem(0, new TimeoutMessageHandler());

        // Convert HTML to PDF with customized configuration
        Converter.convertHTML($i("document.html"), configuration, new PdfSaveOptions(), $o("document.pdf"));
        // @END_SNIPPET
    }
}
