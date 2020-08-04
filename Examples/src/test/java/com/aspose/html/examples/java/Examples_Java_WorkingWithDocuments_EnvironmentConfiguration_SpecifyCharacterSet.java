package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_EnvironmentConfiguration_SpecifyCharacterSet {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Create an instance of Configuration
        var configuration = new com.aspose.html.Configuration();

        // Get the IUserAgentService
        var userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

        // Set ISO-8859-1 encoding to parse the document
        userAgent.setCharSet("ISO-8859-1");
    }
}