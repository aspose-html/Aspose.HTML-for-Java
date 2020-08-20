package com.aspose.html.examples.java;

public class Examples_Java_Document_SaveDocument_HTMLToMarkDown {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.java.RunExamples.GetDataDir_Data();
        var document = new com.aspose.html.HTMLDocument("<h1>heading text</h1>", "about:blank");
        try {
            // Create corresponding save options
            var saveOptions = com.aspose.html.saving.MarkdownSaveOptions.getGit();

            // Save to .md file
            document.save(dataDir + "HTMLToMarkDown_out.md", saveOptions);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}