package com.aspose.html.examples.conversion;
import com.aspose.html.examples.Utils;
import java.io.File;
import java.io.FileOutputStream;

public class HtmlToXPS {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:HtmlToXPS
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        String SimpleStyledFilePath = "FirstFile.html";

        final File file = new File(SimpleStyledFilePath);
        final FileOutputStream sw = new FileOutputStream(file);
        String style = "<style>" +
                ".st" +
                "{" +
                "color: green;" +
                "}" +
                "</style>" +
                "<div id=id1>Aspose.Html rendering Text in Black Color</div>" +
                "<div id=id2 class=''st''>Aspose.Html rendering Text in Green Color</div>" +
                "<div id=id3 class=''st'' style='color: blue;'>Aspose.Html rendering Text in Blue Color</div>" +
                "<div id=id3 class=''st'' style='color: red;'>Aspose.Html rendering Text in Red Color</div>";
        try
        {   sw.write(style.getBytes());

        }
        finally
        {
            if (sw != null)
                (sw).close();
        }


        // File name for resultant XPS file
        String Resultnat_output = dataDir + "simple-any-page_out.xps";
        // Create XpxRendering Options object
        com.aspose.html.rendering.xps.XpsRenderingOptions xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
        // The PageSetup also provides different properties i.e. FirstPage, LastPage, LeftPage, RightPage and they are used to setup (PageSize, Margin) for every page.
        // In most cases, usage of setup any page is enough, but in some complicated cases, you may need to fine tune page settings. It can be done either by CSS styles or by using rendering options.
        // the size for drawing is in pixels
        xps_options.getPageSetup().setAnyPage(new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(200, 60)));
        // Instantiate XPSDevice object while passing XPSRenderingOptions and resultant file path as arguments
        final com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, Resultnat_output);
        try
        {
            // Create HtmlRenderer object
            final com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            // Create HtmlDocument instnace while passing path of already created HTML file
            try
            {
                final com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(SimpleStyledFilePath);
                try
                {
                    // Render the output using HtmlRenderer
                    renderer.render(device, document);
                }
                finally
                {
                    if (document != null)
                        (document).dispose();
                }
            }
            finally
            {
                if (renderer != null)
                    (renderer).dispose();
            }
        }
        finally
        {
            if (device != null)
                (device).dispose();
        }
        //ExEnd:HtmlToXPS
    }
}
