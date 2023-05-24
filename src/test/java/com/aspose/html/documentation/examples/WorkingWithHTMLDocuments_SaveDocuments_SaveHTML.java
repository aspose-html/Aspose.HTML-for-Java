package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_SaveDocuments_SaveHTML {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//...
//        // Prepare an output path for a document saving
//        string documentPath = Path.Combine(OutputDir, "save-to-file.html");
//
//        // Initialize an empty HTML document
//        using (var document = new HTMLDocument())
//        {
//            // Create a text node and add it to the document
//            var text = document.CreateTextNode("Hello World!");
//            document.Body.AppendChild(text);
//
//            // Save the HTML document to the file on a disk
//            document.Save(documentPath);
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_SaveDocuments_SaveHTML
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
