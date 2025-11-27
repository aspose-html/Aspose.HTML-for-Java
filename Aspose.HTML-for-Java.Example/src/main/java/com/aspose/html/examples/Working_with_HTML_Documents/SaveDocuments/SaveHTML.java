package com.aspose.html.examples.Working_with_HTML_Documents.SaveDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Text;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class SaveHTML {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_SaveHtmlToFile.java
        // Save HTML to a file using Java
        // Learn more: https://docs.aspose.com/html/java/save-a-document/

        // Initialize an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create a text node and add it to the document
        Text text = document.createTextNode("Hello, World!");
        document.getBody().appendChild(text);

        // Save the HTML document to a file
        document.save($o("save-to-file.html"));
        // @END_SNIPPET
    }
}