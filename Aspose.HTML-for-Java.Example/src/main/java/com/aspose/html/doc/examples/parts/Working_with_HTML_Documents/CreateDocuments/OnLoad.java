package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;
import com.aspose.html.dom.events.DOMEventHandler;
import com.aspose.html.dom.events.Event;

import java.util.concurrent.atomic.AtomicBoolean;

public class OnLoad {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void example() throws java.io.IOException, InterruptedException {
        // @START_SNIPPET CreateDocuments_OnLoad
        // Initialize an HTML document
        HTMLDocument document = new HTMLDocument();
        AtomicBoolean isLoading = new AtomicBoolean(false);

        // Subscribe to the 'OnLoad' event
        // This event will be fired once the document is fully loaded
        document.OnLoad.add(new DOMEventHandler() {
            @Override
            public void invoke(Object o, Event event) {
                isLoading.set(true);
            }
        });

        // Navigate asynchronously at the specified Uri
        document.navigate("https://docs.aspose.com/html/net/creating-a-document/document.html");

        // Here the document is not loaded yet
        // Wait 5 seconds for the file to load
        Thread.sleep(5000);

        // Here is the loaded document
        System.out.println("outerHTML = " + document.getDocumentElement().getOuterHTML());
        // @END_SNIPPET
    }
}
