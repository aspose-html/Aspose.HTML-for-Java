package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public abstract class AbstractConversionService {
    @Value("${app.input-dir}")
    protected String inputDir;

    @Value("${app.output-dir}")
    protected String outputDir;

    protected String generateOutputFileName(String inputFilename, String extension) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(new Date());
        String baseFileName = inputFilename.replaceAll("\\.[^.]+$", "");
        return timestamp + "_" + baseFileName + "." + extension;
    }

    protected void configurePageSetup(com.aspose.html.rendering.PageSetup pageSetup,
                                    Boolean adjustToWidestPage,
                                    Double pageWidth,
                                    Double pageHeight) {
        if (pageWidth != null && pageHeight != null) {
            pageSetup.setAnyPage(new com.aspose.html.drawing.Page(
                new com.aspose.html.drawing.Size(
                    com.aspose.html.drawing.Length.fromInches(pageWidth),
                    com.aspose.html.drawing.Length.fromInches(pageHeight)
                ),
                new com.aspose.html.drawing.Margin(0, 0, 0, 0)
            ));
        }
        if (adjustToWidestPage != null) {
            pageSetup.setAdjustToWidestPage(adjustToWidestPage);
        }
    }
}
