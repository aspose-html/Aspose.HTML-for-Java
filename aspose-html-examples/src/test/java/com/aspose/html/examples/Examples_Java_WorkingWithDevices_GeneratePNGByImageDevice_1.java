package com.aspose.html.examples;

public class Examples_Java_WorkingWithDevices_GeneratePNGByImageDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        var document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try {
            var device = new com.aspose.html.rendering.image.ImageDevice(dataDir + "document_out.png");
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