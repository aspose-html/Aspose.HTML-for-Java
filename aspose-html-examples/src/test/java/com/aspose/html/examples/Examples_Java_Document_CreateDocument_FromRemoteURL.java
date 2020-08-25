package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_FromRemoteURL {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var document = new com.aspose.html.HTMLDocument("https://www.facebook.com/");
        try {
            // do some actions over the document here...
        } finally {
            document.dispose();
        }
    }
}