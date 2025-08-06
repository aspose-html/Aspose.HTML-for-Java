package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.IUserAgentService;

import java.io.IOException;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CharacterSet {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws IOException {
        // @START_SNIPPET EnvironmentConfiguration_CharacterSet
        // Prepare HTML code and save it to a file
        String code = "<h1>Character Set</h1>\r\n" +
                "<p>The <b>CharSet</b> property sets the primary character-set for a document.</p>\r\n";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("user-agent-charset.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of the Configuration class
        Configuration configuration = new Configuration();

        // Get the IUserAgentService
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set ISO-8859-1 encoding to parse the document
        userAgent.setCharSet("ISO-8859-1");

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("user-agent-charset.html"), configuration);

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("user-agent-charset_out.pdf"));
        // @END_SNIPPET
    }
}
