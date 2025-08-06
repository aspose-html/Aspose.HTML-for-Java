package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.services.IUserAgentService;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyUserStyleSheet {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Prepare HTML code and save it to a file
        String code = "<span>Hello World!!!</span>";
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.html"))) {
            fileWriter.write(code);
        }

        // Create an instance of Configuration
        Configuration configuration = new Configuration();

        // Get the IUserAgentService
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set the custom color to the SPAN element
        userAgent.setUserStyleSheet("span { color: green; }");

        // Initialize an HTML document with specified configuration
        HTMLDocument document = new HTMLDocument($o("document.html"), configuration);

        // Convert HTML to PDF
        Converter.convertHTML(document, new PdfSaveOptions(), $o("output.pdf"));
    }
}
