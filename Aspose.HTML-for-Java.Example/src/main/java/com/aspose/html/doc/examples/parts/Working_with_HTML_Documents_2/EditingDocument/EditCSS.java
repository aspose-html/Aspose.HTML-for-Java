package com.aspose.html.doc.examples.parts.Working_with_HTML_Documents_2.EditingDocument;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLElement;
import com.aspose.html.dom.css.ICSSStyleDeclaration;
import com.aspose.html.dom.css.IViewCSS;
import com.aspose.html.rendering.pdf.PdfDevice;

import static com.aspose.html.doc.examples.utils.Resources.$o;

public class EditCSS {

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    public void execute() throws Exception {
        // Create an instance of HTML Document with specified content
        String content = "<style>p { color: red; }</style><p>Hello, World!</p>";
        HTMLDocument document = new HTMLDocument(content, ".");

        // Find a paragraph element to inspect the styles
        HTMLElement paragraph = (HTMLElement) document.getElementsByTagName("p").get_Item(0);

        // Get the reference to the IViewCSS interface
        IViewCSS view = (IViewCSS) document.getContext().getWindow();

        // Get the calculated style value for the paragraph node
        ICSSStyleDeclaration declaration = view.getComputedStyle(paragraph);

        // Read the "color" property value out of the style declaration object
        System.out.println(declaration.getPropertyCSSValue("color"));

        // Set the green color to the paragraph
        paragraph.getStyle().setProperty("color", "navy");

        // Create the instance of the PDF output device and render the document into this device
        PdfDevice device = new PdfDevice($o("output.pdf"));

        document.renderTo(device);
    }
}
