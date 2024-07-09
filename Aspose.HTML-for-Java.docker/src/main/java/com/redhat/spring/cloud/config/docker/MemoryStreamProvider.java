package com.redhat.spring.cloud.config.docker;

public class MemoryStreamProvider
        implements java.io.Closeable {

    public java.util.List<java.io.InputStream> lStream = new java.util.ArrayList<>();

    @Override
    public void close()
            throws
            java.io.IOException {
        for (java.io.InputStream stream : lStream) {
            stream.close();
        }
    }
}