# Basic Usage of Aspose.HTML for Java

This guide provides practical examples of using **Aspose.HTML for Java** for common tasks like converting HTML to PDF, rendering images, manipulating DOM, and working with MHTML or EPUB files.

## Convert HTML to PDF

Quickly convert HTML, XHTML, or MHTML files to PDF with a single line of code.

```java
import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.PdfSaveOptions;
import com.aspose.html.converters.Converter;

    HTMLDocument document = new HTMLDocument("document.html");
    PDFSaveOptions options = new PdfSaveOptions();
    Converter.convertHTML(document, options, "output.pdf");
```

## Convert HTML to Image

Render HTML pages as images in PNG, JPEG, BMP, GIF or TIFF formats.

```java
import com.aspose.html.HTMLDocument;
import com.aspose.html.saving.ImageSaveOptions;
import com.aspose.html.saving.SaveFormat;
import com.aspose.html.converters.Converter;

    HTMLDocument document = new HTMLDocument("document.html");
    ImageSaveOptions options = new ImageSaveOptions(SaveFormat.Jpeg);
    Converter.convertHTML(document, options, "output.jpg");
```

## Create an HTML document

```java
import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Text;

    HTMLDocument document = new HTMLDocument();
    Text text = document.createTextNode("Hello, World!");
    document.getBody().appendChild(text);
    document.save($o("create-new-document.html"));
```

## Navigate the HTML DOM

```java
import com.aspose.html.HTMLDocument;
import com.aspose.html.dom.Element;

    String html_code = "<span>Hello,</span> <span>World!</span>";
    HTMLDocument document = new HTMLDocument(html_code, ".");
    Element element = document.getBody().getFirstElementChild();
    System.out.println(element.getTextContent());
    // @output: Hello,

    element = element.getNextElementSibling();
    System.out.println(element.getTextContent());
    // @output: World!
```

## Load and Convert MHTML to PDF

```java
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

    java.io.FileInputStream fileInputStream = new java.io.FileInputStream($i("sample.mht"));
    PdfSaveOptions options = new PdfSaveOptions();
    Converter.convertMHTML(fileInputStream, options, $o("sample-output.pdf"));
```

For complete examples, visit the `Aspose.HTML-for-Java.Example` module in this repository.

## Notes

- You can combine conversion and DOM manipulation in a single workflow.
- All examples can be adapted for SVG, EPUB, Markdown rendering & conversion, or custom save options.
- Refer to the [official Aspose.HTML documentation](https://docs.aspose.com/html/java/) for advanced settings, page layouts, and rendering configuration.
