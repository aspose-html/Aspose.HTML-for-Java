package com.aspose.html.examples.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.events.DOMEventHandler;
import com.aspose.html.dom.events.Event;

public class Async {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException, InterruptedException {
        // @START_SNIPPET Example_LoadDocument_Async.java
        // Load HTML asynchronously using Java
        // Learn more: https://docs.aspose.com/html/java/create-a-document/

        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument();

        // Create a string variable for OuterHTML property reading
        StringBuilder outerHTML = new StringBuilder();

        // Subscribe to 'ReadyStateChange' event
        // This event will be fired during the document loading process
        document.OnReadyStateChange.add(new DOMEventHandler() {
            @Override
            public void invoke(Object sender, Event e) {
                // Check the value of the 'ReadyState' property
                // This property is representing the status of the document. For detail information please visit https://www.w3schools.com/jsref/prop_doc_readystate.asp
                if (document.getReadyState().equals("complete")) {
                    // Fill the outerHTML variable by value of loaded document
                    outerHTML.append(document.getDocumentElement().getOuterHTML());
                }
            }
        });

        Thread.sleep(5000);

        System.out.println("outerHTML = " + outerHTML);
        // @END_SNIPPET
    }
}