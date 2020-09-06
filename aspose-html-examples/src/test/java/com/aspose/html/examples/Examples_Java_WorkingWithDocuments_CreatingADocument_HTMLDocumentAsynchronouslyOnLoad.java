package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad {

    private String msg = null;

    // Look as start this example in link files SimpleWait & HTMLDocumentWaiter
    public void execute() throws Exception {
        // Create the instance of HTML Document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Subscribe to the 'OnLoad' event.
        // This event will be fired once the document is fully loaded.
        document.OnLoad.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
                msg = document.getDocumentElement().getOuterHTML();
                System.out.println(msg);
            }
        });

        // Navigate asynchronously at the specified Uri
        document.navigate("https://html.spec.whatwg.org/multipage/introduction.html");
    }

    public String getMsg() {
        return msg;
    }
}