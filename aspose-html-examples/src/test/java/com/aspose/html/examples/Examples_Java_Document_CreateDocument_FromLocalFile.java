package com.aspose.html.examples;

public class Examples_Java_Document_CreateDocument_FromLocalFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        var document = new com.aspose.html.HTMLDocument(dataDir + "input.html");
        try {
            // do some actions over the document here...
        } finally {
            document.dispose();
        }
    }
}