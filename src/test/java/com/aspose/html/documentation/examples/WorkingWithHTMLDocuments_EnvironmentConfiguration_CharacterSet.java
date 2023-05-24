package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_CharacterSet {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_CharacterSet
        // Prepare an HTML code and save it to the file.
        String code = "<h1>Character Set</h1>\r\n" +
                "<p>The <b>CharSet</b> property sets the primary character-set for a document.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the IUserAgentService
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

            // Set ISO-8859-1 encoding to parse the document
            userAgent.setCharSet("ISO-8859-1");

            // Initialize an HTML document with specified configuration
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("user-agent-charset.html"), configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        Resources.output("user-agent-charset_out.pdf")
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
