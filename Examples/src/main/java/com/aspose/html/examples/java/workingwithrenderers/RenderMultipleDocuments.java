package com.aspose.html.examples.java.workingwithrenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.xps.XpsDevice;


public class RenderMultipleDocuments
{
    public static void run()
    {
        // ExStart:1
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument("<style>p { color: green; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
        HTMLDocument document2 = new HTMLDocument("<style>p { color: blue; }</style><p>my first paragraph</p>", "c:\\work\\");
        try
        {
            HtmlRenderer renderer = new HtmlRenderer();
            try
                {
            XpsDevice device = new XpsDevice(StringExtensions.concat(dataDir,  "document_out.xps"));
            try
            {
               HTMLDocument[] documents = {document, document2};
                renderer.render(device, documents);
            }
            finally { if (device != null) device.dispose(); }
                }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document2 != null) document2.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:1
    }
}
