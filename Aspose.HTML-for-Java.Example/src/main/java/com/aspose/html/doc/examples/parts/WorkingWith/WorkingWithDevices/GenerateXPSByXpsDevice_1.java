package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithDevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.rendering.PageSetup;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.rendering.xps.XpsRenderingOptions;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class GenerateXPSByXpsDevice_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET GenerateXPSByXpsDevice_1
        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", $i("c_work"));

        XpsRenderingOptions xpsRenderingOptions = new XpsRenderingOptions();
        PageSetup pageSetup = new PageSetup();
        Page anyPage = new Page(
                new Size(500, 500),
                new Margin(50, 50, 50, 50)
        );
        pageSetup.setAnyPage(anyPage);
        xpsRenderingOptions.setPageSetup(pageSetup);
        XpsDevice device = new XpsDevice(xpsRenderingOptions, $o("document_out.xps"));

        document.renderTo(device);
        // @END_SNIPPET
    }
}