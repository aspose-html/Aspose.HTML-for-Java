package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.CreatingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.doc.examples.utils.Remote;
import com.aspose.html.dom.events.DOMEventHandler;
import com.aspose.html.dom.events.Event;

public class HTMLDocumentAsynchronouslyOnReadyStateChange {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Tag("remote")
    public void execute() throws Exception {
        // @START_SNIPPET CreatingADocument_HTMLDocumentAsynchronouslyOnReadyStateChange
        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument();

        // Subscribe to the 'ReadyStateChange' event. This event will be fired during the document loading process
        document.OnReadyStateChange.add(new DOMEventHandler() {
            @Override
            public void invoke(Object sender, Event e) {
                // Check the value of 'ReadyState' property
                // This property is representing the status of the document. For detail information please visit https://www.w3schools.com/jsref/prop_doc_readystate.asp
                if (document.getReadyState().equals("complete")) {
                    System.out.println(document.getDocumentElement().getOuterHTML());
                    notifyAll();
                }
            }
        });

        // Navigate asynchronously at the specified Uri
        document.navigate("https://html.spec.whatwg.org/multipage/introduction.html");

        synchronized (this) {
            wait(10000);
        }
        // @END_SNIPPET
    }
}