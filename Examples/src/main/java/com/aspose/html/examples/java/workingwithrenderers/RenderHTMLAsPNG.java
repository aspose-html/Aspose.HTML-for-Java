package com.aspose.html.examples.java.workingwithrenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;



public class RenderHTMLAsPNG
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
            HtmlRenderer renderer = new HtmlRenderer();
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
