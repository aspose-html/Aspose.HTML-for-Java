package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_LoadFromStream {
    public static void main(String [] args) throws IOException {
//        using System IO;
//        using Aspose.Html;
//...
//        // Create a memory stream object
//        using (var mem = new MemoryStream())
//        using (var sw = new StreamWriter(mem))
//        {
//            // Write the HTML code into memory object
//            sw.Write("<p>Hello World! I love HTML!</p>");
//
//            // It is important to set the position to the beginning since HTMLDocument starts the reading exactly from the current position within the stream
//            sw.Flush();
//            mem.Seek(0, SeekOrigin.Begin);
//
//            // Initialize a document from the string variable
//            using (var document = new HTMLDocument(mem, "."))
//            {
//                // Save the document to a disk
//                document.Save(Path.Combine(OutputDir, "load-from-stream.html"));
//            }
//        }


        // START_SNIPPET WorkingWithHTMLDocuments_CreateDocuments_LoadFromStream
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
