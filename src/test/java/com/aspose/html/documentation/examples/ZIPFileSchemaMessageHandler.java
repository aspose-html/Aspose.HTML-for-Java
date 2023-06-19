package com.aspose.html.documentation.examples;

import com.aspose.html.MimeType;
import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.ResponseMessage;
import com.aspose.html.net.StreamContent;
import com.aspose.html.utils.Stream;

// START_SNIPPET MessageHandlers_ZIPFileSchemaMessageHandler
public class ZIPFileSchemaMessageHandler extends CustomSchemaMessageHandler {
    private final String archive;

    protected ZIPFileSchemaMessageHandler(String archive) {
        super("zip-file");
        this.archive = archive;
    }

    @Override
    public void invoke(INetworkOperationContext context) {
        String pathInsideArchive = context.getRequest().getRequestUri().getPathname().substring(1).replaceAll("\\\\", "/");
        Stream stream = GetFile(pathInsideArchive);

        if (stream != null)
        {
            // Checking: if a resource is found in the archive, then return it as a Response
            ResponseMessage response = new ResponseMessage(200);
            response.setContent(new StreamContent(stream));
            response.getHeaders().getContentType().setMediaType(MimeType.fromFileExtension(context.getRequest().getRequestUri().getPathname()));
            context.setResponse(response);
        }
        else {
            context.setResponse(new ResponseMessage(404));
        }

        // Invoke the next message handler in the chain
        a(context);
    }

    Stream GetFile(String path) {
        // TODO: discuss here how to get zip stream
        return null;
    }
}
// END_SNIPPET
