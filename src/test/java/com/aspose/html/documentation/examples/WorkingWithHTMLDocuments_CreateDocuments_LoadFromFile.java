package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html;
//...
//        // Prepare an output path for a file saving
//        var htmlFile = Path.Combine(OutputDir, "load-from-file.html");
//
//        // Prepare a 'load-from-file.html' document
//        File.WriteAllText(htmlFile, "Hello World!");
//
//        // Load from the 'load-from-file.html'
//        using (var document = new HTMLDocument(htmlFile))
//        {
//            // Write the document content to the output stream
//            Console.WriteLine(document.DocumentElement.OuterHTML);
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile
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
