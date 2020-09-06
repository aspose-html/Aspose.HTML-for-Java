package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_FromStream {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        java.io.ByteArrayInputStream inputStream = new java.io.ByteArrayInputStream(
                "<p>my first paragraph</p>".getBytes(java.nio.charset.StandardCharsets.UTF_8)
        );
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(inputStream, "about:blank");
        try {
            // do some actions over the document here...
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}