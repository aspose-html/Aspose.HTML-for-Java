package com.aspose.html.examples;

public class Examples_Java_Document_SaveDocument_HTMLToMHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();

        var document = new com.aspose.html.HTMLDocument("""
                <link href=""c:\\work\\style.css"" rel=""stylesheet"">
                <p>my first paragraph</p>
                """, "about:blank");
        try {
            // Create corresponding save options
            var saveOptions = new com.aspose.html.saving.MHTMLSaveOptions();

            // Set default resource handling behaviour to "embed"
            saveOptions.getResourceHandlingOptions().setDefault(com.aspose.html.saving.ResourceHandling.Embed);

            // Remove URL restrictions because referenced resource is in another domain
            saveOptions.getResourceHandlingOptions().setUrlRestriction(com.aspose.html.saving.UrlRestriction.None);

            // Save to .mht file
            document.save(dataDir + "HtmlToMhtml_out.mht", saveOptions);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}