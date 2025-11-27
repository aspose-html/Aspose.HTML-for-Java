package com.aspose.html.examples.Advanced_Programming;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.Node;
import com.aspose.html.dom.Text;
import com.aspose.html.dom.mutations.MutationCallback;
import com.aspose.html.dom.mutations.MutationObserver;
import com.aspose.html.dom.mutations.MutationObserverInit;
import com.aspose.html.dom.mutations.MutationRecord;
import org.junit.jupiter.api.Disabled;

public class UsingMutationObserver {
    @Disabled
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Example_ObserveDomChangesWithMutationObserver.java
        // Monitor DOM tree changes using MutationObserver API in Aspose.HTML for Java
        // Learn more: https://docs.aspose.com/html/java/mutationobserver/

        // Create an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create an instance of the MutationObserver class
        MutationObserver observer = new MutationObserver(new MutationCallback() {

            @Override
            public void invoke(com.aspose.html.utils.collections.generic.IGenericList<MutationRecord> mutations, MutationObserver mutationObserver) {
                for (int i = 0; i < mutations.size(); i++) {
                    MutationRecord record = mutations.get_Item(i);
                    for (Node node : record.getAddedNodes().toArray()) {
                        System.out.println("The '" + node + "' node was added to the document.");
                    }
                }
            }
        });

        // Configure options for the MutationObserver
        MutationObserverInit config = new MutationObserverInit();
        config.setChildList(true);
        config.setSubtree(true);
        config.setCharacterData(true);

        // Pass to observer the target node to observe with the specified configuration
        observer.observe(document.getBody(), config);

        // Now, we are going to modify DOM tree to check
        // Create a paragraph element and append it to the document body
        Element p = document.createElement("p");
        document.getBody().appendChild(p);

        // Create a text and append it to the paragraph
        Text text = document.createTextNode("Hello, World!");
        p.appendChild(text);

        System.out.println("Waiting for mutation. Press any key to continue...");
        System.in.read();
        // @END_SNIPPET
    }
}