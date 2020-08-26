package com.aspose.html.examples;

public class Examples_Java_Document_EditDocument_EditHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Get body element
            com.aspose.html.HTMLElement body = document.getBody();

            // Set content of the body element
            body.setInnerHTML("<p>paragraph</p>");

            // Move to the first child
            com.aspose.html.dom.Node node = body.getFirstChild();
            System.out.println(node.getLocalName());
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}