package com.aspose.html.doc.examples.parts.How_to_Articles;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.rendering.xps.XpsRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class AdjustXPSPageSize_AdjustXPSPageSize {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET AdjustXPSPageSize_AdjustXPSPageSize
        // Set input file name.
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("FirstFile.html"));
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream($o("FirstFileOut.html"));
        byte[] bytes = new byte[fileInputStream.available()];
        fileInputStream.read(bytes);
        fileOutputStream.write(bytes);
        String style = "<style>\n" +
                ".st\n" +
                "{\n" +
                "color: green;\n" +
                "}\n" +
                "</style>\n" +
                "<div id=id1>Aspose.Html rendering Text in Black Color</div>\n" +
                "<div id=id2 class=''st''>Aspose.Html rendering Text in Green Color</div>\n" +
                "<div id=id3 class=''st'' style='color: blue;'>Aspose.Html rendering Text in Blue Color</div>\n" +
                "<div id=id3 class=''st'' style='color: red;'>Aspose.Html rendering Text in Red Color</div>\n";
        fileOutputStream.write(style.getBytes(java.nio.charset.StandardCharsets.UTF_8));

        // Create HtmlRenderer object
        HtmlRenderer renderer = new HtmlRenderer();

        // Create HtmlDocument instnace while passing path of already created HTML file
        HTMLDocument html_document = new HTMLDocument($o("FirstFileOut.html"));

        // Set the page size less than document min-width. The content in the resulting file will be cropped becuase of element with width: 200px
        XpsRenderingOptions xps_options = new XpsRenderingOptions();
        Page page = new Page(new Size(100, 100));
        PageSetup pageSetup = new PageSetup();
        pageSetup.setAnyPage(page);
        pageSetup.setAdjustToWidestPage(false);
        xps_options.setPageSetup(pageSetup);

        String output = $o("not-adjusted-to-widest-page_out.1.xps");
        XpsDevice device = new XpsDevice(xps_options, output);

        // Render the output
        renderer.render(device, html_document);

        // Set the page size less than document min-width and enable AdjustToWidestPage option
        // The page size of the resulting file will be changed according to content width
        xps_options = new XpsRenderingOptions();
        page = new Page(new Size(100, 100));
        pageSetup = new PageSetup();
        pageSetup.setAnyPage(page);
        pageSetup.setAdjustToWidestPage(true);
        xps_options.setPageSetup(pageSetup);

        output = $o("not-adjusted-to-widest-page_out.2.xps");
        device = new XpsDevice(xps_options, output);

        // Render the output
        renderer.render(device, html_document);
        // @END_SNIPPET
    }
}
