package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_Font {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_Font
        // @md products/html/en/java/working-with-documents/environment-configuration/_index.md
        // @code-snippet4

// Prepare HTML code and save it to a file
        String code = "<h1>FontsSettings property</h1>\r\n" +
                "<p>The FontsSettings property is used for configuration of fonts handling.</p>\r\n";

try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("user-agent-fontsetting.html"))) {
            fileWriter.write(code);
        }

// Initialize an instance of the Configuration class
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the IUserAgentService
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);


            // Set custom font folder path
            userAgent.getFontsSettings().setFontsLookupFolder("fonts");

            // Initialize an HTML document with specified configuration
    com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("user-agent-fontsetting.html"), configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                Resources.output("user-agent-fontsetting_out.pdf")
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
