package com.aspose.html.examples;

public class Examples_Java_WorkingWithMutationObserver_MutationObserverExample_MutationObserver {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The MutationObserver interface provides the ability to watch for changes being made to the DOM tree.

        // Create an empty document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create an observer instance
            com.aspose.html.dom.mutations.MutationObserver observer = new com.aspose.html.dom.mutations.MutationObserver(
                    new com.aspose.html.dom.mutations.MutationCallback() {
                        @Override
                        public void invoke(
                                Iterable<com.aspose.html.dom.mutations.MutationRecord> mutations,
                                com.aspose.html.dom.mutations.MutationObserver mutationObserver
                        ) {
                            synchronized (this) {
                                com.aspose.html.dom.mutations.MutationRecord mutationRecord =
                                        ((java.util.List<com.aspose.html.dom.mutations.MutationRecord>) mutations)
                                                .get(0);
                                System.out.println(mutationRecord.getAddedNodes().get_Item(0));
                                notifyAll();
                            }
                        }
                    });

            // Options for the observer (which mutations to observe)
            com.aspose.html.dom.mutations.MutationObserverInit config = new com.aspose.html.dom.mutations.MutationObserverInit();
            config.setChildList(true);
            config.setSubtree(true);

            // Start observing the target node
            observer.observe(document.getDocumentElement(), config);

            // An example of user modifications
            com.aspose.html.dom.Element p = document.createElement("p");
            document.getDocumentElement().appendChild(p);

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
    }
}