package com.aspose.html.examples;

public class Examples_Java_WorkingWithDevices_GenerateEncryptedPDFByPdfDevice_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try {
            com.aspose.html.rendering.pdf.PdfRenderingOptions options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
            com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
            com.aspose.html.drawing.Page anyPage = new com.aspose.html.drawing.Page();
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

            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(options, Resources.output("document_out.pdf"));
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