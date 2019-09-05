package com.aspose.html.examples.java.quickstart;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Metered;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;



public class ApplyMeteredLicense
{
    public static void run()
    {
        // ExStart:ApplyMeteredLicense
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Data();
        // set metered public and private keys
        Metered metered = new Metered();
        // Access the setMeteredKey property and pass public and private keys as parameters
        metered.setMeteredKey("*****", "*****");

        // Load the document from disk.
        HTMLDocument document = new HTMLDocument(StringExtensions.concat(dataDir,  "input.html"));
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
        // ExEnd:ApplyMeteredLicense 
    }
}
