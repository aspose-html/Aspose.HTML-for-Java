package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.internal.ms.System.IO.File;
import com.aspose.html.internal.ms.System.IO.FileStream;
import com.aspose.html.internal.ms.System.IO.StreamWriter;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.pdf.PdfDevice;
import com.aspose.html.rendering.pdf.PdfRenderingOptions;



public class HtmlToPdf
{
    public static void run()
    {
        // ExStart:HtmlToPdf
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        String InputHtml = StringExtensions.concat(dataDir,  "input.html");
         FileStream fs = File.create(InputHtml);
        try
        {
         StreamWriter sw = new StreamWriter(fs);
        try
        {
            sw.write(
                "<style>\n                    .st\n                    {\n                    color: green;\n                    }\n                    </style>\n                    <div id=id1>com.aspose.html rendering Text in Black Color</div>\n                    <div id=id2 class=''st''>com.aspose.html rendering Text in Green Color</div><div id=id3 class=''st'' style='color: blue;'>com.aspose.html rendering Text in Blue Color</div>\n                    <div id=id3 class=''st'' style='color: red;'><font face='Arial'>com.aspose.html rendering Text in Red Color</font></div>");
        }
        finally { if (sw != null) sw.dispose(); }
        }
        finally { if (fs != null) fs.dispose(); }

        // File name for resultant PDF file
        String Resultant_output = StringExtensions.concat(dataDir,  "simple-any-page_out.pdf");
        // Create PdfRendering Options object
        PdfRenderingOptions pdf_options = new PdfRenderingOptions();
        // The PageSetup also provides different properties i.e. FirstPage, LastPage, LeftPage, RightPage and they are used to setup (PageSize, Margin) for every page. 
        // In most cases, usage of setup any page is enough, but in some complicated cases, you may need to fine tune page settings. It can be done either by CSS styles or by using rendering options.
        // the size for drawing is in pixels
        pdf_options.getPageSetup().setAnyPage(new Page(new Size(400, 100)));
        // Instantiate PdfDevice object while passing PdfRenderingOptions and resultant file path as arguments
        PdfDevice pdf_device = new PdfDevice(pdf_options, Resultant_output);
        try
        {
        // Create HtmlRenderer object
        HtmlRenderer renderer = new HtmlRenderer();
        try
            {
        // Create HtmlDocument instance while passing path of already created HTML file
        HTMLDocument html_document = new HTMLDocument(InputHtml);
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
        // ExEnd:HtmlToPdf           
    }
}
