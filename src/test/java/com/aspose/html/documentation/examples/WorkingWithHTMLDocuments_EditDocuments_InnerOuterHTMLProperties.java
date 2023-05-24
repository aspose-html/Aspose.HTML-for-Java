package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_InnerOuterHTMLProperties {
    public static void main(String [] args) throws IOException {
//        using System;
//        using Aspose.Html;
//...
//        // Create an instance of an HTML document
//        using (var document = new HTMLDocument())
//        {
//            // Write the content of the HTML document into the console output
//            Console.WriteLine(document.DocumentElement.OuterHTML); // output: <html><head></head><body></body></html>
//
//            // Set the content of the body element
//            document.Body.InnerHTML = "<p>HTML is the standard markup language for Web pages.</p>";
//
//            // Write the content of the HTML document into the console output
//            Console.WriteLine(document.DocumentElement.OuterHTML); // output: <html><head></head><body><p>HTML is the standard markup language for Web pages.</p></body></html>
//        }


        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_InnerOuterHTMLProperties
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
