package com.aspose.html.examples;

public class Examples_Java_Document_EditDocument_EditElementStyleUsingAttribute {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {

        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument("<style>p { color: red; }</style><p>my first paragraph</p>", "about:blank");
        try {
            // Get the element to edit
            com.aspose.html.HTMLElement element = (com.aspose.html.HTMLElement) document.getElementsByTagName("p").get_Item(0);

            // Get the CSS view object
            com.aspose.html.dom.css.IViewCSS view = (com.aspose.html.dom.css.IViewCSS) document.getContext().getWindow();

            // Get the computed style of the element
            com.aspose.html.dom.css.ICSSStyleDeclaration declaration = view.getComputedStyle(element);

            // Set green color
            element.getStyle().setProperty("Color", "green");

            // Get "color" property value
            System.out.println(declaration.getPropertyCSSValue("color")); // rgb(0, 128, 0)
        } finally {
            if (document != null) {
                document.dispose();
            }
        }
    }
}
