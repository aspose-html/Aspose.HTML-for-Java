package com.aspose.html.examples.Converting_Between_Formats.MD_Converter.ConvertMarkdownToHTML;

import com.aspose.html.HTMLDocument;
import com.aspose.html.converters.Converter;
import com.aspose.html.rendering.image.ImageFormat;
import com.aspose.html.saving.ImageSaveOptions;

import static com.aspose.html.examples.utils.Resources.$o;

public class ConvertMarkdownToPNG {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // @START_SNIPPET Example_ConvertMarkdownToPng.java
        // Convert Markdown to PNG using Java
        // Learn more: https://docs.aspose.com/html/java/convert-markdown-to-image/

        // Prepare a simple Markdown example
        String code = "### Hello, World\n\n" +
                "[visit applications](https://products.aspose.app/html/family)";

        // Create a Markdown file
        try (java.io.FileWriter fileWriter = new java.io.FileWriter($o("document.md"))) {
            fileWriter.write(code);
        }

        // Convert Markdown to HTML document
        HTMLDocument document = Converter.convertMarkdown($o("document.md"));

        // Convert HTML document to PNG image file format
        Converter.convertHTML(document, new ImageSaveOptions(ImageFormat.Png), $o("output_md.png"));
        // @END_SNIPPET
    }
}