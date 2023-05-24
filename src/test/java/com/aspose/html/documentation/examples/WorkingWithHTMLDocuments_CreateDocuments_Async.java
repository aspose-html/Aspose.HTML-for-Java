package com.aspose.html.documentation.examples;

public class WorkingWithHTMLDocuments_CreateDocuments_Async {
    public static void main(String [] args) throws java.io.IOException, InterruptedException {
        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_SVG


        // Create an instance of an HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Create a string variable for OuterHTML property reading
        StringBuilder outerHTML = new StringBuilder();

        // Subscribe to 'ReadyStateChange' event
        // This event will be fired during the document loading process
        document.OnReadyStateChange.add(new com.aspose.html.dom.events.DOMEventHandler() {
            @Override
            public void invoke(Object sender, com.aspose.html.dom.events.Event e) {
            // Check the value of the 'ReadyState' property
            // This property is representing the status of the document. For detail information please visit https://www.w3schools.com/jsref/prop_doc_readystate.asp
            if (document.getReadyState().equals("complete"))
            {
                // Fill the outerHTML variable by value of loaded document
                outerHTML.append(document.getDocumentElement().getOuterHTML());
            }
            }
        });

        Thread.sleep(5000);

        System.out.println("outerHTML = " + outerHTML);
        // END_SNIPPET
    }
}
