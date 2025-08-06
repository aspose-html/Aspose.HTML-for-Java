package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.EditingDocument;

import com.aspose.html.HTMLDocument;

public class UsingInnerOuterHTML {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // Create an instance of HTML Document
        HTMLDocument document = new HTMLDocument();

        // Write the content of the HTML document into the console output
        System.out.println(document.getDocumentElement().getOuterHTML());
        // @output: <html><head></head><body></body></html>

        // Set content of the body element
        document.getBody().setInnerHTML("<p>Hello, World!!</p>");

        // Write the content of the HTML document into the console output
        System.out.println(document.getDocumentElement().getOuterHTML());
        // @output: <html><head></head><body><p>Hello World!!</p></body></html>
    }
}
