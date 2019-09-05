package com.aspose.html.examples.java;

import com.aspose.html.examples.java.conversion.AdjustPdfPageSize;
import com.aspose.html.examples.java.conversion.AdjustXPSPageSize;
import com.aspose.html.examples.java.conversion.CanvasToPDF;
import com.aspose.html.examples.java.conversion.HTMLtoMHTML;
import com.aspose.html.examples.java.conversion.HTMLtoMarkdown;
import com.aspose.html.examples.java.conversion.HTMLtoPNG;
import com.aspose.html.examples.java.conversion.HTMLtoTIFF;
import com.aspose.html.examples.java.conversion.HtmlToPdf;
import com.aspose.html.examples.java.conversion.HtmlToXPS;
import com.aspose.html.examples.java.conversion.SVGtoXPS;
import com.aspose.html.examples.java.document.CreateSimpleDocument;
import com.aspose.html.examples.java.document.LoadHTMLdocAsyn;
import com.aspose.html.examples.java.document.LoadHtmlDoc;
import com.aspose.html.examples.java.document.LoadHtmlDocWithCredentials;
import com.aspose.html.examples.java.document.LoadHtmlUsingRemoteServer;
import com.aspose.html.examples.java.document.LoadHtmlUsingURL;
import com.aspose.html.examples.java.document.ManipulateCanvas;
import com.aspose.html.examples.java.document.ReadInnerHtml;
import com.aspose.html.examples.java.workingwithcss.UseExtendedContentProperty;
import com.aspose.html.examples.java.workingwithdevices.GenerateEncryptedPDFByPdfDevice;
import com.aspose.html.examples.java.workingwithdevices.GenerateJPGByImageDevice;
import com.aspose.html.examples.java.workingwithdevices.GeneratePNGByImageDevice;
import com.aspose.html.examples.java.workingwithdevices.GenerateXPSByXpsDevice;
import com.aspose.html.examples.java.workingwithmutationobserver.MutationObserverExample;
import com.aspose.html.examples.java.workingwithrenderers.RenderHTMLAsPNG;
import com.aspose.html.examples.java.workingwithrenderers.RenderMHTMLAsXPS;
import com.aspose.html.examples.java.workingwithrenderers.RenderMultipleDocuments;
import com.aspose.html.examples.java.workingwithrenderers.RenderSVGDocAsPNG;
import com.aspose.html.examples.java.workingwithrenderers.RenderingTimeout;
import com.aspose.html.internal.ms.System.IO.Directory;
import com.aspose.html.internal.ms.System.IO.DirectoryInfo;
import com.aspose.html.internal.ms.System.IO.Path;

import java.io.File;


public class RunExamples
{
    public static void main(String[] args)
    {
        System.out.println("Open RunExamples.java. \nIn main() method uncomment the example that you want to run.");
        System.out.println("=====================================================");
        //Uncomment the one you want to try out

        // =====================================================
        // =====================================================
        // Aspose.HTML 
        // =====================================================
        // =====================================================

        //Document
        //=====================================================            
        //LoadHtmlDoc.run();
        //ReadInnerHtml.run();
        //LoadHtmlUsingURL.run();
        //LoadHtmlUsingRemoteServer.run();
        //LoadHtmlDocWithCredentials.run();
        //CreateSimpleDocument.run();
        //ManipulateCanvas.run();
        //LoadHTMLdocAsyn.run();
        //LoadHTMLdocAsyn.eventNavigate();


        //Conversion
        //=====================================================            
        //HtmlToPdf.run();
        //AdjustPdfPageSize.run();
        //HtmlToXPS.run();
        //AdjustXPSPageSize.run();
        //SVGtoXPS.run();
        //HTMLtoPNG.run();
        //HTMLtoTIFF.run();
        //CanvasToPDF.run();
        //HTMLtoMarkdown.run();
        //HTMLtoMHTML.run();

        //WorkingWithCSS
        //===================================================== 
        //UseExtendedContentProperty.run();

        //WorkingWithDevices
        //===================================================== 
        //GeneratePNGByImageDevice.run();
        //GenerateJPGByImageDevice.run();
        //GenerateXPSByXpsDevice.run();
        //GenerateEncryptedPDFByPdfDevice.run();

        //WorkingWithRenderers
        //===================================================== 
        //RenderHTMLAsPNG.run();
        //RenderSVGDocAsPNG.run();
        //RenderEPUBAsXPS.run();
        //RenderMHTMLAsXPS.run();
        //RenderMultipleDocuments.run();
        //RenderingTimeout.run();
        //RenderingTimeout.indefiniteTimeout();


        //QuickStart
        //=====================================================            
        //ApplyMeteredLicense.run();

        //MutationObserver
        //=====================================================            
        //MutationObserverExample.run();


        // Stop before exiting
        //System.out.println("\n\nProgram Finished. Press Enter to exit....");
        //Console.readLine();
    }
    public static String getDataDir_Data()
    {    File dir = new File(System.getProperty("user.dir"));
        return dir.toString() + "/Data/";
    }
}
