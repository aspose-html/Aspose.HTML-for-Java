package com.aspose.html.examples;

public class Examples_Java_Conversion_AdjustXPSPageSize_AdjustXPSPageSize {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        // Set input file name.
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("FirstFile.html"))) {
            try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(Resources.output("FirstFileOut.html"))) {
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
            }

            // Create HtmlRenderer object
            com.aspose.html.rendering.HtmlRenderer renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create HtmlDocument instnace while passing path of already created HTML file
                com.aspose.html.HTMLDocument html_document = new com.aspose.html.HTMLDocument(Resources.output("FirstFileOut.html"));
                try {
                    // Set the page size less than document min-width. The content in the resulting file will be cropped becuase of element with width: 200px
                    com.aspose.html.rendering.xps.XpsRenderingOptions xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
                    com.aspose.html.drawing.Page page = new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100));
                    com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(page);
                    pageSetup.setAdjustToWidestPage(false);
                    xps_options.setPageSetup(pageSetup);

                    String output = Resources.output("not-adjusted-to-widest-page_out.1.xps");
                    com.aspose.html.rendering.xps.XpsDevice device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, output);
                    try {
                        // Render the output
                        renderer.render(device, html_document);
                    } finally {
                        if (device != null) {
                            device.dispose();
                        }
                    }

                    // Set the page size less than document min-width and enable AdjustToWidestPage option
                    // The page size of the resulting file will be changed according to content width
                    xps_options = new com.aspose.html.rendering.xps.XpsRenderingOptions();
                    page = new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100));
                    pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(page);
                    pageSetup.setAdjustToWidestPage(true);
                    xps_options.setPageSetup(pageSetup);

                    output = Resources.output("not-adjusted-to-widest-page_out.2.xps");
                    device = new com.aspose.html.rendering.xps.XpsDevice(xps_options, output);
                    try {
                        // Render the output
                        renderer.render(device, html_document);
                    } finally {
                        if (device != null) {
                            device.dispose();
                        }
                    }
                } finally {
                    if (html_document != null) {
                        html_document.dispose();
                    }
                }
            } finally {
                if (renderer != null) {
                    renderer.dispose();
                }
            }
        }
    }
}
