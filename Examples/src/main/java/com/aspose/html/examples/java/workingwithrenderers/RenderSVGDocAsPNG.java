package com.aspose.html.examples.java.workingwithrenderers;

import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.SvgRenderer;
import com.aspose.html.rendering.image.ImageDevice;


public class RenderSVGDocAsPNG
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        SVGDocument document = new SVGDocument("<svg xmlns='http://www.w3.org/2000/svg'><circle cx='50' cy='50' r='40'/></svg>", "c:\\work\\");
        try
        {
            SvgRenderer renderer = new SvgRenderer();
            try
            {
            ImageDevice device = new ImageDevice(StringExtensions.concat(dataDir,  "document_out.png"));
            try
            {
                renderer.render(device, document);
            }
            finally { if (device != null) device.dispose(); }
            }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:1
    }
}
