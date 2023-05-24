package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromURL {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html;
//...
//        // Load a document from 'https://docs.aspose.com/html/net/creating-a-document/document.html' web page
//        using (var document = new HTMLDocument("https://docs.aspose.com/html/net/creating-a-document/document.html"))
//        {
//            // Write the document content to the output stream
//            Console.WriteLine(document.DocumentElement.OuterHTML);
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromURL
        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();

        // Get the IUserAgentService
        com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

        // Set ISO-8859-1 encoding to parse the document
        userAgent.setCharSet("ISO-8859-1");
        userAgent.getFontsSettings().setFontsLookupFolder(...);
        // END_SNIPPET
    }
}
