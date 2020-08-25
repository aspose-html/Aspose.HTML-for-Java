package com.aspose.html.examples;

public class Examples_Java_WebScraping_WebScraping_NavigateThroughHTML {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Prepare an HTML code
        var html_code = "<span>Hello</span> <span>World!</span>";

        // Initialize a document from the prepared code
        var document = new com.aspose.html.HTMLDocument(html_code, ".");
        try {
            // Get the reference to the first child (first SPAN) of the BODY
            var element = document.getBody().getFirstElementChild();
            System.out.println(element.getTextContent()); // output: Hello

            // Get the reference to the second SPAN element
            element = element.getNextElementSibling();
            System.out.println(element.getTextContent()); // output: World!
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}