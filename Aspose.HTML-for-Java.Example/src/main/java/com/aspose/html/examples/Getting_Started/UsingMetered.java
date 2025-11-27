package com.aspose.html.examples.Getting_Started;

public class UsingMetered {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void usingMetered() {
        // @START_SNIPPET Example_SetAsposeHtmlMeteredLicense.java
        // Set Aspose.HTML for Java metered license using public and private keys with Metered class
        // Learn more: https://docs.aspose.com/html/java/getting-started/licensing/

        // Initialize a metered object
        com.aspose.html.Metered metered = new com.aspose.html.Metered();

        // Apply the metered license using the public and private keys
        metered.setMeteredKey("PublicKey", "PrivateKey");
        // @END_SNIPPET
    }
}