package com.aspose.html.examples.Getting_Started;

import com.aspose.html.converters.Converter;
import com.aspose.html.examples.utils.Assert;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertHTMLToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertHtmlToPdfInOneLineOfCode.java
        // Convert HTML to PDF in one line of code using Java
        // Learn more: https://docs.aspose.com/html/java/getting-started/

        // Invoke the ConvertHTML method to convert the HTML to PDF
        Converter.convertHTML("<span>Hello, World!!</span>", ".", new PdfSaveOptions(), $o("output.pdf"));
        // @END_SNIPPET
        Assert.True(FileHelper.exists($o("convert-with-single-line.pdf")));
    }
}