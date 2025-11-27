package com.aspose.html.examples.Data_Extraction;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.utils.Assert;
import com.aspose.html.examples.utils.FileHelper;
import com.aspose.html.saving.HTMLSaveOptions;
import com.aspose.html.saving.ResourceHandling;
import com.aspose.html.saving.UrlRestriction;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.examples.utils.Resources.$o;

@Disabled
public class DownloadWebsite {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Save Webpage With Defalt Save Options")
    @Disabled
    @org.junit.jupiter.api.Tag("remote")
    public final void SaveWebpageDefaultSaveOptionsTest() {
        // @START_SNIPPET Example_SaveWebpageWithDefaultSaveOptions.java
        // Extract and save a wab page with default save options in Java
        // Learn more: https://docs.aspose.com/html/java/website-to-html/

        // Initialize an HTML document from a URL
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");
        // Prepare a path to save the downloaded file
        String savePath = $o("root/result.html");

        // Save the HTML document to the specified file
        document.save(savePath);
        // @END_SNIPPET SaveWebpageWithDefaultSaveOptions
        Assert.True(FileHelper.exists(savePath));
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Download Website")
    @org.junit.jupiter.api.Tag("remote")
    public final void DownloadWebsiteTest() {
        // @START_SNIPPET Example_SaveWebsiteWithHTMLSaveOptions.java
        // Download website using HTMLSaveOptions in Java
        // Learn more: https://docs.aspose.com/html/java/website-to-html/

        // Initialize an HTML document from a URL
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");

        // Create an HTMLSaveOptions object and set the JavaScript property
        HTMLSaveOptions options = new HTMLSaveOptions();
        options.getResourceHandlingOptions().setJavaScript(ResourceHandling.Embed);

        // Prepare a path to save the downloaded file
        String savePath = $o("rootAndEmbedJs/result.html");

        // Save the HTML document to the specified file
        document.save(savePath, options);
        // @END_SNIPPET SaveWebsiteWithHTMLSaveOptions
        Assert.True(FileHelper.exists(savePath));
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Download Website Using MaxHandlingDepth")
    @Disabled
    @org.junit.jupiter.api.Tag("remote")
    public final void DownloadSiteUsingMaxHandlingDepthTest() {
        // @START_SNIPPET Example_SaveWebsiteUsingMaxHandlingDepth.java
        // Save a website with limited resource depth using Java
        // Learn more: https://docs.aspose.com/html/java/website-to-html/

        // Load an HTML document from a URL
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");

        // Create an HTMLSaveOptions object and set the MaxHandlingDepth property
        HTMLSaveOptions options = new HTMLSaveOptions();
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);

        // Prepare a path for downloaded file saving
        String savePath = $o("rootAndAdjacent/result.html");

        // Save the HTML document to the specified file
        document.save(savePath, options);
        // @END_SNIPPET SaveWebsiteUsingMaxHandlingDepth
        Assert.True(FileHelper.exists(savePath));
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Download Website Using PageUrlRestriction")
    @Disabled
    @org.junit.jupiter.api.Tag("remote")
    public final void SaveWebsiteUsingPageUrlRestrictionTest() {
        // @START_SNIPPET Example_SaveWebsiteUsingPageUrlRestriction.java
        // Save a website with restricted resource URLs using Java
        // Learn more: https://docs.aspose.com/html/java/website-to-html/

        // Initialize an HTML document from a URL
        final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");

        // Create an HTMLSaveOptions object and set MaxHandlingDepth and PageUrlRestriction properties
        HTMLSaveOptions options = new HTMLSaveOptions();
        options.getResourceHandlingOptions().setMaxHandlingDepth(1);
        options.getResourceHandlingOptions().setPageUrlRestriction(UrlRestriction.SameHost);

        // Prepare a path to save the downloaded file
        String savePath = $o("rootAndManyAdjacent/result.html");

        // Save the HTML document to the specified file
        document.save(savePath, options);
        // @END_SNIPPET SaveWebsiteUsingPageUrlRestriction
        Assert.True(FileHelper.exists(savePath));
    }
}

