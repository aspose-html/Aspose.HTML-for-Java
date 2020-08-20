package com.aspose.html.examples.java;

public class Examples_Java_WebScraping_WebScraping_CSSSelectorUsageExample {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        // Prepare an HTML code
        var code = """
                < div class='happy' >
                        <div >
                            <span > Hello </span >
                        </div >
                    </div >
                    <p class='happy' >
                        <span > World ! </span >
                    </p >
                """;

        // Initialize a document based on the prepared code
        var document = new com.aspose.html.HTMLDocument(code, ".");
        try {
            // Here we create a CSS Selector that extract all elements whose 'class' attribute equals to 'happy' and their child SPAN elements
            var elements = document.querySelectorAll(".happy span");

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