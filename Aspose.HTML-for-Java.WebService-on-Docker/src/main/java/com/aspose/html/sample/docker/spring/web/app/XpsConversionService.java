package com.aspose.html.sample.docker.spring.web.app;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Paths;

@Service
public class XpsConversionService extends AbstractConversionService implements ConversionService {
    @Override
    public String convert(String filename, Boolean adjustToWidestPage, 
                        Double pageWidth, Double pageHeight) throws IOException {
        String inputFile = Paths.get(inputDir, filename).toString();
        String outputFileName = generateOutputFileName(filename, "xps");
        String outputFile = Paths.get(outputDir, outputFileName).toString();

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(inputFile);
        com.aspose.html.saving.XpsSaveOptions options = new com.aspose.html.saving.XpsSaveOptions();
        
        configurePageSetup(options.getPageSetup(), adjustToWidestPage, pageWidth, pageHeight);
        
        com.aspose.html.converters.Converter.convertHTML(document, options, outputFile);
        return outputFileName;
    }
}
