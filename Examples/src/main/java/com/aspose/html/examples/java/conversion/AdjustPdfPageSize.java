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


public class AdjustPdfPageSize
{
    public static void run()
    {
        // ExStart:AdjustPdfPageSize
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        String SimpleStyledFilePath = StringExtensions.concat(dataDir,  "FirstFile.html");
        FileStream fs = File.create(SimpleStyledFilePath);
        try
        {
         StreamWriter sw = new StreamWriter(fs);
        try
        {
            sw.write("<style>" +
                    "                    .st" +
                    "                    {" +
                    "                    color: green;" +
                    "                    }" +
                    "                    </style>" +
                    "                    <div id=id1>Aspose.Html rendering Text in Black Color</div>" +
                    "                    <div id=id2 class=''st''>Aspose.Html rendering Text in Green Color</div>" +
                    "                    <div id=id3 class=''st'' style='color: blue;'>Aspose.Html rendering Text in Blue Color</div>" +
                    "                    <div id=id3 class=''st'' style='color: red;'><font face='Arial'>Aspose.Html rendering Text in Red Color</font></div>");
        }
        finally { if (sw != null) sw.dispose(); }
        }
        finally { if (fs != null) fs.dispose(); }

        String pdf_output;
        // Create HtmlRenderer object
        HtmlRenderer pdf_renderer = new HtmlRenderer();
        try
        {
        // Create HtmlDocument instnace while passing path of already created HTML file
        HTMLDocument html_document = new HTMLDocument(SimpleStyledFilePath);
        try
        {
            // Set the page size less than document min-width. The content in the resulting file will be cropped becuase of element with width: 200px
            PdfRenderingOptions pdf_options = new PdfRenderingOptions();
            pdf_options.getPageSetup().setAnyPage(new Page(new Size(100, 100)));
            pdf_options.getPageSetup().setAdjustToWidestPage(false);
            pdf_output = StringExtensions.concat(dataDir,  "not-adjusted-to-widest-page_out.pdf");
           PdfDevice device = new PdfDevice(pdf_options, pdf_output);
            try
            {
                // Render the output
                pdf_renderer.render(device, html_document);
            }
            finally { if (device != null) device.dispose(); }

            // Set the page size less than document min-width and enable AdjustToWidestPage option. The page size of the resulting file will be changed according to content width
            pdf_options = new PdfRenderingOptions();
            pdf_options.getPageSetup().setAnyPage(new Page(new Size(100, 100)));
            pdf_options.getPageSetup().setAdjustToWidestPage(true);
            pdf_output = StringExtensions.concat(dataDir,  "adjusted-to-widest-page_out.pdf");
            device = new PdfDevice(pdf_options, pdf_output);
            try
            {
                // Render the output
                pdf_renderer.render(device, html_document);
            }
            finally { if (device != null) device.dispose(); }
        }
        finally { if (html_document != null) html_document.dispose(); }
        }
        finally { if (pdf_renderer != null) pdf_renderer.dispose(); }
        // ExEnd:AdjustPdfPageSize           
    }
}