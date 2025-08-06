package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Text;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class NewHTML {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET CreateDocuments_NewHTML
        // Initialize an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create a text node and add it to the document
        Text text = document.createTextNode("Hello, World!");
        document.getBody().appendChild(text);

        // Save the document to disk
        document.save($o("create-new-document.html"));
        // @END_SNIPPET
    }
}
