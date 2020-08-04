---
title: Creating a Document
type: docs
weight: 20
url: /java/creating-a-document/
---

## **HTML Document**
The [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) is a starting point for Aspose.HTML class library. You can load the HTML page into the **Document Object Model (DOM)** by using the [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) class, and then programmatically read, modify, and remove HTML in the document.

{{% alert color="primary" %}} 

The [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) provides an in-memory representation of an **HTML DOM** and entirely based on [W3C DOM](http://www.w3.org/DOM/) and [WHATWG DOM](https://dom.spec.whatwg.org/) specifications that are supported in many modern browsers. If you are familiar with [WHATWG DOM](https://dom.spec.whatwg.org/), [WHATWG HTML](https://html.spec.whatwg.org/multipage/), and [JavaScript](https://www.ecma-international.org/ecma-262/10.0/index.html) standards, you will find it quite comfy to use the Aspose.HTML library. Otherwise, you can visit [www.w3schools.com](https://www.w3schools.com/html/default.asp), where you can find a lot of examples and tutorials how to work with HTML documents.

{{% /alert %}} 

The [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) has several overloaded constructors allowing you to create a blank document or to load it from a file or stream:
### **Create a New HTML Document**
If you want to generate a document programmatically from scratch, please use constructor without parameters as specified in the following code snippet:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromScratch.java" >}}
### **Load from a File**
Following code snippet shows how to load the [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) from an existing file:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromFile.java" >}}
### **Load from a URL**
In the next code snippet you can see how to load a web page into [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument)** 

In case if you pass a wrong URL that can't be reached right at the moment, the library throws the [DOMException](https://apireference.aspose.com/html/java/com.aspose.html.dom/DOMException) with specialized code 'NetworkError' to inform you that the selected resource can not be found.

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromURL.java" >}}
### **Load from HTML Code**
If you prepare an HTML code as an in-memory [Class String](https://cr.openjdk.java.net/~iris/se/15/latestSpec/api/java.base/java/lang/String.html) or [Class InputStream](https://cr.openjdk.java.net/~iris/se/15/latestSpec/api/java.base/java/io/InputStream.html) objects, you don't need to save them to the file, simply pass your HTML code into specialized constructors:

{{% alert color="primary" %}} 

In case your HTML code has the linked resources (styles, scripts, images, etc.), you need to pass a valid baseUrl parameter to the constructor of the document. It will be used to resolve the location of the resource during the document loading.

{{% /alert %}} 

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromString.java" >}}

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentFromMemoryStream.java" >}}
## **SVG Document**
Since [Scalable Vector Graphics (SVG)](https://en.wikipedia.org/wiki/Scalable_Vector_Graphics) is a part of [W3C](https://www.w3.org/) standards and could be embedded into [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument), we implemented [SVGDocument](https://apireference.aspose.com/html/java/com.aspose.html.dom.svg/SVGDocument) and all its functionality. Our implementation is based on official specification [SVG 2 specification](https://www.w3.org/TR/SVG2/), so you can load, read, manipulate SVG documents as it described officially.

Since [SVGDocument](https://apireference.aspose.com/html/java/com.aspose.html.dom.svg/SVGDocument) and [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) are based on the same [WHATWG DOM](https://dom.spec.whatwg.org/) standard, the all operations such as loading, reading, editing, converting and saving are similar for both documents. So, the all examples where you can see manipulation with [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) are applicable for [SVGDocument](https://apireference.aspose.com/html/java/com.aspose.html.dom.svg/SVGDocument) as well.

The example below shows you how to load the SVG Document from the in-memory [Class String](https://cr.openjdk.java.net/~iris/se/15/latestSpec/api/java.base/java/lang/String.html) variable:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_SVGDocumentFromString.java" >}}
## **MHTML Document**
[MHTML](https://en.wikipedia.org/wiki/MHTML) stands for MIME encapsulation of aggregate HTML documents. It is a speficalized format to create web page archives. The Aspose.HTML library supports this format, but with some limitations. We only support the rendering operations from [MHTML](https://en.wikipedia.org/wiki/MHTML) to the supported output formats. For more details, please read [Converting Between Formats](/html/java/converting-between-formats/) article.
## **EPUB Document**
For [EPUB](https://en.wikipedia.org/wiki/EPUB) format, which represents an *electronic publication* format, we have the same limitation as for [MHTML](https://en.wikipedia.org/wiki/MHTML). We only support the rendering operations from [EPUB](https://en.wikipedia.org/wiki/EPUB) to the supported output formats. For more details, please read [Converting Between Formats](/html/java/converting-between-formats/) article.
## **Asynchronous Operations**
We realize that loading a document could be a resource-intensive operation since it’s required loading not only the document itself but all linked resources and processing all scripts. So, in the following code snippets, we show you how to use asynchronous operations and load [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) without blocking the main thread:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnReadyStateChange.java" >}}

*ReadyStateChange* is not the only event that can used to handle an async loading operation, you can also subscribe for *Load* event, as it follows:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_CreatingADocument_HTMLDocumentAsynchronouslyOnLoad.java" >}}

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "HTMLDocumentWaiter.java" >}}

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "SimpleWait.java" >}}
