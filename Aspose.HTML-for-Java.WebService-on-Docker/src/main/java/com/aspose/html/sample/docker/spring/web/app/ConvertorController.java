package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ConvertorController {

    /*Linux*/
    private static final String WEB_SERVICE_WORKDIR = "/home/aspose-html-for-java/sample-web-service";
    private static final String ASSETS_DIR = WEB_SERVICE_WORKDIR + "/assets";
    private static final String INPUT_HTML_FILE = ASSETS_DIR + "/index.html";
    private static final String OUTPUT_DIR = WEB_SERVICE_WORKDIR + "/output";

    @GetMapping("/")
    public RedirectView redirectToHomePage() {
        return new RedirectView("/aspose-html-for-java/sample-web-service");
    }

    @GetMapping("/aspose-html-for-java/sample-web-service")
    public String homePage() {
        return """
            <!DOCTYPE html>
            <html>
            <head>
                <title>Aspose.HTML for Java - Web Service</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 0;
                        padding: 20px;
                        background-color: #f0f0f0;
                    }
                    .container {
                        max-width: 800px;
                        margin: 0 auto;
                        background-color: white;
                        padding: 30px;
                        border-radius: 8px;
                        box-shadow: 0 2px 4px rgba(0,0,0,0.1);
                    }
                    h1 {
                        color: #2c3e50;
                        text-align: center;
                    }
                    .convert-link {
                        display: inline-block;
                        background-color: #3498db;
                        color: white;
                        padding: 12px 24px;
                        text-decoration: none;
                        border-radius: 4px;
                        margin-top: 20px;
                        text-align: center;
                    }
                    .convert-link:hover {
                        background-color: #2980b9;
                    }
                </style>
            </head>
            <body>
                <div class="container">
                    <h1>HTML to PDF Converter</h1>
                    <p>Welcome to the Aspose.HTML for Java demo web service. 
                       This service demonstrates the capabilities of converting HTML documents to PDF format.</p>
                    <center>
                        <a href="/aspose-html-for-java/sample-web-service/convert-html-to-pdf" 
                           class="convert-link">Convert HTML to PDF</a>
                    </center>
                </div>
            </body>
            </html>
            """;
    }

    @GetMapping("/aspose-html-for-java/sample-web-service/convert-html-to-pdf")
    public String convertHtmlToPdf() {
        com.aspose.html.HTMLDocument htmlDocument = new com.aspose.html.HTMLDocument(INPUT_HTML_FILE);

        com.aspose.html.saving.PdfSaveOptions options = new com.aspose.html.saving.PdfSaveOptions();

        options.getPageSetup().setAnyPage(new com.aspose.html.drawing.Page(
                new com.aspose.html.drawing.Size(
                        com.aspose.html.drawing.Length.fromInches(11.69),
                        com.aspose.html.drawing.Length.fromInches(8.26)
                ),
                new com.aspose.html.drawing.Margin(0, 0, 0, 0)
        ));
        options.getPageSetup().setAdjustToWidestPage(true);

        String resultOutputPdfFile = OUTPUT_DIR + new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss").format(new Date()) + ".pdf";

        com.aspose.html.converters.Converter.convertHTML(htmlDocument, options, resultOutputPdfFile);

        return "HTML converted to PDF successfully.";
    }


}
