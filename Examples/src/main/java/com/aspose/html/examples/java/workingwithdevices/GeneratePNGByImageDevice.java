package com.aspose.html.examples.java.workingwithdevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.image.ImageDevice;



public class GeneratePNGByImageDevice
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument  document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
            ImageDevice device = new ImageDevice(StringExtensions.concat(dataDir,  "document_out.png"));
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
