package com.aspose.html.doc.examples.parts.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo;
import com.aspose.html.rendering.pdf.encryption.PdfPermissions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyPDFPermissions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET FineTuningConverters_SpecifyPDFPermissions
        // Prepare HTML code
        String code = "<div>Hello, World!!</div>";

        // Initialize an HTML document from the HTML code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create the instance of the PdfRenderingOptions class
        PdfRenderingOptions options = new PdfRenderingOptions();

        // Set file permissions
        options.setEncryption(
                new PdfEncryptionInfo(
                        "user_pwd",
                        "owner_pwd",
                        PdfPermissions.PrintDocument,
                        PdfEncryptionAlgorithm.RC4_128
                )
        );

        // Create a PDF Device and specify options and output file
        PdfDevice device = new PdfDevice(options, $o("output.pdf"));

        // Render HTML to PDF
        document.renderTo(device);
        // @END_SNIPPET
    }
}