package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.HTMLParagraphElement;
import com.aspose.html.dom.Text;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class DocumentTree {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET EditDocuments_DocumentTree
        // Create an instance of an HTML document
        HTMLDocument document = new HTMLDocument();

        HTMLElement body = document.getBody();

        // Create a paragraph element
        HTMLParagraphElement p = (HTMLParagraphElement) document.createElement("p");

        // Set a custom attribute
        p.setAttribute("id", "my-paragraph");

        // Create a text node
        Text text = document.createTextNode("my first paragraph");

        // Add the text to the paragraph
        p.appendChild(text);

        // Attach paragraph to the document body
        body.appendChild(p);

        // Save the HTML document to a file
        document.save($o("edit-document-tree.html"));
        // @END_SNIPPET
    }
}
