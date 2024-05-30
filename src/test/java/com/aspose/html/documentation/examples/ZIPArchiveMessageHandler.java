package com.aspose.html.documentation.examples;

import com.aspose.html.IDisposable;
import com.aspose.html.MimeType;
import com.aspose.html.net.ByteArrayContent;
import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.MessageHandler;
import com.aspose.html.net.ResponseMessage;
import com.aspose.html.net.messagefilters.ProtocolMessageFilter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// START_SNIPPET MessageHandlers_ZIPArchiveMessageHandler
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
        // Call the GetFile() method that defines the logic in the Invoke() method
        byte [] buff = new byte[0];
        try {
            buff = Files.readAllBytes(Paths.get(context.getRequest().getRequestUri().getPathname().trim()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (buff != null) {
            // Checking: if a resource is found in the archive, then return it as a Response
            ResponseMessage msg = new ResponseMessage(200);
            msg.setContent(new ByteArrayContent(buff));
            context.getResponse().getHeaders().getContentType().setMediaType(MimeType.fromFileExtension(context.getRequest().getRequestUri().getPathname()));
        }
        else  {
            context.setResponse(new ResponseMessage(404));
        }

        // Call the next message handler
        a(context);
    }
}
// END_SNIPPET
