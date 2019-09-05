package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;



public class HTMLtoTIFF
{
    public static void run()
    {
        // ExStart:HTMLToTIFF
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Data();
        ImageRenderingOptions pdf_options = new ImageRenderingOptions();
        pdf_options.setFormat(ImageFormat.Tiff);
        // Instantiate PdfDevice object while passing PdfRenderingOptions and resultant file path as arguments
        ImageDevice pdf_device = new ImageDevice(pdf_options, StringExtensions.concat(dataDir,  "Aspose_HTML.tiff"));
        try
        {
        // Create HtmlRenderer object
        HtmlRenderer renderer = new HtmlRenderer();
        try
            {
        // Create HtmlDocument instance while passing path of already created HTML file
        HTMLDocument html_document = new HTMLDocument(StringExtensions.concat(dataDir,  "input.html"));
        try
        {
            // Render the output using HtmlRenderer
            renderer.render(pdf_device, html_document);
        }
        finally { if (html_document != null) html_document.dispose(); }
            }
        finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (pdf_device != null) pdf_device.dispose(); }
        // ExEnd:HTMLToTIFF           
    }
}
