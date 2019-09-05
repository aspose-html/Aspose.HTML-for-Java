package com.aspose.html.examples.java.workingwithdevices;
import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.xps.XpsDevice;
import com.aspose.html.rendering.xps.XpsRenderingOptions;



public class GenerateXPSByXpsDevice
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
           XpsRenderingOptions xps_opt = new XpsRenderingOptions();
            xps_opt.getPageSetup().setAnyPage(new Page(new Size(500, 500), new Margin(50, 50, 50, 50)));
            XpsDevice device = new XpsDevice(xps_opt, StringExtensions.concat(dataDir,  "document_out.xps"));
            try
            {
                document.renderTo(device);
            }
            finally { if (device != null) device.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:1
    }
}
