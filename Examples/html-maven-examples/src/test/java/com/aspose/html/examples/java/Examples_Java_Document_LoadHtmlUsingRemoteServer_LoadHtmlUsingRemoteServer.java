package com.aspose.html.examples.java;

public class Examples_Java_Document_LoadHtmlUsingRemoteServer_LoadHtmlUsingRemoteServer {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var document = new com.aspose.html.HTMLDocument(
                new com.aspose.html.Url("https://www.facebook.com/")
        );

        try {
            // Read children nodes and get length information
            if (document.getBody().getChildNodes().getLength() == 0)
                System.out.println("No ChildNodes found...");
            // Print Document URI to console. As per information above, it has to be https://www.w3.org/TR/html5/
            System.out.println("Print Document URI = " + document.getDocumentURI());
            // Print domain name for remote HTML
            System.out.println("Domain Name = " + document.getDomain());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}