package com.aspose.html.examples.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.IUserAgentService;

import java.io.IOException;

import static com.aspose.html.examples.utils.Resources.$o;

public class Font {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET Example_SetUserAgentFontSettings.java
        // Set font folder for HTML to PDF conversion using Java
        // Learn more: https://docs.aspose.com/html/java/environment-configuration/

        // Prepare HTML code and save it to a file
        String code = "<h1>FontsSettings property</h1>\r\n" +
                "<p>The FontsSettings property is used for configuration of fonts handling.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("user-agent-fontsetting.html"))) {
            fileWriter.write(code);
        }

        // Initialize an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Get the IUserAgentService
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set a custom font folder path
        userAgent.getFontsSettings().setFontsLookupFolder("fonts");

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("user-agent-fontsetting.html"), configuration);

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("user-agent-fontsetting_out.pdf"));
        // @END_SNIPPET
    }
}