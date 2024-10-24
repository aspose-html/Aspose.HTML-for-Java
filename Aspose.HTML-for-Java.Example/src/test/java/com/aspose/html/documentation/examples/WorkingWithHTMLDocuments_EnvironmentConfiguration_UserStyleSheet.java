package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_UserStyleSheet {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_UserStyleSheet
        // @md products/html/en/java/working-with-documents/environment-configuration/_index.md
        // @code-snippet2
// Prepare HTML code and save it to a file
String code = "<span>Hello World!!!</span>";

try (java.io.FileWriter fileWriter = new java.io.FileWriter("user-agent-stylesheet.html")) {
            fileWriter.write(code);
        }

// Create an instance of the Configuration class
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the IUserAgentService
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

    // Set the custom color to the <span> element
    userAgent.setUserStyleSheet("span { color: green; }");

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
