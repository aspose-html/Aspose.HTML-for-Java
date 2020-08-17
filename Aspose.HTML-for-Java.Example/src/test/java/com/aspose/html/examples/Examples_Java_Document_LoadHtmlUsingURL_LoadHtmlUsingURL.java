package com.aspose.html.examples;

public class Examples_Java_Document_LoadHtmlUsingURL_LoadHtmlUsingURL {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        String InputHtml = "http://aspose.com/";
        // Load HTML file using Url instance
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(new com.aspose.html.Url(InputHtml));
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
    }
}