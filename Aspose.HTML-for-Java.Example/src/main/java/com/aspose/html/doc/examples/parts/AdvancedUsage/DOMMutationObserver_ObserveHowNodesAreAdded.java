package com.aspose.html.doc.examples.parts.AdvancedUsage;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.Text;
import com.aspose.html.dom.mutations.MutationCallback;
import com.aspose.html.dom.mutations.MutationObserver;
import com.aspose.html.dom.mutations.MutationObserverInit;
import com.aspose.html.dom.mutations.MutationRecord;
import com.aspose.html.utils.collections.generic.IGenericList;

public class DOMMutationObserver_ObserveHowNodesAreAdded {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET DOMMutationObserver_ObserveHowNodesAreAdded
        // Create an empty HTML document
        HTMLDocument document = new HTMLDocument();

        // Create a mutation observer instance
        MutationObserver observer = new MutationObserver(
                new MutationCallback() {

                    @Override
                    public void invoke(
                            IGenericList<MutationRecord> mutations,
                            MutationObserver mutationObserver
                    ) {
                        mutations.forEach(mutationRecord -> {
                            mutationRecord.getAddedNodes().forEach(node -> {
                                synchronized (this) {
                                    System.out.println("The '" + node + "' node was added to the document.");
                                    notifyAll();
                                }
                            });
                        });
                    }
                });

        // configuration of the observer
        MutationObserverInit config = new MutationObserverInit();
        config.setChildList(true);
        config.setSubtree(true);
        config.setCharacterData(true);

        // pass in the target node to observe with the specified configuration
        observer.observe(document.getBody(), config);

        // Now, we are going to modify DOM tree to check
        // Create an paragraph element and append it to the document body
        Element p = document.createElement("p");
        document.getBody().appendChild(p);
        // Create a text and append it to the paragraph
        Text text = document.createTextNode("Hello World");
        p.appendChild(text);

        // Since, mutations are working in the async mode you should wait a bit.
        // We use synchronized(object) and wait(milliseconds) for this purpose as example.
        synchronized (this) {
            wait(5000);
        }

        // Later, you can stop observing
        observer.disconnect();
        //@END_SNIPPET
    }
}