package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_DocumentTree {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//...
//        // Create an instance of an HTML document
//        using (var document = new HTMLDocument())
//        {
//            var body = document.Body;
//
//            // Create a paragraph element
//            var p = (HTMLParagraphElement)document.CreateElement("p");
//
//            // Set a custom attribute
//            p.SetAttribute("id", "my-paragraph");
//
//            // Create a text node
//            var text = document.CreateTextNode("my first paragraph");
//
//            // Add the text to the paragraph
//            p.AppendChild(text);
//
//            // Attach paragraph to the document body
//            body.AppendChild(p);
//
//            // Save the HTML document to a file
//            document.Save(Path.Combine(OutputDir, "edit-document-tree.html"));
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_DocumentTree
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
