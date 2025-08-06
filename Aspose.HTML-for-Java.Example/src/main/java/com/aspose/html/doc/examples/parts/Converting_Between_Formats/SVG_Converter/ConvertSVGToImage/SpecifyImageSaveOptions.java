package com.aspose.html.doc.examples.parts.Converting_Between_Formats.SVG_Converter.ConvertSVGToImage;

import com.aspose.html.SmoothingMode;
import com.aspose.html.converters.Converter;
import com.aspose.html.drawing.Color;
import com.aspose.html.drawing.Length;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class SpecifyImageSaveOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET ConvertSVGToImage_SpecifyImageSaveOptions
        // Prepare SVG code and save it to a file
        String code =
                "<svg width='450' height='450' xmlns='http://www.w3.org/2000/svg'>" +
                        "    <g fill='RoyalBlue'>" +
                        "        <rect x='100' y='100' rx='25' ry='25' width='200' height='56' />" +
                        "        <rect x='100' y='100' rx='25' ry='25' width='200' height='56' transform ='rotate(90 200 128)' />" +
                        "        <rect x='100' y='100' rx='25' ry='25' width='200' height='56' transform ='rotate(-45 200 128)' />" +
                        "        <rect x='100' y='100' rx='25' ry='25' width='200' height='56' transform ='rotate(45 200 128)' />" +
                        "    </g>" +
                        "    <circle cx='200' cy='128' r='28' stroke='pink' stroke-width='50'  stroke-dasharray='3 13' fill='Orange' />" +
                        "    <circle cx='200' cy='128' r='5' />" +
                        "</svg>";

        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("flower.svg"))) {
            fileWriter.write(code);
        }

        // Initialize ImageSaveOptions and set up smoothing mode, page size, and background color
        ImageSaveOptions options = new ImageSaveOptions(ImageFormat.Jpeg);
        PageSetup pageSetup = new PageSetup();
        options.setSmoothingMode(SmoothingMode.HighQuality);
        Page anyPage = new Page();
        anyPage.setSize(new Size(Length.fromPixels(200), Length.fromPixels(200)));
        pageSetup.setAnyPage(anyPage);
        options.setPageSetup(pageSetup);
        options.setBackgroundColor(Color.getAliceBlue());

        // Call the convertSVG() method to convert the "flower.svg" file to a JPEG image
        Converter.convertSVG("flower.svg", options, $o("flower.jpg"));
        // @END_SNIPPET
    }
}
