package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;

@Service
public class PngConversionService extends AbstractConversionService implements ConversionService {
    @Override
    public String convert(String filename, Boolean adjustToWidestPage, 
                        Double pageWidth, Double pageHeight) throws IOException {
        String inputFile = Paths.get(inputDir, filename).toString();
        String outputFileName = generateOutputFileName(filename, "png");
        String outputFile = Paths.get(outputDir, outputFileName).toString();

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(inputFile);
        com.aspose.html.saving.ImageSaveOptions options = 
            new com.aspose.html.saving.ImageSaveOptions(com.aspose.html.rendering.image.ImageFormat.Png);
        
        if (pageWidth != null && pageHeight != null) {
            options.setPageSetup(new com.aspose.html.rendering.PageSetup());
            configurePageSetup(options.getPageSetup(), false, pageWidth, pageHeight);
        }
        
        com.aspose.html.converters.Converter.convertHTML(document, options, outputFile);
        return outputFileName;
    }
}
