package com.aspose.html.documentation.examples;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;
import com.aspose.html.services.INetworkService;

public class MessageHandlers_ZIPtoJPG {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET MessageHandlers_ZIPtoJPG
        // Prepare path to a source zip file
        String documentPath = "input/test.zip";

        // Prepare path for converted file saving
        String savePath = "output/zip-to-jpg.jpg";

        // Create an instance of ZipArchiveMessageHandler
        ZIPArchiveMessageHandler zip = new ZIPArchiveMessageHandler(documentPath);

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
        ImageDevice device = new ImageDevice(options, savePath);

        // Render ZIP to JPG
        document.renderTo(device);
        // END_SNIPPET
    }
}
