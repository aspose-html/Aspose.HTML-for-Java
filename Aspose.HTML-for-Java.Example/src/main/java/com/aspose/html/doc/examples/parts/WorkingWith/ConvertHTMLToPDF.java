package com.aspose.html.doc.examples.parts.WorkingWith;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.saving.PdfSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class ConvertHTMLToPDF {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertHTMLToPDF
        // Invoke the ConvertHTML method to convert the HTML to PDF.
        Converter.convertHTML("<span>Hello, World!!</span>", ".", new PdfSaveOptions(), $o("output.pdf"));
        // @END_SNIPPET
        Assert.True(FileHelper.exists($o("convert-with-single-line.pdf")));
    }
}
