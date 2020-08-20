package com.aspose.html.examples.java;

public class Examples_Java_ConvertingBetweenFormats_FineTuningConverters_SpecifyPDFPermissions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var code = "<div>Hello World!!</div>";
        // Initialize the HTML document from the HTML code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Create the instance of Rendering Options
            var options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();

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
            var device = new com.aspose.html.rendering.pdf.PdfDevice(options, dataDir + "output.pdf");
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