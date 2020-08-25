package com.aspose.html.examples;

public class Examples_Java_Document_EditDocument_EditDocumentTree_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var document = new com.aspose.html.HTMLDocument("<p>paragraph</p><div>some element to remove</div>", "about:blank");
        try {
            var body = document.getBody();

            // Get "div" element
            var div = (com.aspose.html.HTMLDivElement) body.getElementsByTagName("div").get_Item(0);

            // Remove found element
            body.removeChild(div);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}