package com.aspose.html.examples.document;
import com.aspose.html.examples.Utils;

public class ReadInnerHtml {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:ReadInnerHtml
        // The path to the documents directory.
        String dataDir = Utils.getDataDir();
        // Create HtmlDocument instance to load existing HTML file
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument( dataDir +  "input.html");
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
        //ExEnd:ReadInnerHtml
    }
}
