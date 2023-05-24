package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_CreateDocuments_SVG {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html.Dom.Svg;
//...
//        // Initialize an SVG document from a string object
//        using (var document = new SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", "."))
//        {
//            // Write the document content to the output stream
//            Console.WriteLine(document.DocumentElement.OuterHTML);
//        }

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
