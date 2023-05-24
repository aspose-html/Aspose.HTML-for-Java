package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_CharacterSet {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Converters;
//        using Aspose.Html.Saving;
//        using Aspose.Html.Services;
//...
//        // Prepare HTML code and save it to a file
//        var code = "<h1>Character Set</h1>\r\n" +
//                "<p>The <b>CharSet</b> property sets the primary character-set for a document.</p>\r\n";
//
//        File.WriteAllText(Path.Combine(OutputDir, "user-agent-charset.html"), code);
//
//        // Create an instance of Configuration
//        using (var configuration = new Configuration())
//        {
//            // Get the IUserAgentService
//            var userAgentService = configuration.GetService<IUserAgentService>();
//
//            // Set the custom style parameters for the "h1" and "p" elements
//            userAgentService.UserStyleSheet = "h1 { color:salmon; }\r\n" +
//                    "p { background-color: #f0f0f0; color:DarkCyan; font-size:1.2em; }\r\n";
//
//            // Set ISO-8859-1 encoding to parse the document
//            userAgentService.CharSet = "ISO-8859-1";
//
//            // Initialize the HTML document with specified configuration
//            using (var document = new HTMLDocument(Path.Combine(OutputDir, "user-agent-charset.html"), configuration))
//            {
//                // Convert HTML to PDF
//                Converter.ConvertHTML(document, new PdfSaveOptions(), Path.Combine(OutputDir, "user-agent-charset_out.pdf"));
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_CharacterSet
        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();

        // Get the IUserAgentService
        com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

        // Set ISO-8859-1 encoding to parse the document
        userAgent.setCharSet("ISO-8859-1");
        // END_SNIPPET
    }
}
