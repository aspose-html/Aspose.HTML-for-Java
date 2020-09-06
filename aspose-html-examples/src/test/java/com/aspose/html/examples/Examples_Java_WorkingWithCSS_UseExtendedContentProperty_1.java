package com.aspose.html.examples;

public class Examples_Java_WorkingWithCSS_UseExtendedContentProperty_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
//  Initialize configuration object and set up the page-margins for the document
        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();
        configuration.getService(com.aspose.html.services.IUserAgentService.class).setUserStyleSheet(
                "@page\n" +
                "        {\n" +
                "            /* Page margins should be not empty in order to write content inside the margin-boxes */\n" +
                "            margin - top:1 cm;\n" +
                "            margin - left:2 cm;\n" +
                "            margin - right:2 cm;\n" +
                "            margin - bottom:2 cm;\n" +
                "\n" +
                "            /* Page counter located at the bottom of the page */\n" +
                "            @bottom -right\n" +
                "            {\n" +
                "                -aspose - content:\"\" Page \"\" currentPageNumber() \"\" of \"\" totalPagesNumber();\n" +
                "                color:\n" +
                "                green;\n" +
                "            }\n" +
                "\n" +
                "            /* Page title located at the top-center box */\n" +
                "            @top -center\n" +
                "            {\n" +
                "                -aspose - content:\"\" Document 's title\"\";\n" +
                "                vertical - align:bottom;\n" +
                "            }\n" +
                "        }\n"
        );

        //  Initialize an empty document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(configuration);
        try {
            //  Initialize an output device
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(Resources.output("output_out.xps"));
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
    }
}