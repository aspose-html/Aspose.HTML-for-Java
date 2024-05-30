package com.aspose.html.examples;

import com.aspose.html.dom.mutations.MutationRecord;
import com.aspose.html.utils.collections.generic.IGenericList;

public class Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        //@START
        // Create an empty HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create a mutation observer instance
            com.aspose.html.dom.mutations.MutationObserver observer = new com.aspose.html.dom.mutations.MutationObserver(
                    new com.aspose.html.dom.mutations.MutationCallback() {

                        @Override
                        public void invoke(
                                IGenericList<com.aspose.html.dom.mutations.MutationRecord> mutations,
                                com.aspose.html.dom.mutations.MutationObserver mutationObserver
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
            com.aspose.html.dom.mutations.MutationObserverInit config = new com.aspose.html.dom.mutations.MutationObserverInit();
            config.setChildList(true);
            config.setSubtree(true);
            config.setCharacterData(true);

            // pass in the target node to observe with the specified configuration
            observer.observe(document.getBody(), config);

            // Now, we are going to modify DOM tree to check
            // Create an paragraph element and append it to the document body
            com.aspose.html.dom.Element p = document.createElement("p");
            document.getBody().appendChild(p);
            // Create a text and append it to the paragraph
            com.aspose.html.dom.Text text = document.createTextNode("Hello World");
            p.appendChild(text);

            // Since, mutations are working in the async mode you should wait a bit.
            // We use synchronized(object) and wait(milliseconds) for this purpose as example.
            synchronized (this) {
                wait(5000);
            }

            // Later, you can stop observing
            observer.disconnect();
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
        //@END
    }
}