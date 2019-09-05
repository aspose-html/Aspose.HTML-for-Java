package com.aspose.html.examples.java.conversion;

import com.aspose.html.HTMLDocument;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;
import com.aspose.html.saving.HTMLSaveFormat;
import com.aspose.html.saving.MarkdownFeatures;
import com.aspose.html.saving.MarkdownSaveOptions;


public class HTMLtoMarkdown
{
    public static void run()
    {
        // ExStart:HTMLtoMarkdown
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();

        HTMLDocument document = new HTMLDocument(StringExtensions.concat("<p>my first paragraph</p>",
                                               "<p>my second paragraph</p>"), dataDir);
        try
        {
            document.save(StringExtensions.concat(dataDir,  "Markdown.md"), HTMLSaveFormat.Markdown);
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:HTMLtoMarkdown          
    }
    public static void markdownOptions()
    {

        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();
        // ExStart:MarkdownOptions
        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", dataDir);
        try
        {
            // Save to markdown by using default for the GIT formatting model
            document.save(StringExtensions.concat(dataDir,  "Markdown.md"), MarkdownSaveOptions.getGit());
        }
        finally { if (document != null) document.dispose(); }
        // ExEnd:MarkdownOptions          
    }
    public static void defineMarkdownRules()
    {
        // The path to the documents directory.
        String dataDir = RunExamples.getDataDir_Data();
        // ExStart:DefineRules
        HTMLDocument document = new HTMLDocument("<p>my first paragraph</p>", dataDir);
        try
        {
            // Create MarkdownSaveOptions object
            MarkdownSaveOptions options = new MarkdownSaveOptions();

            // Set the rules: only <a>, <img> and <p> elements will be converted to markdown.
            options.setFeatures(MarkdownFeatures.Link | MarkdownFeatures.Image | MarkdownFeatures.AutomaticParagraph);
            document.save(StringExtensions.concat(dataDir,  "Markdown.md"), options);
            // ExEnd:DefineRules
        }
        finally { if (document != null) document.dispose(); }
    }
}
