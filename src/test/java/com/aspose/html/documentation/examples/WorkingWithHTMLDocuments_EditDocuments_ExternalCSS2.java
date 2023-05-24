package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EditDocuments_ExternalCSS2 {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//...
//        // Prepare content for a CSS file
//        var styleContent = ".flower1 { width:120px; height:40px; border-radius:20px; background:#4387be; margin-top:50px; } \r\n" +
//                ".flower2 { margin-left:0px; margin-top:-40px; background:#4387be; border-radius:20px; width:120px; height:40px; transform:rotate(60deg); } \r\n" +
//                ".flower3 { transform:rotate(-60deg); margin-left:0px; margin-top:-40px; width:120px; height:40px; border-radius:20px; background:#4387be; }\r\n" +
//                ".frame { margin-top:-50px; margin-left:310px; width:160px; height:50px; font-size:2em; font-family:Verdana; color:grey; }\r\n";
//
//        // Prepare a linked CSS file
//        File.WriteAllText("flower.css", styleContent);
//
//        // Create an instance of an HTML document with specified content
//        var htmlContent = "<link rel=\"stylesheet\" href=\"flower.css\" type=\"text/css\" /> \r\n" +
//                "<div style=\"margin-top: 80px; margin-left:250px; transform: scale(1.3);\" >\r\n" +
//                "<div class=\"flower1\" ></div>\r\n" +
//                "<div class=\"flower2\" ></div>\r\n" +
//                "<div class=\"flower3\" ></div></div>\r\n" +
//                "<div style = \"margin-top: -90px; margin-left:120px; transform:scale(1);\" >\r\n" +
//                "<div class=\"flower1\" style=\"background: #93cdea;\"></div>\r\n" +
//                "<div class=\"flower2\" style=\"background: #93cdea;\"></div>\r\n" +
//                "<div class=\"flower3\" style=\"background: #93cdea;\"></div></div>\r\n" +
//                "<div style =\"margin-top: -90px; margin-left:-80px; transform: scale(0.7);\" >\r\n" +
//                "<div class=\"flower1\" style=\"background: #d5effc;\"></div>\r\n" +
//                "<div class=\"flower2\" style=\"background: #d5effc;\"></div>\r\n" +
//                "<div class=\"flower3\" style=\"background: #d5effc;\"></div></div>\r\n" +
//                "<p class=\"frame\">External</p>\r\n" +
//                "<p class=\"frame\" style=\"letter-spacing:10px; font-size:2.5em \">  CSS </p>\r\n";
//
//        using (var document = new HTMLDocument(htmlContent, "."))
//        {
//            // Save the HTML document to a file
//            document.Save(Path.Combine(OutputDir, "edit-external-css.html"));
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EditDocuments_ExternalCSS2
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
