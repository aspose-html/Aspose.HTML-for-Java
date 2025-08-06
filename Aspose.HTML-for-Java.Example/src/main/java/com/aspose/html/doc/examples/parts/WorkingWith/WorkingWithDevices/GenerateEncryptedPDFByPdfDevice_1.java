package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithDevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo;
import com.aspose.html.rendering.pdf.encryption.PdfPermissions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class GenerateEncryptedPDFByPdfDevice_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET GenerateEncryptedPDFByPdfDevice_1
        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");

        PdfRenderingOptions options = new PdfRenderingOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page();
        anyPage.setSize(
                new Size(500, 500)
        );
        anyPage.setMargin(new Margin(50, 50, 50, 50));
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);
        options.setEncryption(
                new PdfEncryptionInfo(
                        "user",
                        "p@wd",
                        PdfPermissions.PrintDocument,
                        PdfEncryptionAlgorithm.RC4_128
                )
        );

        PdfDevice device = new PdfDevice(options, $o("document_out.pdf"));

        document.renderTo(device);
        // @END_SNIPEET
    }
}