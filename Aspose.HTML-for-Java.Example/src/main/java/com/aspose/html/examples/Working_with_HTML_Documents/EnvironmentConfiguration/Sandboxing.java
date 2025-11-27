package com.aspose.html.examples.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class Sandboxing {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_BlocksScriptExecution.java
        // How to disable scripts for HTML to PDF conversion using Java
        // Learn more: https://docs.aspose.com/html/java/environment-configuration/

        // Prepare HTML code and save it to a file
        String code = "<span>Hello, World!!</span>\n" +
                "<script>document.write('Have a nice day!');</script>\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("sandboxing.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Mark 'scripts' as an untrusted resource
        configuration.setSecurity(com.aspose.html.Sandbox.Scripts);

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("sandboxing.html"), configuration);

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("sandboxing_out.pdf"));
        // @END_SNIPPET
    }
}