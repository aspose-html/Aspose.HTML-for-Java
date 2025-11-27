package com.aspose.html.examples.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;

public class InnerOuterHTMLProperties {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_UsingInnerHTMLOuterHTML.java
        // Edit HTML body content and print the updated outerHTML using Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/edit-a-document/

        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument();

        // Write the content of the HTML document into the console output
        System.out.println(document.getDocumentElement().getOuterHTML());
        // @output: <html><head></head><body></body></html>

        // Set the content of the <body> element
        document.getBody().setInnerHTML("<p>HTML is the standard markup language for Web pages.</p>");

        // Write the content of the HTML document into the console output
        System.out.println(document.getDocumentElement().getOuterHTML());
        // @output: <html><head></head><body><p>HTML is the standard markup language for Web pages.</p></body></html>
        // @END_SNIPPET
    }
}