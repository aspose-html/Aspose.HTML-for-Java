package com.aspose.html.examples.Converting_Between_Formats.Fine_Tuning_Converters;

import com.aspose.html.HTMLDocument;
import com.aspose.html.SmoothingMode;
import com.aspose.html.drawing.Resolution;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;

public class SpecifyImageSpecificOptions {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_SpecifyImageRenderingOptionsWhenConvertHtmlToJpg.java
        // Render HTML to JPG with custom resolution and antialiasing settings with Java
        // Learn more: https://docs.aspose.com/html/java/fine-tuning-converters/

        // Prepare HTML code
        String code = "<div>Hello, World!!</div>";

        // Initialize an instance of the HTMLDocument class based on prepared code
        HTMLDocument document = new HTMLDocument(code, ".");

        // Create an instance of the ImageRenderingOptions class
        ImageRenderingOptions options = new ImageRenderingOptions();
        options.setFormat(ImageFormat.Jpeg);

        // Disable smoothing mode
        options.setSmoothingMode(SmoothingMode.None);

        // Set the image resolution as 75 dpi
        options.setVerticalResolution(Resolution.fromDotsPerInch(75));
        options.setHorizontalResolution(Resolution.fromDotsPerInch(75));

        // Create an instance of the ImageDevice class
        ImageDevice device = new ImageDevice(options, "output.jpg");

        // Render HTML to Image
        document.renderTo(device);
        // @END_SNIPPET
    }
}