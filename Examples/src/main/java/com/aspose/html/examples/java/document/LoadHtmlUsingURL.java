package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Url;

public class LoadHtmlUsingURL
{
    public static void run()
    {
        // ExStart:LoadHtmlUsingURL
        String InputHtml = "http://aspose.com/";
        // Load HTML file using Url instance
        HTMLDocument document = new HTMLDocument(new Url(InputHtml));
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
        // ExEnd:LoadHtmlUsingURL           
    }
}
