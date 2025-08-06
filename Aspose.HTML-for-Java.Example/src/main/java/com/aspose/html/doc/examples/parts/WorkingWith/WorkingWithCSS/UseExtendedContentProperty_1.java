package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithCSS;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.services.IUserAgentService;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class UseExtendedContentProperty_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET UseExtendedContentProperty_1
        //  Initialize configuration object and set up the page-margins for the document
        Configuration configuration = new Configuration();
        configuration.getService(IUserAgentService.class).setUserStyleSheet(
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
        HTMLDocument document = new HTMLDocument(configuration);

        //  Initialize an output device
        XpsDevice device = new XpsDevice($o("output_out.xps"));

        // Send the document to the output device
        document.renderTo(device);
        // @END_SNIPPET
    }
}
