package com.aspose.html.doc.examples.parts.Message_Handlers;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;
import com.aspose.html.services.INetworkService;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ZIPtoJPG {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET MessageHandlers_ZIPtoJPG
        // Create an instance of ZipArchiveMessageHandler
        ZIPArchiveMessageHandler zip = new ZIPArchiveMessageHandler($i("test.zip"));

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Add ZipArchiveMessageHandler to the chain of existing message handlers
        configuration.getService(INetworkService.class).getMessageHandlers().addItem(zip);

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument("zip:///test.html", configuration);

        // Create an instance of Rendering Options
        ImageRenderingOptions options = new ImageRenderingOptions();
        options.setFormat(ImageFormat.Jpeg);

        // Create an instance of Image Device
        ImageDevice device = new ImageDevice(options, $o("zip-to-jpg.jpg"));

        // Render ZIP to JPG
        document.renderTo(device);
        // @END_SNIPPET
    }
}
