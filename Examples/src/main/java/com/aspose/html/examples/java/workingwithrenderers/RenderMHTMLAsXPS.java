package com.aspose.html.examples.java.workingwithrenderers;

import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.internal.ms.System.IO.File;
import com.aspose.html.internal.ms.System.IO.FileStream;
import com.aspose.html.rendering.MhtmlRenderer;
import com.aspose.html.rendering.xps.XpsDevice;


public class RenderMHTMLAsXPS
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

         FileStream fs = File.openRead(StringExtensions.concat(dataDir,  "document.mht"));
        try
        {
        XpsDevice device = new XpsDevice(StringExtensions.concat(dataDir,  "document_out.xps"));
        try
            {
         MhtmlRenderer renderer = new MhtmlRenderer();
        try
        {
            renderer.render(device, fs);
        }
        finally { if (renderer != null) renderer.dispose(); }
            }
        finally { if (device != null) device.dispose(); }
        }
        finally { if (fs != null) fs.dispose(); }
        // ExEnd:1
    }
}
