package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToPNG;

import com.aspose.html.SmoothingMode;
import com.aspose.html.converters.Converter;
import com.aspose.html.doc.examples.utils.Assert;
import com.aspose.html.doc.examples.utils.FileHelper;
import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Resolution;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyImageSaveOptions {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToPNG_SpecifyImageSaveOptions
        // Create an instance of the ImageSaveOptions class. Set up the SmoothingMode, resolutions, and background color
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Png);
        options.setHorizontalResolution(Resolution.to_Resolution(200));
        options.setVerticalResolution(Resolution.to_Resolution(200));
        options.setBackgroundColor(Color.getAliceBlue());
        options.setSmoothingMode(SmoothingMode.HighQuality);

        // Initialize an SVG document from a file
        final SVGDocument document = new SVGDocument($i("flower1.svg"));

        // Convert SVG to PNG
        Converter.convertSVG(document, options, $o("flower-options.png"));
        // @END_SNIPPET
        Assert.True(FileHelper.exists($o("flower-options.png")));
    }
}
