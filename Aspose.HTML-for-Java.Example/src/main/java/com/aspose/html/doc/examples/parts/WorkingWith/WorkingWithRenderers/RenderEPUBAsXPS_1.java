package com.aspose.html.doc.examples.parts.WorkingWith.WorkingWithRenderers;

import com.aspose.html.Configuration;
import com.aspose.html.rendering.EpubRenderer;
import com.aspose.html.rendering.xps.XpsDevice;

import static com.aspose.html.doc.examples.utils.Resources.$i;
import static com.aspose.html.doc.examples.utils.Resources.$o;

public class RenderEPUBAsXPS_1 {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("document.epub"));
        XpsDevice device = new XpsDevice($o("document_out.xps"));
        EpubRenderer renderer = new EpubRenderer();
        renderer.render(device, fileInputStream, new Configuration());
    }
}