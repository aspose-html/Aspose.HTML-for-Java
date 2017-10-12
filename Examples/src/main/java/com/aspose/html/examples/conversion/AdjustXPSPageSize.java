package com.aspose.html.examples.conversion;
import com.aspose.html.examples.Utils;
import java.io.File;
import java.io.FileOutputStream;

public class AdjustXPSPageSize {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:AdjustXPSPageSize
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


        // Create HtmlRenderer object
        final com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
        // Create HtmlDocument instance while passing path of already created HTML file
        final com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(SimpleStyledFilePath);
        // Set the page size less than document min-width. The content in the resulting file will be cropped because of element with width: 200px
        com.aspose.html.rendering.xps.XpsRenderingOptions xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
        try
        {
            xps_options.getPageSetup().setAnyPage(new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100)));
            String Resultnat_output =  dataDir + "not-adjusted-to-widest-page_out.xps";
            final com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, Resultnat_output);
            try
            {
                // render the output using HtmlRenderer
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

        String output = dataDir +  "adjusted-to-widest-page_out.xps";
        final com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, output);
        try
        {
            // Render the output
            renderer.render(device, document);
        }
        finally
        {
            if (device != null)
                (device).dispose();
        }
        //ExEnd:AdjustXPSPageSize
    }
}
