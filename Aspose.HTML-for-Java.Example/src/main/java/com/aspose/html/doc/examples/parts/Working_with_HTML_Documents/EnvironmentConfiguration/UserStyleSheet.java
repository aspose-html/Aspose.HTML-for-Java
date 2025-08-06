package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.IUserAgentService;

import java.io.IOException;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class UserStyleSheet {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET EnvironmentConfiguration_UserStyleSheet
        // Prepare HTML code and save it to a file
        String code = "<span>Hello, World!!!</span>";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("user-agent-stylesheet.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Get the IUserAgentService
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set a custom color to the <span> element
        userAgent.setUserStyleSheet("span { color: green; }");

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("user-agent-stylesheet.html"), configuration);

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("user-agent-stylesheet_out.pdf"));
        // @END_SNIPPET
    }
}
