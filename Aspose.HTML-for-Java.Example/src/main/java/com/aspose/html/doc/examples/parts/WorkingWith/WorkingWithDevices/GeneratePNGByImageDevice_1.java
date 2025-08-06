package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithDevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.rendering.image.ImageDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class GeneratePNGByImageDevice_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET GeneratePNGByImageDevice_1
        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");

        ImageDevice device = new ImageDevice($o("document_out.png"));

        document.renderTo(device);
        // @END_SNIPPET
    }
}