package com.aspose.html.examples.Message_Handlers;

import com.aspose.html.IDisposable;
import com.aspose.html.MimeType;
import com.aspose.html.examples.utils.StringExtensions;
import com.aspose.html.net.ByteArrayContent;
import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;
import com.aspose.html.net.ResponseMessage;
import com.aspose.html.net.messagefilters.ProtocolMessageFilter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// @START_SNIPPET Example_ZipArchiveMessageHandler.java
// Create ZIP archive message handler for custom protocol in Aspose.HTML for Java

public class ZIPArchiveMessageHandler extends MessageHandler implements IDisposable {

    private String filePath;

    // Initialize an instance of the ZipArchiveMessageHandler class
    public ZIPArchiveMessageHandler(String path) {
        this.filePath = path;
        getFilters().addItem(new ProtocolMessageFilter("zip"));
    }

    @Override
    public void dispose() {

    }

    @Override
    public void invoke(INetworkOperationContext context) {
        String trimmedStart = StringExtensions.trimStart(context.getRequest().getRequestUri().getPathname(), '/');
        Path resourcePath = Paths.get(filePath, trimmedStart);

        if (!Files.exists(resourcePath)) {
            context.setResponse(new ResponseMessage(HttpURLConnection.HTTP_NOT_FOUND));
            invoke(context);
            return;
        }

        try (InputStream inputStream = Files.newInputStream(resourcePath);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            ResponseMessage msg = new ResponseMessage(HttpURLConnection.HTTP_OK);
            msg.setContent(new ByteArrayContent(outputStream.toByteArray()));
            MimeType mimeType = MimeType.fromFileExtension(context.getRequest().getRequestUri().getPathname());
            msg.getHeaders().getContentType().setMediaType(mimeType);
            context.setResponse(msg);
        } catch (IOException e) {
            context.setResponse(new ResponseMessage(HttpURLConnection.HTTP_INTERNAL_ERROR));
        }

        // Call the next message handler
        invoke(context);
    }
}
// @END_SNIPPET
