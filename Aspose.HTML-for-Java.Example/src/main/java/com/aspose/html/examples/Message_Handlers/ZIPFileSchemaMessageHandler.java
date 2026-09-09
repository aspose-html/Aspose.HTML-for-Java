package com.aspose.html.examples.Message_Handlers;

import com.aspose.html.MimeType;
import com.aspose.html.net.ByteArrayContent;
import com.aspose.html.net.INetworkOperationContext;
import com.aspose.html.net.ResponseMessage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.net.HttpURLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

// @START_SNIPPET Example_ZipFileSchemaMessageHandler.java
// Create ZIP file schema handler for custom protocols in Aspose.HTML for Java

public class ZIPFileSchemaMessageHandler extends CustomSchemaMessageHandler {
    private String archive;

    public ZIPFileSchemaMessageHandler(String archive) {
        super("zip-file");
        this.archive = archive;
    }

    @Override
    public void invoke(INetworkOperationContext context) {
        String pathInsideArchive = context.getRequest().getRequestUri().getPathname().substring(1).replaceAll("\\\\", "/");
        byte[] fileContent = null;
        try {
            fileContent = GetFile(pathInsideArchive);
        } catch (IOException e) {
            return;
        }

        if (fileContent != null) {
            // Checking: if a resource is found in the archive, then return it as a Response
            ResponseMessage response = new ResponseMessage(HttpURLConnection.HTTP_OK);
            response.setContent(new ByteArrayContent(fileContent));
            response.getHeaders().getContentType().setMediaType(MimeType.fromFileExtension(context.getRequest().getRequestUri().getPathname()));
            context.setResponse(response);
        } else {
            context.setResponse(new ResponseMessage(HttpURLConnection.HTTP_NOT_FOUND));
        }

        // Invoke the next message handler in the chain
        invoke(context);
    }

    byte[] GetFile(String path) throws IOException {
        try (ZipFile zipFile = new ZipFile(Paths.get(archive).toFile())) {
            ZipEntry entry = zipFile.getEntry(path);

            if (entry == null) {
                return null;
            }

            try (InputStream inputStream = zipFile.getInputStream(entry);
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                byte[] buffer = new byte[8192];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }

                return outputStream.toByteArray();
            }
        }
    }
}
// @END_SNIPPET
