package com.aspose.html.examples;

public class Examples_Java_WorkingWithDevices_GenerateXPSByXpsDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:/work/");
        try {
            com.aspose.html.rendering.xps.XpsRenderingOptions xpsRenderingOptions = new com.aspose.html.rendering.xps.XpsRenderingOptions();
            com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
            com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page(
                    new com.aspose.html.drawing.Size(500, 500),
                    new com.aspose.html.drawing.Margin(50, 50, 50, 50)
            );
            pageSetup.setAnyPage(anyPage);
            xpsRenderingOptions.setPageSetup(pageSetup);
            com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(
                    xpsRenderingOptions,
                    Resources.output("document_out.xps")
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