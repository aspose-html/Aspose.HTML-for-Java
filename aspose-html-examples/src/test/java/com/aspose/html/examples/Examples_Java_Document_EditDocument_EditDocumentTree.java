package com.aspose.html.examples;

public class Examples_Java_Document_EditDocument_EditDocumentTree {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            com.aspose.html.HTMLElement body = document.getBody();

            // Create paragraph element
            com.aspose.html.HTMLParagraphElement p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");

            // Set custom attribute
            p.setAttribute("id", "my-paragraph");

            // Create text node
            com.aspose.html.dom.Text text = document.createTextNode("my first paragraph");

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