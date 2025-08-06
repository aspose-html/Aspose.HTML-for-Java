package com.aspose.html.doc.examples.parts.License;

public class License_Fom_Stream {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Fom_Stream
        // Initialize License Instance
        com.aspose.html.License license = new com.aspose.html.License();
        // Set license from Stream
        license.setLicense(new java.io.FileInputStream("Aspose.HTML.lic"));
        // @END_SNIPPET
    }
}
