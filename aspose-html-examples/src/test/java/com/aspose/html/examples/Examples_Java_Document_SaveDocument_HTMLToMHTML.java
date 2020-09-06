package com.aspose.html.examples;

public class Examples_Java_Document_SaveDocument_HTMLToMHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(
                "<link href=\"\"c:\\work\\style.css\"\" rel=\"\"stylesheet\"\">\n" +
                "<p>my first paragraph</p>\n", "about:blank");
        try {
            // Create corresponding save options
            com.aspose.html.saving.MHTMLSaveOptions saveOptions = new com.aspose.html.saving.MHTMLSaveOptions();

            // Set default resource handling behaviour to "embed"
            saveOptions.getResourceHandlingOptions().setDefault(com.aspose.html.saving.ResourceHandling.Embed);

            // Remove URL restrictions because referenced resource is in another domain
            saveOptions.getResourceHandlingOptions().setUrlRestriction(com.aspose.html.saving.UrlRestriction.None);

            // Save to .mht file
            document.save(Resources.output("HtmlToMhtml_out.mht"), saveOptions);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}