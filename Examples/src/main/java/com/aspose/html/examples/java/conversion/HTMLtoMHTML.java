package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.saving.HTMLSaveFormat;
import com.aspose.html.saving.MHTMLSaveOptions;


public class HTMLtoMHTML
{
    public static void run()
    {
        // ExStart:HTMLToMHTML
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", dataDir);
        try
        {
            // Save to MHTML format
            document.save(StringExtensions.concat(dataDir,  "document.mht"), HTMLSaveFormat.MHTML);
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:HTMLToMHTML           
    }
    public static void MHTMLSaveOptions()
    {

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();
        // ExStart:MHTMLSaveOptions
        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", dataDir);
        try
        {
        	MHTMLSaveOptions options = new MHTMLSaveOptions();
            // Set the resource handling rules
            options.getResourceHandlingOptions().setMaxHandlingDepth(1);

            // Save to MHTML format
            document.save(StringExtensions.concat(dataDir,  "document.mht"), options);
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:MHTMLSaveOptions          
    }

}
