package com.aspose.html.examples.java;

public class Examples_Java_Document_LoadHtmlUsingURL_LoadHtmlUsingURL {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String InputHtml = "http://aspose.com/";
        // Load HTML file using Url instance
        var document = new com.aspose.html.HTMLDocument(new com.aspose.html.Url(InputHtml));
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
    }
}