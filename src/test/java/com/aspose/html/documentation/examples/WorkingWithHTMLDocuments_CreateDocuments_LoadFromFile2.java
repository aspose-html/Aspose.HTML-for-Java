package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile2 {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//...
//        // Prepare a path to a file
//        string documentPath = Path.Combine(DataDir, "Sprite.html");
//
//        // Initialize an HTML document from a file
//        using (var document = new HTMLDocument(documentPath))
//        {
//            // Work with the document
//
//            // Save the document to a disk
//            document.Save(Path.Combine(OutputDir, "Sprite_out.html"));
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromFile2
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
