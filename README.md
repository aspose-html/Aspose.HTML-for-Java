 [Product Page](https://products.aspose.com/html/java/) | [Docs](https://docs.aspose.com/html/java/) | [Release Notes](https://releases.aspose.com/html/java/release-notes/) | [Download](https://releases.aspose.com/html/java/) | [Demos](https://products.aspose.app/html/applications) | [API Reference](https://reference.aspose.com/html/java/) | [Blog](https://blog.aspose.com/categories/aspose.html-product-family/) | [Free Support](https://forum.aspose.com/c/html/29) | [Temporary License](https://purchase.aspose.com/temporary-license/)

# Aspose.HTML for Java – Examples, Starter Projects, Benchmarks

This repository contains code examples, starter templates, and microbenchmarks demonstrating how to use Aspose.HTML for Java – a powerful library for working with HTML, MHTML, EPUB, Markdown, SVG, and various output formats in Java applications.

[Aspose.HTML for Java](https://products.aspose.com/html/java/) enables developers to load, parse, generate, modify, and convert HTML documents in any Java environment, including desktop, server-side, microservices, and cloud applications.

## Key Features Demonstrated in This Repository

* Create or load HTML documents from multiple sources.
* Fully manipulate the HTML DOM: create, edit, remove, and replace nodes.
* Extract data from HTML, including text and CSS styles for specific elements.
* Navigate documents using Element Traversal, XPath, CSS selectors, and DOM traversal.
* Execute and interact with JavaScript inside HTML documents.
* Configure sandbox settings to control document processing and script behavior.
* Convert HTML, XHTML, SVG, MHTML, Markdown, and EPUB to PDF, XPS, DOCX, and various image formats (PNG, JPEG, BMP, TIFF, GIF).
* Fine-tune conversions with page size, resolution, custom stylesheets, resource handling, and script execution settings.
* Convert between HTML and Markdown for migration or content-editing workflows.
* Control rendering timeouts to optimize performance and resource usage.
* Download website content and process online HTML resources.

Each example in the repository serves as a practical, ready-to-run usage scenario. More information about a wide range of document processing, conversion, and DOM manipulation functionality can be found [here](https://github.com/aspose-html/Aspose.HTML-for-Java/blob/master/docs/supported-features.md).

## Repository Structure

- **Aspose.HTML-for-Java.Start** – Basic startup examples for new users.
- **Aspose.HTML-for-Java.Example** – Full collection of practical examples (HTML conversion, parsing, DOM operations, CSS handling, etc.).
- **Aspose.HTML-for-Java.Microbenchmark** – Performance tests and benchmarks for evaluating Aspose.HTML for Java under different workloads.
- **Aspose.HTML-for-Java.WebService-on-Docker** – A ready-to-use Dockerized web service that exposes Aspose.HTML functionality via REST API.
- **docs** – Documentation files that help developers install, configure, and effectively use Aspose.HTML for Java.

## Requirements

- J2SE 1.6 or above
- Maven or Gradle
- Aspose.HTML for Java (you can download the latest version at: https://releases.aspose.com/html/java/)

## Quick Start with Aspose.HTML for Java

### Install Aspose.HTML for Java

**Gradle.** – Define Aspose.HTML for Java API dependency in your build.gradle script:


```java
compile(group: 'com.aspose', name: 'aspose-html', version: '25.12', classifier: 'jdk16')
```

**Maven:**

```java
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-html</artifactId>
    <version>25.12</version>
    <classifier>jdk17</classifier>
</dependency>
```
### Convert HTML to PDF with one line of Java code

```java
import com.aspose.html.converters.Converter;
import com.aspose.html.saving.PdfSaveOptions;

// Invoke the convertHTML() method to convert the HTML to PDF
Converter.convertHTML("<h1>Convert HTML to PDF!</h1>", ".", new PdfSaveOptions(), "convert-with-single-line.pdf");
```

### Download web page in Java

Extract and save a wab page with default save options in Java

```java
import com.aspose.html.HTMLDocument;

// Initialize an HTML document from a URL
final HTMLDocument document = new HTMLDocument("https://docs.aspose.com/html/net/message-handlers/");
// Prepare a path to save the downloaded file
String savePath = "root/result.html";

// Save the HTML document to the specified file
document.save(savePath);
```

See all examples in [Aspose.HTML-for-Java.Example](https://github.com/aspose-html/Aspose.HTML-for-Java/tree/master/Aspose.HTML-for-Java.Example
)
## Contributing

Contributions are welcome! Feel free to submit PRs with new examples, fixes, or enhancements.

[Product Page](https://products.aspose.com/html/java/) | [Docs](https://docs.aspose.com/html/java/) | [Release Notes](https://releases.aspose.com/html/java/release-notes/) | [Download](https://releases.aspose.com/html/java/) | [Demos](https://products.aspose.app/html/applications) | [API Reference](https://reference.aspose.com/html/java/) | [Blog](https://blog.aspose.com/categories/aspose.html-product-family/) | [Free Support](https://forum.aspose.com/c/html/29) | [Temporary License](https://purchase.aspose.com/temporary-license/)