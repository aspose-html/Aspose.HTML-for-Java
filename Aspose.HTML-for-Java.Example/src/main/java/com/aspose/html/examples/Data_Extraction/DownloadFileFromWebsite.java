package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Url;
import com.aspose.html.examples.utils.Assert;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.net.RequestMessage;
import com.aspose.html.net.ResponseMessage;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.examples.utils.Resources.$o;

public class DownloadFileFromWebsite {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Download File From URL")
    @org.junit.jupiter.api.Tag("remote")
    public final void downloadFileFromURLTest() {
        // @START_SNIPPET Example_SaveFileFromUrl.java
        // Download file from URL using Java
        // Learn more: https://docs.aspose.com/html/java/save-file-from-url/

        // Create a blank document; it is required to access the network operations functionality
        final HTMLDocument document = new HTMLDocument();

        // Create a URL with the path to the resource you want to download
        Url url = new Url("https://docs.aspose.com/html/net/message-handlers/message-handlers.png");

        // Create a file request message
        final RequestMessage request = new RequestMessage(url);

        // Download file from URL
        final ResponseMessage response = document.getContext().getNetwork().send(request);

        // Check whether response is successful
        if (response.isSuccess()) {
            String[] split = url.getPathname().split("/");
            String path = split[split.length - 1];

            // Save file to a local file system
            FileHelper.writeAllBytes($o(path), response.getContent().readAsByteArray());

            Assert.True(FileHelper.exists(path));
        }
        // @END_SNIPPET SaveFileFromUrl
    }
}
