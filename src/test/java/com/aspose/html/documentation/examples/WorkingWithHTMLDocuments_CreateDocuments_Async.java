package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_Async {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html;
//        using System.Threading;
//...
//        // Initialize an AutoResetEvent
//        var resetEvent = new AutoResetEvent(false);
//
//        // Create an instance of an HTML document
//        var document = new HTMLDocument();
//
//        // Create a string variable for OuterHTML property reading
//        var outerHTML = string.Empty;
//
//        // Subscribe to 'ReadyStateChange' event
//        // This event will be fired during the document loading process
//        document.OnReadyStateChange += (sender, @event) =>
//        {
//            // Check the value of the 'ReadyState' property
//            // This property is representing the status of the document. For detail information please visit https://www.w3schools.com/jsref/prop_doc_readystate.asp
//            if (document.ReadyState == "complete")
//            {
//                // Fill the outerHTML variable by value of loaded document
//                outerHTML = document.DocumentElement.OuterHTML;
//                resetEvent.Set();
//            }
//        };
//
//        // Navigate asynchronously at the specified Uri
//        document.Navigate("https://docs.aspose.com/html/net/creating-a-document/document.html");
//
//        // Here the outerHTML is empty yet
//        Console.WriteLine($"outerHTML = {outerHTML}");
//
//        // Wait 5 seconds for the file to load
//        if (!resetEvent.WaitOne(5000))
//        {
//            Console.WriteLine("Thread works too long, more than 5000 ms");
//        }
//
//        // Here the outerHTML is filled
//        Console.WriteLine("outerHTML = {0}", outerHTML);

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
