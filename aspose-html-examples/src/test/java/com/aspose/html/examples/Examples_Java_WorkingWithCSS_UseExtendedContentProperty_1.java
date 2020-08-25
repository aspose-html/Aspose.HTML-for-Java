package com.aspose.html.examples;

public class Examples_Java_WorkingWithCSS_UseExtendedContentProperty_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        //  Initialize configuration object and set up the page-margins for the document
        var configuration = new com.aspose.html.Configuration();
        configuration.getService(com.aspose.html.services.IUserAgentService.class).setUserStyleSheet(
                """
                        @page
                                {
                                    /* Page margins should be not empty in order to write content inside the margin-boxes */
                                    margin - top:1 cm;
                                    margin - left:2 cm;
                                    margin - right:2 cm;
                                    margin - bottom:2 cm;
                                                
                                    /* Page counter located at the bottom of the page */
                                    @bottom -right
                                    {
                                        -aspose - content:"" Page "" currentPageNumber() "" of "" totalPagesNumber();
                                        color:
                                        green;
                                    }
                                                
                                    /* Page title located at the top-center box */
                                    @top -center
                                    {
                                        -aspose - content:"" Document 's title"";
                                        vertical - align:bottom;
                                    }
                                }
                        """
        );

        //  Initialize an empty document
        var document = new com.aspose.html.HTMLDocument(configuration);
        try {
            //  Initialize an output device
            var device = new com.aspose.html.rendering.xps.XpsDevice(dataDir + "output_out.xps");
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