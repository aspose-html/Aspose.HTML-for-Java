package com.aspose.html.examples;

public class Examples_Java_AdvancedUsage_CSSExtensions_AddTitleAndPageNumber {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Disabled
    public void execute() throws Exception {
        //@START
        //  Initialize configuration object and set up the page-margins for the document
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        try {
            // Get the User Agent service
            com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

            // Set the style of custom margins and create marks on it
            userAgent.setUserStyleSheet("@page\n" +
                                        "{\n" +
                                        "    /* Page margins should be not empty in order to write content inside the margin-boxes */\n" +
                                        "    margin-top: 1cm;\n" +
                                        "    margin-left: 2cm;\n" +
                                        "    margin-right: 2cm;\n" +
                                        "    margin-bottom: 2cm;\n" +
                                        "    /* Page counter located at the bottom of the page */\n" +
                                        "    @bottom-right\n" +
                                        "    {\n" +
                                        "        -aspose-content: \"\"Page \"\" currentPageNumber() \"\" of \"\" totalPagesNumber();\n" +
                                        "        color: green;\n" +
                                        "    }\n" +
                                        "\n" +
                                        "    /* Page title located at the top-center box */\n" +
                                        "    @top-center\n" +
                                        "    {\n" +
                                        "        -aspose-content: \"\"Hello World Document Title!!!\"\";\n" +
                                        "        vertical-align: bottom;\n" +
                                        "        color: blue;\n" +
                                        "    }\n" +
                                        "}\n");
            //  Initialize an HTML document
            com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<div>Hello World!!!</div>", ".", configuration);
            try {
                //  Initialize an output device
                com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(Resources.output("output.xps"));
                try {
                    // Send the document to the output device
                    document.renderTo(device);
                } finally {
                    if (device != null) {
                        device.dispose();
                    }
                }
            } finally {
                if (document != null) {
                    document.dispose();
                }
            }
        } finally {
            if (configuration != null) {
                configuration.dispose();
            }
        }
        //@END
    }
}