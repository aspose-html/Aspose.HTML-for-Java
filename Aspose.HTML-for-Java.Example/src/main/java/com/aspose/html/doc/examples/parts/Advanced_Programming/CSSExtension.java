package com.aspose.html.doc.examples.parts.Advanced_Programming;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.services.IUserAgentService;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class CSSExtension {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void example() throws java.io.IOException {
        // @START_SNIPPET Advanced_CSSExtension
        //  Initialize a Configuration object
        Configuration configuration = new Configuration();

        // Get the User Agent Service
        IUserAgentService userAgent = configuration.getService(IUserAgentService.class);

        // Set a style of custom margins and create marks on it
        userAgent.setUserStyleSheet(
                "@page { " +
                        "  /* Page margins should be not empty in order to write content inside the margin-boxes */ " +
                        "  margin-top: 1cm; " +
                        "  margin-left: 2cm; " +
                        "  margin-right: 2cm; " +
                        "  margin-bottom: 2cm; " +
                        "  /* Page counter located at the bottom of the page */ " +
                        "  @bottom-right { " +
                        "    -aspose-content: \"Page \" currentPageNumber() \" of \" totalPagesNumber(); " +
                        "    color: green; " +
                        "  } " +
                        "  /* Page title located at the top-center box */ " +
                        "  @top-center { " +
                        "    -aspose-content: \"Hello, World Document Title!!!\"; " +
                        "    vertical-align: bottom; " +
                        "    color: blue; " +
                        "  } " +
                        "}"
        );

        //  Initialize an HTML document
        HTMLDocument document = new HTMLDocument("<div>Hello, World!!!</div>", ".", configuration);

        //  Initialize an output device
        XpsDevice device = new XpsDevice($o("output.xps"));

        // Send the document to the output device
        document.renderTo(device);
        // @END_SNIPPET
    }
}
