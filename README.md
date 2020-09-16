# HTML File Manipulation Java API

The [Java HTML API](https://products.aspose.com/html/java) assists developers to write, read, modify, navigate and convert (X)HTML documents from within Java applications.

Aspose.HTML for Java API works as a headless browser that allows you to [create or open existing HTML documents](https://docs.aspose.com/html/java/loading-an-existing-html-document/) from various sources in order to perform manipulation operations such as remove and replace HTML nodes, save HTML documents, extract CSS from HTML, configure a document sandbox and more. You may navigate HTML documents by using various methods, such as, element traversal, document traversal, XPath queries, and CSS selector queries as well as manipulate HTML DOM via JavaScript, convert HTML file to images or fixed layout formats, and convert XHTML and EPUB files to other file formats.

<p align="center">

  <a title="Download complete Aspose.HTML for Java source code" href="https://github.com/aspose-html/Aspose.HTML-for-Java/archive/master.zip">
	<img src="https://raw.github.com/AsposeExamples/java-examples-dashboard/master/images/downloadZip-Button-Large.png" />
  </a>
</p>

# HTML Processing Features

- Written completely in Java and works with JRE.
- Supports both the `32-bit` & `64-bit` OS support.
- Create or open an existing HTML document from different sources.
- Ability to manipulate (create, edit, remove, replace) HTML nodes via API.
- Extract CSS styles for specific HTML node.
- Configure a document sandbox that affects the processing of HTML documents.
- Supports navigation through HTML document in various ways (Element Traversal, Document Traversal, XPath queries, CSS Selector queries).
- Manipulate HTML DOM via JavaScript.
- Convert web documents to various supported file formats.
- Extract text from pages.
- Search text from pages.
- Add text in HTML file.
- Create, edit, remove and replace HTML nodes
- Extracting CSS styles for particular HTML node
- Convert HTML documents into various supported image formats: JPEG, PNG, BMP, TIFF
- Convert HTML documents to PDF format
- Convert HTML documents to XPS format.

## Read & Write Web Formats

**Web:** HTML, XHTML^, MHTML^^\
**Other:** SVG*, MD**

## Save HTML As

**Fixed Layout:** PDF, XPS\
**Images:** TIFF, JPEG, PNG, BMP

## Read Formats

**Images:** EPUB

## Supported Environments

- **Microsoft Windows:** Windows Desktop & Server (x86, x64)
- **macOS:** Mac OS X
- **Linux:** Ubuntu, OpenSUSE, CentOS, and others
- **Java Versions:** `J2SE 6.0 (1.6)`,`J2SE 7.0 (1.7)`,`J2SE 8.0 (1.8)` 

## Get Started with Aspose.HTML for Java

Aspose hosts all Java APIs at the [Aspose Repository](https://repository.aspose.com/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-html). You can easily use Aspose.HTML for Java API directly in your Maven projects with simple configurations. For the detailed instructions please visit [Installing Aspose.HTML for Java from Aspose Repository](https://docs.aspose.com/html/java/installation/) documentation page.

## Load HTML from a Remote Location

```java
HTMLDocument document = HTMLDocument(new Url("template.html"));
// read children nodes and get length information
if (document.getBody().getChildNodes().getLength() == 0)
    System.out.println("No ChildNodes found...");
// print Document URI to console. As per information above, it has to be https://www.w3.org/TR/html5/
System.out.println("Print Document URI = " + document.getDocumentURI());
// print domain name for remote HTML
System.out.println("Domain Name = " + document.getDomain());
```

## How to use the Examples?

Clone or Download the ZIP and extract the contents to your local hard drive. This project uses Maven/Gradle build system and can be opened in any modern IDE like IntelliJ IDEA, Eclipse or NetBeans. For more details, visit our [Documentation website](https://docs.aspose.com/display/htmljava/How+to+Run+the+Examples).

## Step one

For maven
```
mvn compile test
```
For gradle
```
gradle build
```


## Execute all tests
Maven
```
mvn -Dtest="com.aspose.html.examples.**" test
```

Gradle
```
./gradlew test --tests "com.aspose.html.examples.*"
```

## Execute single test
Maven
```
mvn -Dtest=Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded test
```
Gradle
```
./gradlew test --tests "com.aspose.html.examples.Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded" 
```
## Execute asynchronously test in Thread
Maven
```
mvn org.codehaus.mojo:exec-maven-plugin:3.0.0:java -Dexec.mainClass="com.aspose.html.examples.SimpleWait" -Dexec.classpathScope="test" -Dexec.cleanupDaemonThreads=false
```
Gradle
```
./gradlew SimpleWait
```

[Home](https://www.aspose.com/) 
| [Product Page](https://products.aspose.com/html/java) 
| [Docs](https://docs.aspose.com/html/java/) 
| [Demos](https://products.aspose.app/html/family) 
| [API Reference](https://apireference.aspose.com/html/java) 
| [Blog](https://blog.aspose.com/category/html/) 
| [Free Support](https://forum.aspose.com/c/html) 
| [Temporary License](https://purchase.aspose.com/temporary-license)
