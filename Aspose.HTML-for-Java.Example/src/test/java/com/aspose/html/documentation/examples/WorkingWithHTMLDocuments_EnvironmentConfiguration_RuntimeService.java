package com.aspose.html.documentation.examples;

import java.io.IOException;

public class WorkingWithHTMLDocuments_EnvironmentConfiguration_RuntimeService {
    public static void main(String [] args) throws IOException {
        // START_SNIPPET WorkingWithHTMLDocuments_EnvironmentConfiguration_RuntimeService
        // @md products/html/en/java/working-with-documents/environment-configuration/_index.md
        // @code-snippet5

// Prepare HTML code and save it to a file
        String code = "<h1>Runtime Service</h1>\r\n" +
                "<script> while(true) {} </script>\r\n" +
                "<p>The Runtime Service optimizes your system by helping it start apps and programs faster.</p>\r\n";

try (java.io.FileWriter fileWriter = new java.io.FileWriter(Resources.output("runtime-service.html"))) {
            fileWriter.write(code);
        }

// Create an instance of the Configuration class
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Limit JS execution time to 5 seconds
            com.aspose.html.services.IRuntimeService runtimeService = configuration.getService(com.aspose.html.services.IRuntimeService.class);
            runtimeService.setJavaScriptTimeout(com.aspose.html.utils.TimeSpan.fromSeconds(5));


            // Initialize an HTML document with specified configuration
    com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.output("runtime-service.html"), configuration);
            try {
                // Convert HTML to PNG
                com.aspose.html.converters.Converter.convertHTML(
                        document,
                new ImageSaveOptions(),
                Resources.output("runtime-service_out.png")
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
