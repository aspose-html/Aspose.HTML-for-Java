package com.aspose.html.documentation.examples;

import com.aspose.html.examples.Resources;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_Sandboxing {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET Examples_Java_WorkingWithDocuments_EnvironmentConfiguration_DisableScriptsExecution
        // Prepare an HTML code and save it to the file.
        String code = "<span>Hello World!!</span>\n" +
                "<script>document.write('Have a nice day!');</script>\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("sandboxing.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Mark 'scripts' as an untrusted resource
            configuration.setSecurity(com.aspose.html.Sandbox.Scripts);

            // Initialize an HTML document with specified configuration
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("sandboxing.html"), configuration);
            try {
                // Convert HTML to PDF
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                        new com.aspose.html.saving.PdfSaveOptions(),
                        Resources.output("sandboxing_out.pdf")
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