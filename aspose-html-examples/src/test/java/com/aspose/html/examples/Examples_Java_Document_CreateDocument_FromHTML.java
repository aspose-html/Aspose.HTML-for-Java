package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_FromHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", ".");
        try {
            // do some actions over the document here...
        } finally {
            document.dispose();
        }
    }
}