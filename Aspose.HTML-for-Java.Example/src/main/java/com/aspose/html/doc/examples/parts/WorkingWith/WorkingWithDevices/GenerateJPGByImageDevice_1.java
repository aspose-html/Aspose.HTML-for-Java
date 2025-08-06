package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithDevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class GenerateJPGByImageDevice_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET GenerateJPGByImageDevice_1
        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");

        // Initialize rendering optionss and set jpeg as output format
        ImageRenderingOptions options = new ImageRenderingOptions(ImageFormat.Jpeg);

        // Set the size and margin property for all pages.
        options.getPageSetup().setAnyPage(
                new Page(
                        new Size(500, 500),
                        new Margin(50, 50, 50, 50)
                )
        );

        //  If the document has an element which size is bigger than predefined by user page size output pages will be will be adjusted.
        options.getPageSetup().setAdjustToWidestPage(true);

        ImageDevice device = new ImageDevice(options, $o("document_out.jpg"));

        document.renderTo(device);
        // @END_SNIPPET
    }
}