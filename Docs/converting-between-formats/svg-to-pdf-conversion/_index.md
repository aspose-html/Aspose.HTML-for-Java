---
title: SVG to PDF Conversion
type: docs
weight: 70
url: /java/svg-to-pdf-conversion/
---

In this article, you will find information about how to convert an [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics) to [PDF](https://en.wikipedia.org/wiki/PDF) and how to use [PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptions) and [MemoryStreamProvider](https://apireference.aspose.com/html/java/com.aspose.html/package-frame) parameters.

{{% alert color="primary" %}} 

<https://products.aspose.app/html/conversion/svg-to-pdf>

{{% /alert %}} 

The static methods of the [Converter](https://apireference.aspose.com/java/html/aspose.html.converters/converter) class are primarily used as the easiest way to convert an [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics) code into various formats. You can convert [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics) to [PDF](https://en.wikipedia.org/wiki/PDF) in your Java application literally with a single line of code!

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_WithASingleLine.java" >}}

The next example explains how to convert SVG to PDF by line by line:

1. Load the SVG file using [SVGDocument](https://apireference.aspose.com/html/java/com.aspose.html.dom.svg/SVGDocument) class.
1. Create an instance of [PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptions).
1. Use the [Converter.ConvertSVG](https://apireference.aspose.com/java/html/aspose.html.converters.converter/convertsvg/methods/37) method of [Converter](https://apireference.aspose.com/java/html/aspose.html.converters/converter) class to save SVG as a PDF file. You need to pass the [SVGDocument](https://apireference.aspose.com/html/java/com.aspose.html.dom.svg/SVGDocument), [PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptionsQ), and output file path to the [Converter.ConvertSVG](https://apireference.aspose.com/java/html/aspose.html.converters.converter/convertsvg/methods/37) method to convert [SVG](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics) to [PDF](https://en.wikipedia.org/wiki/PDF).

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_ConvertSVGDocumentToPDF.java" >}}
## **Save Options**
[PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptions) allows you to customize the rendering process. You can specify the [page size](https://apireference.aspose.com/html/java/com.aspose.html.rendering/RenderingOptions#getPageSetup--), [margins](https://apireference.aspose.com/html/java/com.aspose.html.drawing/Page#getMargin--), [file permissions](https://apireference.aspose.com/java/html/aspose.html.rendering.pdf.encryption/pdfencryptioninfo), [CSS media-type](https://apireference.aspose.com/html/java/com.aspose.html.rendering/MediaType), etc. The following example shows how to use [PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptions) *and* create a PDF file with custom page-size and background color:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_ConvertingBetweenFormats_ConvertSVGToPDF_SpecifyPdfSaveOptions.java" >}}

Please note that you cannot set values against the **Application** and **Producer** fields, because Aspose Ltd. and Aspose.HTML for Java x.x.x will be displayed against these fields.

To learn more about [PdfSaveOptions](https://apireference.aspose.com/java/html/aspose.html.saving/pdfsaveoptions) please read [Fine-Tuning Converters](/html/java/fine-tuning-converters/) article.
## **Output Stream Providers**
If it is required to save files in the remote storage (e.g., cloud, database, etc.) you can implement [MemoryStreamProvider](https://apireference.aspose.com/html/java/com.aspose.html/package-frame) interface to have manual control over the file creating process. This interface designed as a callback object to create a stream at the beginning of the document/page (depending on the output format) and release the early created stream after rendering document/page.

{{% alert color="primary" %}} 

Aspose.HTML for Java provides various types of output formats for rendering operations. Some of these formats produce a single output file (for instance PDF, XPS), others create multiple files (Image formats JPG, PNG, etc.).

{{% /alert %}} 

The example below shows how to implement and use the your own *MemoryStreamProvider* in the application:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "MemoryStreamProvider.java" >}}

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_ConvertingBetweenFormats_ConvertSVGToXPS_SpecifyCustomStreamProvider.java" >}}



