package com.aspose.html.examples.java.document;

import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.internal.ms.System.IO.File;
import com.aspose.html.internal.ms.System.IO.FileStream;
import com.aspose.html.internal.ms.System.IO.StreamWriter;



public class LoadHtmlDoc
{
    public static void run()
    {
        // ExStart:LoadHtmlDoc
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        String InputHtml = StringExtensions.concat(dataDir,  "input.html");
         FileStream fs = File.create(InputHtml);
        try
        {
         StreamWriter sw = new StreamWriter(fs);
        try
        {
            // Write sample HTML tags to HTML file
            sw.write("<p>this is a simple text");
        }
        finally { if (sw != null) sw.dispose(); }
        }
        finally { if (fs != null) fs.dispose(); }
        // ExEnd:LoadHtmlDoc           
    }
}
