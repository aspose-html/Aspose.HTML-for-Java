package com.aspose.html.examples;

public class Examples_Java_Document_ReadInnerHtml_ReadInnerHtml {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        String InputHtml = Resources.input("input.html");
        // Create HtmlDocument instance to load existing HTML file
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(InputHtml);
        // Print inner HTML of file to console
        System.out.println(document.getBody().getInnerHTML());
    }
}