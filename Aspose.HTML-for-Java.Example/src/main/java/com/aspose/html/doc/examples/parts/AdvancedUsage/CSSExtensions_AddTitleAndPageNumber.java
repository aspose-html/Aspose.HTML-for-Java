package com.aspose.html.doc.examples.parts.AdvancedUsage;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.services.IUserAgentService;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CSSExtensions_AddTitleAndPageNumber {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @org.junit.jupiter.api.Disabled
    public void execute() throws Exception {
        // @START_SNIPPET CSSExtensions_AddTitleAndPageNumber
        //  Initialize a configuration object
        Configuration configuration = new Configuration();

        // Get the User Agent Service
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set a style of custom margins and create marks on it
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
                        "    -aspose-content: \"Hello, World Document Title!!!\";\n" +
                        "    vertical-align: bottom;\n" +
                        "    color: blue;\n" +
                        "  }\n" +
                        "}");
        //  Initialize an HTML document
        HTMLDocument document = new HTMLDocument("<div>Hello, World!!!</div>", ".", configuration);

        //  Initialize an output device
        XpsDevice device = new XpsDevice($o("output.xps"));

        // Send the document to the output device
        document.renderTo(device);
        //@END_SNIPPET Examples_Java_AdvancedUsage_CSSExtensions_AddTitleAndPageNumber
    }
}