package com.aspose.html.examples;

public class Examples_Java_WorkingWithDevices_GenerateJPGByImageDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try {
            // Initialize rendering optionss and set jpeg as output format
            var options = new com.aspose.html.rendering.image.ImageRenderingOptions(com.aspose.html.rendering.image.ImageFormat.Jpeg);

            // Set the size and margin property for all pages.
            options.getPageSetup().setAnyPage(
                    new com.aspose.html.drawing.Page(
                            new com.aspose.html.drawing.Size(500, 500),
                            new com.aspose.html.drawing.Margin(50, 50, 50, 50)
                    )
            );

            //  If the document has an element which size is bigger than predefined by user page size output pages will be will be adjusted.
            options.getPageSetup().setAdjustToWidestPage(true);

            var device = new com.aspose.html.rendering.image.ImageDevice(options, dataDir + "document_out.jpg");
            try {
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