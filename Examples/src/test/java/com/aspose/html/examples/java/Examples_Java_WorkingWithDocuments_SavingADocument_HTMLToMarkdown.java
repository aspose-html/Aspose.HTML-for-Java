package com.aspose.html.examples.java;

public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLToMarkdown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        // Prepare an HTML code
        var html_code = "<H2>Hello World!</H2>";

        // Initialize document from the string variable
        var document = new com.aspose.html.HTMLDocument(html_code, ".");
        try {
            // Save the document as a Markdown file.
            document.save(dataDir + "document.md", com.aspose.html.saving.HTMLSaveFormat.Markdown);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}