package com.aspose.html.samples.benchmark;

import java.io.IOException;

class MemoryStreamProvider implements java.io.Closeable {
    // List of InputStream objects created during the document rendering
    public java.util.List<java.io.InputStream> lStream = new java.util.ArrayList<>();

    @Override
    public void close() throws IOException {
        for (java.io.InputStream stream : lStream) {
            stream.close();
        }
    }
}
