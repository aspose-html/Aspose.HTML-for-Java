package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.EnvironmentConfiguration;

import com.aspose.html.Configuration;
import com.aspose.html.services.IUserAgentService;

public class SpecifyCharacterSet {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Create an instance of Configuration
        Configuration configuration = new Configuration();

        // Get the IUserAgentService
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set ISO-8859-1 encoding to parse the document
        userAgent.setCharSet("ISO-8859-1");
    }
}