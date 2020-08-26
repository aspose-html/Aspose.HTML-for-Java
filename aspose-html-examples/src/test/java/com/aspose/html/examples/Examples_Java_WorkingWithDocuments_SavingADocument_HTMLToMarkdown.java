package com.aspose.html.examples;

public class Examples_Java_WorkingWithDocuments_SavingADocument_HTMLToMarkdown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        // Prepare an HTML code
        String html_code = "<H2>Hello World!</H2>";

        // Initialize document from the string variable
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(html_code, ".");
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