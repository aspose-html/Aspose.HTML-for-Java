package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPNG;

import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class WithASingleLine_16 {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPNG_WithASingleLine
        // Invoke the convertSVG() method for SVG to PNG conversion
        Converter.convertSVG($i("shapes.svg"), new ImageSaveOptions(ImageFormat.Png), $o("convert-with-single-line.png"));
        // @END_SNIPPET
        Assert.True(FileHelper.exists($o("convert-with-single-line.png")));
    }
}
