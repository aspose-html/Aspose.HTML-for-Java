package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.Url;

public class LoadHtmlUsingRemoteServer
{
    public static void run()
    {
        // ExStart:LoadHtmlUsingRemoteServer
        HTMLDocument document = new HTMLDocument(new Url("https://www.w3.org/TR/html5/"));

        // Read children nodes and get length information
        if (document.getBody().getChildNodes().getLength() == 0)
            System.out.println("No ChildNodes found...");
        // Print Document URI to console. As per information above, it has to be https://www.w3.org/TR/html5/
        System.out.println("Print Document URI = " + document.getDocumentURI());
        // Print domain name for remote HTML
        System.out.println("Domain Name = " + document.getDomain());
        // ExEnd:LoadHtmlUsingRemoteServer           
    }
}
