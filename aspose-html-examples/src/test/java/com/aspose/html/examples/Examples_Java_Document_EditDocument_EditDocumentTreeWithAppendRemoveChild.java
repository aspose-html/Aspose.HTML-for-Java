package com.aspose.html.examples;

public class Examples_Java_Document_EditDocument_EditDocumentTreeWithAppendRemoveChild {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>paragraph</p><div>some element to remove</div>", "about:blank");
        try {
            com.aspose.html.HTMLElement body = document.getBody();

            // Get "div" element
            com.aspose.html.HTMLDivElement div = (com.aspose.html.HTMLDivElement) body.getElementsByTagName("div").get_Item(0);

            // Remove found element
            body.removeChild(div);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}