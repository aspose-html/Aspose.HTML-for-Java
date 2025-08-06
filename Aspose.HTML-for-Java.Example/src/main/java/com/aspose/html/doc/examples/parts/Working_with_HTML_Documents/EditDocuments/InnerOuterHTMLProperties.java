package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EditDocuments;

import com.aspose.html.HTMLDocument;

public class InnerOuterHTMLProperties {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET EditDocuments_InnerOuterHTMLProperties
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
