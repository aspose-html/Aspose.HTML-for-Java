package com.aspose.html.examples.java.workingwithcss;

import com.aspose.html.Configuration;
import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.services.IUserAgentService;



public class UseExtendedContentProperty
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        //  Initialize configuration object and set up the page-margins for the document
        Configuration configuration = new Configuration();
        String css = "@page" +
                "        {" +
                "            /* Page margins should be not empty in order to write content inside the margin-boxes */" +
                "            margin-top: 1cm;" +
                "            margin-left: 2cm;" +
                "            margin-right: 2cm;" +
                "            margin-bottom: 2cm;" +
                "" +
                "            /* Page counter located at the bottom of the page */" +
                "            @bottom-right" +
                "            {" +
                "                -aspose-content: \"Page \" currentPageNumber() \" of \" totalPagesNumber();" +
                "                color: green;" +
                "            }" +
                "" +
                "            /* Page title located at the top-center box */" +
                "            @top-center" +
                "            {" +
                "                -aspose-content: \"Document's title\";" +
                "                vertical-align: bottom;" +
                "            }" +
                "        }";
		configuration.<IUserAgentService>getService(IUserAgentService.class).setUserStyleSheet(css);

        //  Initialize an empty document
        HTMLDocument document = new HTMLDocument(configuration);
        try
        {
            //  Initialize an output device
            XpsDevice device = new XpsDevice(StringExtensions.concat(dataDir,  "output_out.xps"));
            try
            {
                // Send the document to the output device
                document.renderTo(device);
            }
            finally { if (device != null) device.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:1
    }
}
