package com.aspose.html.examples;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyPDFPermissions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code
        String code = "<div>Hello World!!</div>";
        // Initialize the HTML document from the HTML code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of Rendering Options
            com.aspose.html.rendering.pdf.PdfRenderingOptions options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();

            // Set the permissions to the file
            options.setEncryption(
                    new com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo(
                            "user_pwd",
                            "owner_pwd",
                            com.aspose.html.rendering.pdf.encryption.PdfPermissions.PrintDocument,
                            com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm.RC4_128
                    )
            );

            // Create the PDF Device and specify options and output file
            com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(options, Resources.output("output.pdf"));
            try {
                // Render HTML to PDF
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