# HTML File Manipulation Java API

The [Java HTML API](https://products.aspose.com/html/java) assists developers to write, read, modify, navigate and convert (X)HTML documents from within Java applications.

Aspose.HTML for Java API works as a headless browser that allows you to [create or open existing HTML documents](https://docs.aspose.com/html/java/loading-an-existing-html-document/) from various sources in order to perform manipulation operations such as remove and replace HTML nodes, save HTML documents, extract CSS from HTML, configure a document sandbox and more. You may navigate HTML documents by using various methods, such as, element traversal, document traversal, XPath queries, and CSS selector queries as well as manipulate HTML DOM via JavaScript, convert HTML file to images or fixed layout formats, and convert XHTML and EPUB files to other file formats.

The classes and properties of Aspose.HTML for Java API have similar names as that of W3C HTML specification.

Directory | Description
--------- | -----------
[Examples](https://github.com/aspose-html/Aspose.HTML-for-Java/tree/master/Examples) | A collection of Java examples that help you learn the product features.

<p align="center">

  <a title="Download complete Aspose.HTML for Java source code" href="https://github.com/aspose-html/Aspose.HTML-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

## HTML Processing API Features

### General Features

- Written completely in Java and works with JRE.
- Supports both the `32-bit` & `64-bit` OS support.
- Create or open an existing HTML document from different sources.
- Ability to manipulate (create, edit, remove, replace) HTML nodes via API.
- Extract CSS styles for specific HTML node.
- Configure a document sandbox that affects the processing of HTML documents.
- Supports navigation through HTML document in various ways (Element Traversal, Document Traversal, XPath queries, CSS Selector queries).
- Manipulate HTML DOM via JavaScript.
- Convert web documents to various supported file formats.

### Text Related Features

- Extract text from pages.
- Search text from pages.
- Add text in HTML file.

### Document Related Features

- Create, edit, remove and replace HTML nodes
- Extracting CSS styles for particular HTML node
- Convert HTML documents into various supported image formats: JPEG, PNG, BMP, TIFF
- Convert HTML documents to PDF format
- Convert HTML documents to XPS format.

## Read & Write Web Formats

**Web:** HTML, XHTML^, MHTML^^\
**Other:** SVG*, MD**

- ^Save option is only available when the input file is `XHTML`.
- ^^Save option is only available when saving `MHTML` document.
- *Save option is only available when the input file is `SVG`.
- **Save option is only available when saving `HTML` document.

## Save HTML As

**Fixed Layout:** PDF, XPS\
**Images:** TIFF, JPEG, PNG, BMP

## Read Formats

EPUB

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 8.0 (1.8)` or above

## Get Started with Aspose.HTML for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-html). You can easily use Aspose.HTML for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.HTML for Java from Aspose Repository](https://docs.aspose.com/html/java/installation/) documentation page.

## Load HTML File from a remote URL / Server using Java

```java
// For complete examples and data files, please go to https://github.com/aspose-html/Aspose.Html-for-Java
// The path to the documents directory.
String dataDir = Utils.getDataDir();
// This simple test shows how to load document from remote server
com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument(new com.aspose.html.Url(dataDir + "input.html"));
// Read children nodes and get length information
if (document.getBody().getChildNodes().getLength() == 0)
    System.out.println("No ChildNodes found...");
// Print Document URI to console. As per information above, it has to be https://www.w3.org/TR/html5/
System.out.println("Print Document URI = " + document.getDocumentURI());
// Print domain name for remote HTML
System.out.println("Domain Name = " + document.getDomain());
```

[Home](https://www.aspose.com/) | [Product Page](https://products.aspose.com/html/java) | [Docs](https://docs.aspose.com/html/java/) | [Demos](https://products.aspose.app/html/family) | [API Reference](https://apireference.aspose.com/java/html) | [Examples](https://github.com/aspose-html/Aspose.Html-for-Java) | [Blog](https://blog.aspose.com/category/html/) | [Free Support](https://forum.aspose.com/c/html) | [Temporary License](https://purchase.aspose.com/temporary-license)
