package com.aspose.html.examples.java;

public class SimpleWait {

    public static void main(String... args) {

        var html =
                new Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad();
        var htmlDocumentWaiter = new HTMLDocumentWaiter(html);
        new Thread(htmlDocumentWaiter, "html").start();

    }

}