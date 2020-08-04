package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDevices_GenerateEncryptedPDFByPdfDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try {
            var options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            var pageSetup = new com.aspose.html.rendering.PageSetup();
            var anyPage = new com.aspose.html.drawing.Page();
            anyPage.setSize(
                    new com.aspose.html.drawing.Size(500, 500)
            );
            anyPage.setMargin(new com.aspose.html.drawing.Margin(50, 50, 50, 50));
            pageSetup.setAnyPage(anyPage);
            options.setPageSetup(pageSetup);
            options.setEncryption(
                    new com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo(
                            "user",
                            "p@wd",
                            com.aspose.html.rendering.pdf.encryption.PdfPermissions.PrintDocument,
                            com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm.RC4_128
                    )
            );

            var device = new com.aspose.html.rendering.pdf.PdfDevice(options, dataDir + "document_out.pdf");
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