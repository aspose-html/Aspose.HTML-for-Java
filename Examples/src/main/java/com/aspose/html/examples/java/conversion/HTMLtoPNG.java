package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageRenderingOptions;



public class HTMLtoPNG
{
    public static void run()
    {
        // ExStart:HTMLToPNG
        // The path to the documents directory
        String dataDir = RunExamples.getDataDir_Data();
        ImageRenderingOptions img_options = new ImageRenderingOptions();

        // Instantiate PdfDevice object while passing PdfRenderingOptions and resultant file path as arguments
        ImageDevice img_device = new ImageDevice(img_options, StringExtensions.concat(dataDir,  "Aspose_HTML.png"));
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
            renderer.render(img_device, html_document);
        }
        finally { if (html_document != null) html_document.dispose(); }
            }
        finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (img_device != null) img_device.dispose(); }
        // ExEnd:HTMLToPNG           
    }
}
