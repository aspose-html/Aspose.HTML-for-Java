package com.aspose.html.examples;

public class Examples_Java_Document_SaveDocument_SaveUsingHTMLSaveOptions {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<p>my first paragraph</p>", "about:blank");
        try {
            // Create options object
            com.aspose.html.saving.HTMLSaveOptions options = new com.aspose.html.saving.HTMLSaveOptions();

            // Set the maximum depth of resource which will be handled.
            // Depth of 1 means that only resources directly referenced from the saved document will be handled.
            // Setting this property to -1 will lead to handling of all resources.
            // Default value is 3
            options.getResourceHandlingOptions().setMaxHandlingDepth(1);

            // This property is used to set restriction applied to handlers of external resources.
            // SameHost means that only resources located at the same host will be saved.
            options.getResourceHandlingOptions().setUrlRestriction(com.aspose.html.saving.UrlRestriction.SameHost);

            // This property is used to setup processing behaviour of any type of resource.
            // ResourceHandling.Save means all resources will be saved to the output folder
            options.getResourceHandlingOptions().setDefault(com.aspose.html.saving.ResourceHandling.Save);

            // This property is used to set up processing behaviour of particular 'application/javascript' mime type.
            // In our case all scripts will be skipped during saving
            options.getResourceHandlingOptions().setJavaScript(com.aspose.html.saving.ResourceHandling.Discard);

            // Save the document
            document.save(dataDir + "SaveUsingHTMLSaveOptions_out.html", options);
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}