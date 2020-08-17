package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_FromLocalFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(Resources.input("input.html"));
        try {
            // do some actions over the document here...
        } finally {
            document.dispose();
        }
    }
}