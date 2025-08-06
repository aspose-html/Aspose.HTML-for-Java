package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithMutationObserver;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.mutations.MutationCallback;
import com.aspose.html.dom.mutations.MutationObserverInit;
import com.aspose.html.dom.mutations.MutationRecord;
import com.aspose.html.utils.collections.generic.IGenericList;

public class MutationObserver {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {

        // The MutationObserver interface provides the ability to watch for changes being made to the DOM tree.

        // Create an empty document
        HTMLDocument document = new HTMLDocument();

        // Create an observer instance
        com.aspose.html.dom.mutations.MutationObserver observer = new com.aspose.html.dom.mutations.MutationObserver(
                new MutationCallback() {

                    @Override
                    public void invoke(
                            IGenericList<MutationRecord> mutations,
                            com.aspose.html.dom.mutations.MutationObserver mutationObserver
                    ) {
                        synchronized (this) {
                            MutationRecord mutationRecord =
                                    ((java.util.List<MutationRecord>) mutations)
                                            .get(0);
                            System.out.println(mutationRecord.getAddedNodes().get_Item(0));
                            notifyAll();
                        }
                    }
                });

        // Options for the observer (which mutations to observe)
        MutationObserverInit config = new MutationObserverInit();
        config.setChildList(true);
        config.setSubtree(true);

        // Start observing the target node
        observer.observe(document.getDocumentElement(), config);

        // An example of user modifications
        Element p = document.createElement("p");
        document.getDocumentElement().appendChild(p);

        // Since, mutations are working in the async mode you should wait a bit.
        // We use synchronized(object) and wait(milliseconds) for this purpose as example.
        synchronized (this) {
            wait(5000);
        }

        // Later, you can stop observing
        observer.disconnect();
    }
}
