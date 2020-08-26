package com.aspose.html.examples;

public class SimpleWait {

    public static void main(String... args) throws Exception {

        Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad html =
                new Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad();
        HTMLDocumentWaiter htmlDocumentWaiter = new HTMLDocumentWaiter(html);
        new Thread(htmlDocumentWaiter, "html").start();

    }

}