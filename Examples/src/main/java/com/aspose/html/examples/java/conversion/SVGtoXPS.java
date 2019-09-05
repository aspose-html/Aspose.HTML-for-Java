package com.aspose.html.examples.java.conversion;

import com.aspose.html.dom.svg.SVGDocument;
import com.aspose.html.dom.svg.SVGEllipseElement;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.internal.ms.System.IO.File;
import com.aspose.html.rendering.SvgRenderer;
import com.aspose.html.rendering.xps.XpsDevice;



public class SVGtoXPS
{
    public static void run()
    {
        // ExStart:SVGtoXPS
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        // Simple SVG file
        File.writeAllText(StringExtensions.concat(dataDir,  "my.svg"),
            StringExtensions.concat("<svg xmlns=\"http://www.w3.org/2000/svg\" height=\"140\" width=\"500\">", 
            "<ellipse cx=\"200\" cy=\"80\" rx=\"100\" ry=\"50\" style=\"fill:yellow;stroke:purple;stroke-width:2\" />", 
            "</svg>"));

        // Create the new SVG document
        SVGDocument document = new SVGDocument(StringExtensions.concat(dataDir,  "my.svg"));

        // Simple navigation and inspection the element properties
        SVGEllipseElement ellipse = (SVGEllipseElement)document.getElementsByTagName("ellipse").get_Item(0);
        System.out.println(ellipse.getStyle().getCSSText());  // fill: yellow; stroke: purple; stroke-width: 2;

        // Create the new SVG renderer & XPS device
        SvgRenderer renderer = new SvgRenderer();
        try
        {
        XpsDevice device = new XpsDevice(StringExtensions.concat(dataDir,  "my.xps"));
        try
        {
            // Render to the output device
            renderer.render(device, document);
        }
        finally { if (device != null) device.dispose(); }
        }
        finally { if (renderer != null) renderer.dispose(); }
        // ExEnd:SVGtoXPS
    }
}
