package com.aspose.html.examples;

public class Examples_Java_Conversion_HTMLtoMarkdown_HTMLtoMarkdown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // The path to the documents directory.
        String dataDir = RunExamples.getResourcePath();

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>" + "<p>my second paragraph</p>", dataDir);
        try {
            document.save(dataDir + "Markdown.md", com.aspose.html.saving.HTMLSaveFormat.Markdown);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}