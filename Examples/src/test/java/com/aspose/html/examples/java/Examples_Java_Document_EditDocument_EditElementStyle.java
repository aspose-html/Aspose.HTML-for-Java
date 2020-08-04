package com.aspose.html.examples.java;

public class Examples_Java_Document_EditDocument_EditElementStyle {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var document = new com.aspose.html.HTMLDocument("<style>p { color: red; }</style><p>my first paragraph</p>", "about:blank");
        try {
            // Get the element to inspect
            var element = document.getElementsByTagName("p").get_Item(0);

            // Get the CSS view object
            var view = (com.aspose.html.dom.css.IViewCSS) document.getContext().getWindow();

            // Get the computed style of the element
            var declaration = view.getComputedStyle(element);

            // Get "color" property value
            System.out.println(declaration.getPropertyCSSValue("color")); // rgb(255, 0, 0)
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}