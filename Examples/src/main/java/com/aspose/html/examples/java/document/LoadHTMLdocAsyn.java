package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.events.DOMEventHandler;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;



public class LoadHTMLdocAsyn
{
    public static void run()
    {
        // ExStart:LoadHTMLdocAsyn
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

         final HTMLDocument document = new HTMLDocument();

        // subscribe to the event 'OnReadyStateChange' that will be fired once document is completely loaded
        document.OnReadyStateChange.add(new DOMEventHandler()
        {
            public void invoke(Object sender, com.aspose.html.dom.events.Event event)
            {
                if (document.getReadyState() == "complete")
                {
                    // manipulate with document here
                }
            }
        });
        document.navigate(StringExtensions.concat(dataDir,  "input.html"));

        // ExEnd:LoadHTMLdocAsyn           
    }

    public static void eventNavigate()
    {
        // ExStart:EventNavigate
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument();

        // you can subscribe to the event 'OnLoad'
        document.OnLoad.add(new DOMEventHandler()
        {
            public void invoke(Object sender, com.aspose.html.dom.events.Event event)
            {
                // manipulate with document here
            }
        });
        document.navigate(StringExtensions.concat(dataDir,  "input.html"));

        // ExEnd:EventNavigate
    }


}
