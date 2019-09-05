package com.aspose.html.examples.java.workingwithmutationobserver;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;
import com.aspose.html.dom.mutations.MutationCallback;
import com.aspose.html.dom.mutations.MutationObserver;
import com.aspose.html.dom.mutations.MutationObserverInit;
import com.aspose.html.dom.mutations.MutationRecord;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.Collections.Generic.IGenericList;
import com.aspose.html.internal.ms.System.Threading.ManualResetEvent;



public class MutationObserverExample
{
    public static void run()
    {
        // ExStart:MutationObserver
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        // The MutationObserver interface provides the ability to watch for changes being made to the DOM tree.

        // Create an empty document
        HTMLDocument document = new HTMLDocument();
        try
        {
            // Create a WaitHandle for purpose described below
            final ManualResetEvent event = new ManualResetEvent(false);

            // Create an observer instance
            MutationObserver observer = new MutationObserver(new MutationCallback()
            {

                public void invoke(IGenericList<MutationRecord> mutations, MutationObserver mutationObserver)
                {
                    MutationRecord mutation = mutations.get_Item(0);
                    System.out.println(mutation.getAddedNodes().get_Item(0));
                    event.set();
                }
            });

                // Options for the observer (which mutations to observe)
            MutationObserverInit config =new MutationObserverInit();

                config.setChildList(true);
                config.setSubtree(true);

                // Start observing the target node
            observer.observe(document.getDocumentElement(),config);

                // An example of user modifications
            Element p = document.createElement("p");
            document.getDocumentElement().appendChild(p);

                // Since, mutations are working in the async mode you should wait a bit. We use WaitHandle for this purpose.
            event.waitOne();


                // Later, you can stop observing
            observer.disconnect();
            }
        finally { if (document != null) document.dispose(); }
        // ExEnd:MutationObserver
    }
}
