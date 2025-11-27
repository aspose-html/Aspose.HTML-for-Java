package com.aspose.html.examples;

import com.aspose.html.io.ICreateOutputStreamProvider;
import com.aspose.html.io.MemoryOutputStream;
import com.aspose.html.io.OutputStream;

import java.util.Iterator;
import java.util.List;

public class MemoryOutputStreamProvider
        implements java.io.Closeable,
        ICreateOutputStreamProvider {

    // List of InputStream objects created during the document rendering
    public java.util.List<java.io.InputStream> lStream = new java.util.ArrayList<>();
    private java.util.List<OutputStream> outpuStreamList = new java.util.ArrayList<>();

    @Override
    public void close()
            throws
            java.io.IOException {
        for (java.io.InputStream stream : lStream) {
            stream.close();
        }
        for (OutputStream stream : outpuStreamList) {
            stream.close();
        }
    }

    public List<OutputStream> getStreams() {
        return outpuStreamList;
    }

    @Override
    public OutputStream getOutputStream(
            String name,
            String extension
    ) {
        // This method is called when only one output stream is required, for instance for XPS, PDF or TIFF formats
        MemoryOutputStream result = new MemoryOutputStream();
        getStreams().add(result);
        return OutputStream.fromStream(result);
    }

    @Override
    public OutputStream getOutputStream(
            String name,
            String extension,
            int page
    ) {
        // This method is called when the creation of multiple output streams are required. For instance, during the rendering HTML to list of image files (JPG, PNG, etc.)
        MemoryOutputStream result = new MemoryOutputStream();
        getStreams().add(result);
        return OutputStream.fromStream(result);
    }

    @Override
    public void releaseOutputStream(OutputStream stream) {
        // Here you can release the stream filled with data and, for instance, flush it to the hard-drive
    }

    @Override
    public void dispose() {
        // Releasing resources
        // foreach to while statements conversion
        Iterator tmp0 = (getStreams()).iterator();

        while (tmp0.hasNext()) {
            MemoryOutputStream stream = (MemoryOutputStream) tmp0.next();
            stream.dispose();
        }

    }
}
// @END_SNIPPET

