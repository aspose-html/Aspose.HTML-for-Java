package com.aspose.html.examples;

public class Examples_Java_Conversion_MarkdownToHTML_1 {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Convert markdown to HTML
        com.aspose.html.converters.Converter.convertMarkdown(
                Resources.input("input.md"),
                Resources.output("Markdown-to-HTML.out.html")
        );
    }
}
