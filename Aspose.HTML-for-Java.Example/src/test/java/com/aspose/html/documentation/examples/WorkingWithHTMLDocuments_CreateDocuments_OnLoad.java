package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_OnLoad {
    public static void main(String [] args) throws java.io.IOException, InterruptedException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_SVG

        // Initialize an HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        java.util.concurrent.atomic.AtomicBoolean isLoading = new java.util.concurrent.atomic.AtomicBoolean(false);

        // Subscribe to the 'OnLoad' event
        // This event will be fired once the document is fully loaded
        document.OnLoad.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object o, com.aspose.html.dom.events.Event event) {
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
        // END_SNIPPET
    }
}
