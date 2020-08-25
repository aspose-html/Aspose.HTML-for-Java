package com.aspose.html.examples;

public class Examples_Java_AdvancedUsage_CSSExtensions_AddTitleAndPageNumber {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        //  Initialize configuration object and set up the page-margins for the document
        var configuration = new com.aspose.html.Configuration();
        try {
            // Get the User Agent service
            var userAgent = configuration.getService(com.aspose.html.services.IUserAgentService.class);

            // Set the style of custom margins and create marks on it
            userAgent.setUserStyleSheet("""
                                        @page
                                        {
                                            /* Page margins should be not empty in order to write content inside the margin-boxes */
                                            margin-top: 1cm;
                                            margin-left: 2cm;
                                            margin-right: 2cm;
                                            margin-bottom: 2cm;
                                            /* Page counter located at the bottom of the page */
                                            @bottom-right
                                            {
                                                -aspose-content: ""Page "" currentPageNumber() "" of "" totalPagesNumber();
                                                color: green;
                                            }
                    
                                            /* Page title located at the top-center box */
                                            @top-center
                                            {
                                                -aspose-content: ""Hello World Document Title!!!"";
                                                vertical-align: bottom;
                                                color: blue;
                                            }
                                        }
                                        """);
            //  Initialize an HTML document
            var document = new com.aspose.html.HTMLDocument("<div>Hello World!!!</div>", ".", configuration);
            try {
                //  Initialize an output device
                var device = new com.aspose.html.rendering.xps.XpsDevice(dataDir + "output.xps");
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
    }
}