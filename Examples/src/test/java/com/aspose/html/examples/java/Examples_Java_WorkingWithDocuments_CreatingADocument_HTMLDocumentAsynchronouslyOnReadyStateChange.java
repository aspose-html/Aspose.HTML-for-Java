package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnReadyStateChange {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Create the instance of HTML Document
        var document = new com.aspose.html.HTMLDocument();

        // Subscribe to the 'ReadyStateChange' event.
        // This event will be fired during the document loading process.
        document.OnReadyStateChange.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
                // Check the value of 'ReadyState' property.
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

    }
}