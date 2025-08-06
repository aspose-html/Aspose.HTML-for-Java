package com.aspose.html.doc.examples.parts.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Url;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.doc.examples.utils.Remote;
import com.aspose.html.net.RequestMessage;
import com.aspose.html.net.ResponseMessage;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class DownloadFileFromWebsite {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Download File From URL")
    @org.junit.jupiter.api.Tag("remote")
    public final void downloadFileFromURLTest() {
        // @START_SNIPPET SaveFileFromURL
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
        // @END_SNIPPET SaveFileFromURL
    }
}

