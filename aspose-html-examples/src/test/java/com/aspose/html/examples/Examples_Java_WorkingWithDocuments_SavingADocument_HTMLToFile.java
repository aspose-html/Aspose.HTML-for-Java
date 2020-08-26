package com.aspose.html.examples;


public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLToFile {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Initialize an empty HTML Document.
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();
        try {
            // Create a text element and add it to the document
            com.aspose.html.dom.Text text = document.createTextNode("Hello World!");
            document.getBody().appendChild(text);

            // Save the HTML to the file on disk.
            document.save(dataDir + "document.html");
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}