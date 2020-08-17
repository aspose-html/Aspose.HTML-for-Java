package com.redhat.spring.cloud.config.docker;

import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.saving.PdfSaveOptions;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    /*Linux*/
    private static final String cssFileDir = "/media/sf_redhat/mystyles.css";
    private static final String htmlfileDir = "/media/sf_redhat/index.html";
    private static final String htmlWithCssfileDir = "/media/sf_redhat/index-with-css.html";
    private static final String outputPDF = "/media/sf_redhat/";


    @GetMapping("/suggestion")
    public String suggestion()
            throws
            IOException {
        String finalPDFDir = "N/A";
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(htmlWithCssfileDir);
        PdfSaveOptions options = new PdfSaveOptions();
        options.getPageSetup()
               .setAnyPage(new Page(
                       new com.aspose.html.drawing.Size(
                               com.aspose.html.drawing.Length.fromInches(11.69),
                               com.aspose.html.drawing.Length.fromInches(8.26)
                       ),
                       new Margin(
                               0,
                               0,
                               0,
                               0
                       )
               ));
        options.getPageSetup().setAdjustToWidestPage(true);

        try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    options,
                    streamProvider.lStream
            );
            java.io.InputStream memory = streamProvider.lStream.get(0);
            memory.reset();
            byte biyes[] = memory.readAllBytes();
            finalPDFDir = outputPDF
                    + new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss").format(new Date()) + ".pdf";
            try (FileOutputStream fos = new FileOutputStream(finalPDFDir)) {
                fos.write(biyes);
            }
        }
        return "Suggested implementation - The final pdf is in this directory:" + finalPDFDir;
    }


    @GetMapping("/aspose")
    public String aspose()
            throws
            IOException {
        String finalPDFDir = "N/A";
        InputStream in = new FileInputStream(htmlfileDir);
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        String line = reader.lines().collect(Collectors.joining());
        Document doc = Jsoup.parse(line);
        Path path = Paths
                .get(cssFileDir);
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(
                doc.html(),
                path.getParent().toString()
        );
        com.aspose.html.dom.Element link = document.createElement("link");
        link.setAttribute(
                "rel",
                "stylesheet"
        );
        link.setAttribute(
                "href",
                path.toUri().toString()
        );
        com.aspose.html.dom.Element head = document.getElementsByTagName("head").get_Item(0);
        head.appendChild(link);
        PdfSaveOptions options = new PdfSaveOptions();
        options.getPageSetup()
               .setAnyPage(new Page(
                       new com.aspose.html.drawing.Size(
                               com.aspose.html.drawing.Length.fromInches(11.69),
                               com.aspose.html.drawing.Length.fromInches(8.26)
                       ),
                       new Margin(
                               0,
                               0,
                               0,
                               0
                       )
               ));
        options.getPageSetup().setAdjustToWidestPage(true);

        try (MemoryStreamProvider streamProvider = new MemoryStreamProvider()) {
            com.aspose.html.converters.Converter.convertHTML(
                    document,
                    options,
                    streamProvider.lStream
            );
            java.io.InputStream memory = streamProvider.lStream.get(0);
            memory.reset();
            byte biyes[] = memory.readAllBytes();
            finalPDFDir = outputPDF
                    + new SimpleDateFormat("dd-MMM-yyyy_HH-mm-ss").format(new Date()) + ".pdf";
            try (FileOutputStream fos = new FileOutputStream(finalPDFDir)) {
                fos.write(biyes);
            }
        }
        return " We need similar config citi - The final pdf is in this directory:" + finalPDFDir;
    }


}
