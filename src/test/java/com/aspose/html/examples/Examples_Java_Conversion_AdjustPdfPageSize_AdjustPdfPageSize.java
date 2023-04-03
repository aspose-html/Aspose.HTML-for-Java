package com.aspose.html.examples;

public class Examples_Java_Conversion_AdjustPdfPageSize_AdjustPdfPageSize {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        //@START
        try (java.io.FileInputStream fileInputStream = new java.io.FileInputStream(Resources.input("FirstFile.html"))) {
            try (java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(Resources.output("FirstFileOut.html"))) {
                byte[] bytes = new byte[fileInputStream.available()];
                fileInputStream.read(bytes);
                fileOutputStream.write(bytes);
                String style = "<style>\n" +
                               ".st\n" +
                               "{\n" +
                               "color:\n" +
                               "green;\n" +
                               "}\n" +
                               "</style >\n" +
                               "<div id = id1 > Aspose.Html rendering Text in Black Color</div >\n" +
                               "<div id = id2 class='' st '' > Aspose.Html rendering Text in Green Color</div >\n" +
                               "<div id = id3 class='' st '' style = 'color: blue;' > Aspose.Html rendering Text in Blue Color</div >\n" +
                               "<div id = id3 class='' st '' style = 'color: red;' ><font face = 'Arial' > Aspose.Html rendering Text in Red\n" +
                               "Color</font ></div >\n";
                fileOutputStream.write(style.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            }

            String pdf_output;
            // Create HtmlRenderer object
            com.aspose.html.rendering.HtmlRenderer pdf_renderer = new com.aspose.html.rendering.HtmlRenderer();
            try {
                // Create HtmlDocument instnace while passing path of already created HTML file
                com.aspose.html.HTMLDocument html_document = new com.aspose.html.HTMLDocument(Resources.output("FirstFileOut.html"));
                try {
                    // Set the page size less than document min-width. The content in the resulting file will be cropped becuase of element with width: 200px
                    com.aspose.html.rendering.pdf.PdfRenderingOptions pdf_options =
                            new com.aspose.html.rendering.pdf.PdfRenderingOptions();
                    com.aspose.html.rendering.PageSetup pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100)));
                    pageSetup.setAdjustToWidestPage(false);
                    pdf_options.setPageSetup(pageSetup);

                    pdf_output = Resources.output("not-adjusted-to-widest-page_out.pdf");
                    com.aspose.html.rendering.pdf.PdfDevice device = new com.aspose.html.rendering.pdf.PdfDevice(pdf_options, pdf_output);
                    try {
                        // Render the output
                        pdf_renderer.render(device, html_document);
                    } finally {
                        if (device != null) {
                            device.dispose();
                        }
                    }

                    // Set the page size less than document min-width and enable AdjustToWidestPage option. The page size of the resulting file will be changed according to content width
                    pdf_options = new com.aspose.html.rendering.pdf.PdfRenderingOptions();
                    pageSetup = new com.aspose.html.rendering.PageSetup();
                    pageSetup.setAnyPage(new com.aspose.html.drawing.Page(new com.aspose.html.drawing.Size(100, 100)));
                    pageSetup.setAdjustToWidestPage(true);
                    pdf_options.setPageSetup(pageSetup);

                    pdf_output = Resources.output("adjusted-to-widest-page_out.pdf");
                    device = new com.aspose.html.rendering.pdf.PdfDevice(pdf_options, pdf_output);
                    try {
                        // Render the output
                        pdf_renderer.render(device, html_document);
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
                if (pdf_renderer != null) {
                    pdf_renderer.dispose();
                }
            }
        }
        //@END
    }
}