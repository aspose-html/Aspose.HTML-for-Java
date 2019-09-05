package com.aspose.html.examples.java.workingwithdevices;

import com.aspose.html.HTMLDocument;
import com.aspose.html.drawing.Margin;
import com.aspose.html.drawing.Page;
import com.aspose.html.drawing.Size;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.image.ImageDevice;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.rendering.image.ImageRenderingOptions;



public class GenerateJPGByImageDevice
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument  document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
            // Initialize rendering optionss and set jpeg as output format
            ImageRenderingOptions options = new ImageRenderingOptions(ImageFormat.Jpeg);

            // Set the size and margin property for all pages.
            options.getPageSetup().setAnyPage(new Page(new Size(500, 500), new Margin(50, 50, 50, 50)));

            //  If the document has an element which size is bigger than predefined by user page size output pages will be will be adjusted.
            options.getPageSetup().setAdjustToWidestPage(true);

            ImageDevice device = new ImageDevice(options, StringExtensions.concat(dataDir,  "document_out.jpg"));
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
