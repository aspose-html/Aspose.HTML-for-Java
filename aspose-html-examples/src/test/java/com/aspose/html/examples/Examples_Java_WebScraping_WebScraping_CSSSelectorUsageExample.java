package com.aspose.html.examples;

public class Examples_Java_WebScraping_WebScraping_CSSSelectorUsageExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // Prepare an HTML code
        String code = "< div class='happy' >\n" +
                      "        <div >\n" +
                      "            <span > Hello </span >\n" +
                      "        </div >\n" +
                      "    </div >\n" +
                      "    <p class='happy' >\n" +
                      "        <span > World ! </span >\n" +
                      "    </p >\n";

        // Initialize a document based on the prepared code
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Here we create a CSS Selector that extract all elements whose 'class' attribute equals to 'happy' and their child SPAN elements
            com.aspose.html.collections.NodeList elements = document.querySelectorAll(".happy span");

            // Iterate over the resulted list of elements
            elements.forEach(element -> {
                System.out.println(((com.aspose.html.HTMLElement) element).getInnerHTML());
                // output: Hello
                // output: World!
            });
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}