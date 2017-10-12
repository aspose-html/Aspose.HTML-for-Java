package com.aspose.html.examples.document;

public class LoadHtmlUsingURL {
    /**
     * The main entry point for the application.
     */
    public static void main(String[] args) throws Exception
    {
        //ExStart:LoadHtmlUsingURL
        // Load HTML file using Url instance
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(new com.aspose.html.Url("http://aspose.com/"));
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
        //ExEnd:LoadHtmlUsingURL
    }
}
