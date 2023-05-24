package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_Font {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Converters;
//        using Aspose.Html.Saving;
//        using Aspose.Html.Services;
//...
//        // Prepare HTML code and save it to a file
//        var code = "<h1>FontsSettings property</h1>\r\n" +
//                "<p>The FontsSettings property is used for configuration of fonts handling.</p>\r\n";
//
//        File.WriteAllText(Path.Combine(OutputDir, "user-agent-fontsetting.html"), code);
//
//        // Create an instance of Configuration
//        using (var configuration = new Configuration())
//        {
//            // Get the IUserAgentService
//            var userAgentService = configuration.GetService<IUserAgentService>();
//
//            // Set the custom style parameters for the "h1" and "p" elements
//            userAgentService.UserStyleSheet = "h1 { color:#a52a2a; }\r\n" +
//                    "p { color:grey; }\r\n";
//
//            // Set custom font folder path
//            userAgentService.FontsSettings.SetFontsLookupFolder(Path.Combine(DataDir + "fonts"));
//
//            // Initialize the HTML document with specified configuration
//            using (var document = new HTMLDocument(Path.Combine(OutputDir, "user-agent-fontsetting.html"), configuration))
//            {
//                // Convert HTML to PDF
//                Converter.ConvertHTML(document, new PdfSaveOptions(), Path.Combine(OutputDir, "user-agent-fontsetting_out.pdf"));
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_Font
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
