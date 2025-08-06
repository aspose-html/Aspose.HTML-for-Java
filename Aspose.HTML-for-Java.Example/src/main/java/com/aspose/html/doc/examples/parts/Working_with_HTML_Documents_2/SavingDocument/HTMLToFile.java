package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.SavingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Text;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class HTMLToFile {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Initialize an empty HTML Document.
        HTMLDocument document = new HTMLDocument();

        // Create a text element and add it to the document
        Text text = document.createTextNode("Hello World!");
        document.getBody().appendChild(text);

        // Save the HTML to the file on disk.
        document.save($o("document.html"));
    }
}
