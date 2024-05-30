// START_SNIPPET Advanced_MemoryStreamProvider
package com.aspose.html.documentation.examples;

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
// END_SNIPPET
