package com.aspose.html.doc.examples.parts.License;

public class UsingMetered {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void usingMetered() {
        // @START_SNIPPET UsingMetered
        // Initialize a metered object
        com.aspose.html.Metered metered = new com.aspose.html.Metered();

        // Apply the metered license using the public and private keys
        metered.setMeteredKey("PublicKey", "PrivateKey");
        // @END_SNIPPET
    }
}
