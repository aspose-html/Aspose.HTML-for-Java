package com.aspose.html.examples.document;
import com.aspose.html.examples.Utils;

public class LoadHtmlUsingRemoteServer {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:LoadHtmlUsingRemoteServer
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // This simple test shows how to load document from remote server
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(new com.aspose.html.Url(dataDir + "input.html"));
        // Read children nodes and get length information
        if (document.getBody().getChildNodes().getLength() == 0)
            System.out.println("No ChildNodes found...");
        // Print Document URI to console. As per information above, it has to be https://www.w3.org/TR/html5/
        System.out.println("Print Document URI = " + document.getDocumentURI());
        // Print domain name for remote HTML
        System.out.println("Domain Name = " + document.getDomain());
        //ExEnd:LoadHtmlUsingRemoteServer
    }
}
