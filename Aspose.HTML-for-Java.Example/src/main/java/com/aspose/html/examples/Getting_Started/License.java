package com.aspose.html.examples.Getting_Started;

public class License {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_SetAsposeHtmlLicenseFromFile.java
        // Set Aspose.HTML for Java license using file path string
        // Learn more: https://docs.aspose.com/html/java/getting-started/licensing/

        // instantiate License object
        com.aspose.html.License license = new com.aspose.html.License();
        // license file path information
        license.setLicense("Aspose.HTML.lic");
        // @END_SNIPPET
    }
}
