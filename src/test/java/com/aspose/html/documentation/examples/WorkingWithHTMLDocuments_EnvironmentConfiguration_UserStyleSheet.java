package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_UserStyleSheet {
    public static void main(String [] args) throws IOException {
//        using System.IO;
//        using Aspose.Html;
//        using Aspose.Html.Converters;
//        using Aspose.Html.Saving;
//        using Aspose.Html.Services;
//...
//        // Prepare HTML code and save it to a file
//        var code = "<h1>User Agent Service </h1>\r\n" +
//                "<p>The User Agent Service allows you to specify a custom user stylesheet, a primary character set for the document, language and fonts settings.</p>\r\n";
//
//        File.WriteAllText(Path.Combine(OutputDir, "user-agent-stylesheet.html"), code);
//
//        // Create an instance of Configuration
//        using (var configuration = new Configuration())
//        {
//            // Get the IUserAgentService
//            var userAgentService = configuration.GetService<IUserAgentService>();
//
//            // Set the custom style parameters for the "h1" and "p" elements
//            userAgentService.UserStyleSheet = "h1 { color:#a52a2a;; font-size:2em;}\r\n" +
//                    "p { background-color:GhostWhite; color:SlateGrey; font-size:1.2em; }\r\n";
//
//            // Initialize the HTML document with specified configuration
//            using (var document = new HTMLDocument(Path.Combine(OutputDir, "user-agent-stylesheet.html"), configuration))
//            {
//                // Convert HTML to PDF
//                Converter.ConvertHTML(document, new PdfSaveOptions(), Path.Combine(OutputDir, "user-agent-stylesheet_out.pdf"));
//            }
//        }

        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_UserStyleSheet
        // Prepare an HTML code and save it to the file.
        String code = "<h1>User Agent Service </h1>\r\n" +
                "<p>The User Agent Service allows you to specify a custom user stylesheet, a primary character set for the document, language and fonts settings.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the IUserAgentService
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

            // Set the custom color to the SPAN element
            userAgent.setUserStyleSheet("h1 { color:#a52a2a;; font-size:2em;}\r\n" +
                    "p { background-color:GhostWhite; color:SlateGrey; font-size:1.2em; }\r\n");

            // Initialize an HTML document with specified configuration
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("user-agent-stylesheet.html"), configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        Resources.output("user-agent-stylesheet_out.pdf")
                );
            } finally {
                if (document != null) {
                    document.dispose();
                }
            }
        } finally {
            if (configuration != null) {
                configuration.dispose();
            }
        }
        // END_SNIPPET
    }
}
