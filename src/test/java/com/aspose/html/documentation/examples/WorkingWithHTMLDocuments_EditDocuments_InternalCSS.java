package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_InternalCSS {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Rendering.Pdf;
//        using Aspose.Html.Dom.Css;
//...
//        // Create an instance of an HTML document with specified content
//        var content = "<div><p>Internal CSS</p><p>An internal CSS is used to define a style for a single HTML page</p></div>";
//        using (var document = new HTMLDocument(content, "."))
//        {
//            var style = document.CreateElement("style");
//            style.TextContent = ".frame1 { margin-top:50px; margin-left:50px; padding:20px; width:360px; height:90px; background-color:#a52a2a; font-family:verdana; color:#FFF5EE;} \r\n" +
//                    ".frame2 { margin-top:-90px; margin-left:160px; text-align:center; padding:20px; width:360px; height:100px; background-color:#ADD8E6;}";
//
//            // Find the document header element and append the style element to the header
//            var head = document.GetElementsByTagName("head").First();
//            head.AppendChild(style);
//
//            // Find the first paragraph element to inspect the styles
//            var paragraph = (HTMLElement)document.GetElementsByTagName("p").First();
//            paragraph.ClassName = "frame1";
//
//            // Find the last paragraph element to inspect the styles
//            var lastParagraph = (HTMLElement)document.GetElementsByTagName("p").Last();
//            lastParagraph.ClassName = "frame2";
//
//            // Set a font-size to the first paragraph
//            paragraph.Style.FontSize = "250%";
//            paragraph.Style.TextAlign = "center";
//
//            // Set a color and font-size to the last paragraph
//            lastParagraph.Style.Color = "#434343";
//            lastParagraph.Style.FontSize= "150%";
//            lastParagraph.Style.FontFamily = "verdana";
//
//            // Save the HTML document to a file
//            document.Save(Path.Combine(OutputDir, "edit-internal-css.html"));
//
//            // Create the instance of the PDF output device and render the document into this device
//            using (var device = new PdfDevice(Path.Combine(OutputDir, "edit-internal-css.pdf")))
//            {
//                // Render HTML to PDF
//                document.RenderTo(device);
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_InternalCSS
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
