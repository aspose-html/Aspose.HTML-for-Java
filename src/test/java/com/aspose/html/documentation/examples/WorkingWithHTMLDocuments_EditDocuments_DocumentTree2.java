package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_DocumentTree2 {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Rendering.Pdf;
//...
//        // Create an instance of an HTML document
//        using (var document = new HTMLDocument())
//        {
//            // Create a style element and assign the green color for all elements with class-name equals 'gr'.
//            var style = document.CreateElement("style");
//            style.TextContent = ".gr { color: green }";
//
//            // Find the document header element and append the style element to the header
//            var head = document.GetElementsByTagName("head").First();
//            head.AppendChild(style);
//
//            // Create a paragraph element with class-name 'gr'.
//            var p = (HTMLParagraphElement)document.CreateElement("p");
//            p.ClassName = "gr";
//
//            // Create a text node
//            var text = document.CreateTextNode("Hello World!!");
//
//            // Append the text node to the paragraph
//            p.AppendChild(text);
//
//            // Append the paragraph to the document body element
//            document.Body.AppendChild(p);
//
//            // Save the HTML document to a file
//            document.Save(Path.Combine(OutputDir, "using-dom.html"));
//
//            // Create an instance of the PDF output device and render the document into this device
//            using (var device = new PdfDevice(Path.Combine(OutputDir, "using-dom.pdf")))
//            {
//                // Render HTML to PDF
//                document.RenderTo(device);
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_DocumentTree2
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
