package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_Font {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_Font
        // Prepare an HTML code and save it to the file.
        String code = "<h1>FontsSettings property</h1>\r\n" +
                "<p>The FontsSettings property is used for configuration of fonts handling.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter("user-agent-fontsetting.html")) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the IUserAgentService
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

            // Set the custom style parameters for the "h1" and "p" elements
            userAgent.setUserStyleSheet("h1 { color:#a52a2a; }\r\n" +
                    "p { color:grey; }\r\n");

            // Set custom font folder path
            userAgent.getFontsSettings().setFontsLookupFolder("fonts");

            // Initialize an HTML document with specified configuration
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("user-agent-fontsetting.html", configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        "user-agent-fontsetting_out.pdf"
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
