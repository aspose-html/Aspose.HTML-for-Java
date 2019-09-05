package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.pdf.PdfDevice;


public class CanvasToPDF
{
    public static void run()
    {
        // ExStart:CanvasToPDF
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument(StringExtensions.concat(dataDir,  "canvas.html"));
        try
        {
            // Create an instance of HTML renderer and XPS output device
            HtmlRenderer renderer = new HtmlRenderer();
            try
            {
            PdfDevice device = new PdfDevice(StringExtensions.concat(dataDir,  "canvas.pdf"));
            try
            {
                //  Render the document to the specified device
                renderer.render(device, document);
            }
            finally { if (device != null) device.dispose(); }
            }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:CanvasToPDF           
    }
}
