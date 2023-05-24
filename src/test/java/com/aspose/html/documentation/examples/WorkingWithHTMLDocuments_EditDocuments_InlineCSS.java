package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_InlineCSS {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Rendering.Pdf;
//...
//        // Create an instance of an HTML document with specified content
//        var content = "<p> Inline CSS </p>";
//        using (var document = new HTMLDocument(content, "."))
//        {
//            // Find the paragraph element to set a style attribute
//            var paragraph = (HTMLElement)document.GetElementsByTagName("p").First();
//
//            // Set the style attribute
//            paragraph.SetAttribute("style", "font-size: 250%; font-family: verdana; color: #cd66aa");
//
//            // Save the HTML document to a file
//            document.Save(Path.Combine(OutputDir, "edit-inline-css.html"));
//
//            // Create the instance of the PDF output device and render the document into this device
//            using (var device = new PdfDevice(Path.Combine(OutputDir, "edit-inline-css.pdf")))
//            {
//                // Render HTML to PDF
//                document.RenderTo(device);
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_InlineCSS
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
