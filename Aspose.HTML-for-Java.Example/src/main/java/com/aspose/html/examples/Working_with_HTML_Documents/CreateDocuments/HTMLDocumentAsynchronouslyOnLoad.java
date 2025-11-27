package com.aspose.html.examples.Working_with_HTML_Documents.CreateDocuments;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.events.DOMEventHandler;
import com.aspose.html.dom.events.Event;

@org.junit.jupiter.api.Tag("remote")
public class HTMLDocumentAsynchronouslyOnLoad {

    private String msg = null;

    // Look as start this example in link files SimpleWait & HTMLDocumentWaiter
    public void execute() throws Exception {
        // @START_SNIPPET Example_UsingAsynchronousOperationsOnLoad.java
        // Handle HTML document onLoad event when navigating to URL using Java
        // Learn more: https://docs.aspose.com/html/java/create-a-document/

        // Create an instance of the HTMLDocument class
        HTMLDocument document = new HTMLDocument();

        // Subscribe to the 'OnLoad' event. This event will be fired once the document is fully loaded
        document.OnLoad.add(new DOMEventHandler() {
            @Override
            public void invoke(Object sender, Event e) {
                msg = document.getDocumentElement().getOuterHTML();
                System.out.println(msg);
            }
        });

        // Navigate asynchronously at the specified Uri
        document.navigate("https://html.spec.whatwg.org/multipage/introduction.html");
        // @END_SNIPPET
    }

    public String getMsg() {
        return msg;
    }
}