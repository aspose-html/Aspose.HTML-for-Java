package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromString {
    public static void main(String [] args) throws IOException {
//        using System IO;
//        using Aspose.Html;
//...
//        // Prepare HTML code
//        var html_code = "<p>Hello World!</p>";
//
//        // Initialize a document from the string variable
//        using (var document = new HTMLDocument(html_code, "."))
//        {
//            // Save the document to a disk
//            document.Save(Path.Combine(OutputDir, "create-from-string.html"));
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromString
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
