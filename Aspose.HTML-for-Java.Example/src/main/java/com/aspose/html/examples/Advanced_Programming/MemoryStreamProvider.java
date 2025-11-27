package com.aspose.html.examples.Advanced_Programming;

// @START_SNIPPET Example_MemoryStreamProvider.java
// Implement a memory-based stream provider for handling InputStreams during document rendering in Aspose.HTML for Java
// Learn more: https://docs.aspose.com/html/java/output-streams/

// For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java

public class MemoryStreamProvider implements java.io.Closeable {
    // List of InputStream objects created during the document rendering
    public java.util.List<java.io.InputStream> lStream = new java.util.ArrayList<>();

    @Override
    public void close() throws java.io.IOException {
        for (java.io.InputStream stream : lStream) {
            stream.close();
        }
    }
}
// @END_SNIPPET