package com.aspose.html.examples.java;

public class Examples_Java_Document_EditDocument_EditDocumentTree {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var document = new com.aspose.html.HTMLDocument();
        try {
            var body = document.getBody();

            // Create paragraph element
            var p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");

            // Set custom attribute
            p.setAttribute("id", "my-paragraph");

            // Create text node
            var text = document.createTextNode("my first paragraph");

            // Attach text to the paragraph
            p.appendChild(text);

            // Attach paragraph to the document body
            body.appendChild(p);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}