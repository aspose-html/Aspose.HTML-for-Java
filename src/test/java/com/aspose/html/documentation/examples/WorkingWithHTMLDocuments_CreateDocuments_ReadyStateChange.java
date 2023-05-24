package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_ReadyStateChange {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html;
//        using System.Threading;
//...
//        // Initialize an AutoResetEvent
//        var resetEvent = new AutoResetEvent(false);
//
//        // Initialize an HTML document
//        var document = new HTMLDocument();
//        var isLoading = false;
//
//        // Subscribe to the 'OnLoad' event
//        // This event will be fired once the document is fully loaded
//        document.OnLoad += (sender, @event) =>
//        {
//            isLoading = true;
//            resetEvent.Set();
//        };
//
//        // Navigate asynchronously at the specified Uri
//        document.Navigate("https://docs.aspose.com/html/net/creating-a-document/document.html");
//
//        // Here the document is not loaded yet
//
//        // Wait 5 seconds for the file to load
//        if (!resetEvent.WaitOne(5000))
//        {
//            Console.WriteLine("Thread works too long, more than 5000 ms");
//        }
//
//        // Here is the loaded document
//        Console.WriteLine("outerHTML = {0}", document.DocumentElement.OuterHTML);

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_SVG
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
