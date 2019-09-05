package com.aspose.html.examples.java.workingwithdevices;
import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionAlgorithm;
import com.aspose.html.rendering.pdf.encryption.PdfEncryptionInfo;
import com.aspose.html.rendering.pdf.encryption.PdfPermissions;

public class GenerateEncryptedPDFByPdfDevice
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument  document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
            PdfRenderingOptions options = new PdfRenderingOptions();
            options.getPageSetup().setAnyPage(new Page(new Size(500, 500), new Margin(50, 50, 50, 50)));
            PdfEncryptionInfo   encryption = new PdfEncryptionInfo("user", "p@wd", PdfPermissions.PrintDocument, PdfEncryptionAlgorithm.RC4_128);
            options.setEncryption(encryption);
            PdfDevice device = new PdfDevice(options, StringExtensions.concat(dataDir,  "document_out.pdf"));
            try
            {
                document.renderTo(device);
            }
            finally { if (device != null) device.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:1
    }
}
