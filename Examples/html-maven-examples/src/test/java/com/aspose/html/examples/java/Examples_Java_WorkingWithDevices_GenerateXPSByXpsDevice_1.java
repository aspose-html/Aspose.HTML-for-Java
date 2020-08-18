package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDevices_GenerateXPSByXpsDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:/work/");
        try {
            var xpsRenderingOptions = new com.aspose.html.rendering.xps.XpsRenderingOptions();
            var pageSetup = new com.aspose.html.rendering.PageSetup();
            var anyPage = new com.aspose.html.drawing.Page(
                    new com.aspose.html.drawing.Size(500, 500),
                    new com.aspose.html.drawing.Margin(50, 50, 50, 50)
            );
            pageSetup.setAnyPage(anyPage);
            xpsRenderingOptions.setPageSetup(pageSetup);
            var device = new com.aspose.html.rendering.xps.XpsDevice(
                    xpsRenderingOptions,
                    dataDir + "document_out.xps"
            );
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