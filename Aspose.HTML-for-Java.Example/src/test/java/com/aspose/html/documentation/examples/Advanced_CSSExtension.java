package com.aspose.html.documentation.examples;

public class Advanced_CSSExtension {
    public static void main(String [] args) throws java.io.IOException {
        // START_SNIPPET Advanced_CSSExtension
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-.NET
        //  Initialize configuration object and set up the page-margins for the document

        com.aspose.html.Configuration configuration = new com.aspose.html.Configuration();

        // Get the User Agent service
        com.aspose.html.services.IUserAgentService userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

        // Set the style of custom margins and create marks on it
        userAgent.setUserStyleSheet(
                "@page {\n" +
                "  /* Page margins should be not empty in order to write content inside the margin-boxes */\n" +
                "  margin-top: 1cm;\n" +
                "  margin-left: 2cm;\n" +
                "  margin-right: 2cm;\n" +
                "  margin-bottom: 2cm;\n" +
                "  /* Page counter located at the bottom of the page */\n" +
                "  @bottom-right {\n" +
                "    -aspose-content: \"Page \" currentPageNumber() \" of \" totalPagesNumber();\n" +
                "    color: green;\n" +
                "  }\n" +
                "  /* Page title located at the top-center box */\n" +
                "  @top-center {\n" +
                "    -aspose-content: \"Hello World Document Title!!!\";\n" +
                "    vertical-align: bottom;\n" +
                "    color: blue;\n" +
                "  }\n" +
                "}"
        );

        //  Initialize an HTML document
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<div>Hello World!!!</div>", ".", configuration);

        //  Initialize an output device
        com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice("output/output.xps");

        // Send the document to the output device
        document.renderTo(device);
        // END_SNIPPET
    }
}
