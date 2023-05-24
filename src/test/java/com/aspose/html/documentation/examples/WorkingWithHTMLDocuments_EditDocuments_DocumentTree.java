package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_EditDocuments_DocumentTree {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_DocumentTree
        // Create an instance of an HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        com.aspose.html.HTMLElement body = document.getBody();

        // Create a paragraph element
        com.aspose.html.HTMLParagraphElement p = (com.aspose.html.HTMLParagraphElement) document.createElement("p");

        // Set a custom attribute
        p.setAttribute("id", "my-paragraph");

        // Create a text node
        com.aspose.html.dom.Text text = document.createTextNode("my first paragraph");

        // Add the text to the paragraph
        p.appendChild(text);

        // Attach paragraph to the document body
        body.appendChild(p);

        // Save the HTML document to a file
        document.save("edit-document-tree.html");
        // END_SNIPPET
    }
}
