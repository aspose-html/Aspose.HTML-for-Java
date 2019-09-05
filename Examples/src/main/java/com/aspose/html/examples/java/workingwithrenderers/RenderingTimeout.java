package com.aspose.html.examples.java.workingwithrenderers;

import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Document;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.internal.ms.System.TimeSpan;
import com.aspose.html.rendering.HtmlRenderer;
import com.aspose.html.rendering.image.ImageDevice;



public class RenderingTimeout
{
    public static void run()
    {
        // ExStart:RenderingTimeout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        // Create an instance of the HTML document
        HTMLDocument document = new HTMLDocument();
        try
        {
            // Async loading of the external html file
            document.navigate(StringExtensions.concat(dataDir,  "input.html"));

            // Create a renderer and output device 
            HtmlRenderer renderer = new HtmlRenderer();
            try
            {
            ImageDevice device = new ImageDevice(StringExtensions.concat(dataDir,  "document.png"));
            try
            {

                // Delay rendering for 5 seconds
                // Note: document will be rendered into device if there are no scripts or any internal tasks to execute
                renderer.render(device, TimeSpan.fromSeconds(5).Clone(), document);
            }
            finally { if (device != null) device.dispose(); }
            }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document != null) document.dispose(); }

        // ExEnd:RenderingTimeout
    }


    public static void indefiniteTimeout()
    {
        // ExStart:IndefiniteTimeout
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        // Create an instance of the HTML document
        HTMLDocument document = new HTMLDocument();
        try
        {
            // Async loading of the external html file
            document.navigate(StringExtensions.concat(dataDir,  "input.html"));

            // Create a renderer and output device 
            HtmlRenderer renderer = new HtmlRenderer();
            try
            {
            ImageDevice device = new ImageDevice(StringExtensions.concat(dataDir,  "document.png"));
            try
            {
                Document[] documents = {document};
				// Delay the rendering indefinitely until there are no scripts or any other internal tasks to execute
                renderer.render(device, -1, documents);
            }
            finally { if (device != null) device.dispose(); }
            }
            finally { if (renderer != null) renderer.dispose(); }
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:IndefiniteTimeout
    }
}
