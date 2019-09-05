package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;



public class ReadInnerHtml
{
    public static void run()
    {
        // ExStart:ReadInnerHtml
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        String InputHtml = StringExtensions.concat(dataDir,  "input.html");
        // Create HtmlDocument instance to load existing HTML file
        HTMLDocument document = new HTMLDocument(InputHtml);
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
        // ExEnd:ReadInnerHtml           
    }
}
