---
title: Web Scraping
type: docs
weight: 40
url: /java/web-scraping/
---

**Web scraping**, also well known as **web harvesting**, **web data extraction** or **web crawling**, is used for extracting data from websites. A **web scraping software** will help you to automate the process of extracting data based on your requirements. However, configuring **web scraping software** sometimes is a challenging task. Using *Aspose.HTML* class library, you can easily create your own application, since our API provides a powerful toolset to analyze and collect information from HTML documents.
## **HTML navigation**
There are many ways that can be used to make HTML navigation. The following shortlist shows the simplest way to access to all DOM elements:

|**Property**|**Description**|
| :-: | :-: |
|[FirstChild](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#getFirstChild--)|Accessing this attribute of an element must return a reference to the first child node.|
|[LastChild](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#getLastChild--)|Accessing this attribute of an element must return a reference to the last child node|
|[NextSibling](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#getNextSibling--)|Accessing this attribute of an element must return a reference to the sibling node of that element which most immediately follows that element.|
|[PreviousSibling](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#getPreviousSibling--)|Accessing this attribute of an element must return a reference to the sibling node of that element which most immediately precedes that element.|
|[ChildNodes](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#getChildNodes--)|Returns a [list](https://apireference.aspose.com/html/java/com.aspose.html.collections/NodeList) that contains all children of that element.|
Using the mentioned properties, you can navigate through an HTML document as it follows:



{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WebScraping-WebScraping-NavigateThroughHTML.java" >}}

For the more complicated scenarios, when you need to find a node based on a specific pattern (e.g., get the list of headers, links, etc.), you can use a specialized [TreeWalker](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createTreeWalker-com.aspose.dom.Node-long-com.aspose.dom.traversal.INodeFilter-) or [NodeIterator](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createNodeIterator-com.aspose.dom.Node-long-com.aspose.dom.traversal.INodeFilter-) object with a custom [Filter](https://apireference.aspose.com/html/java/com.aspose.html.dom.traversal.filters/NodeFilter) implementation.

The next example shows how to implement your own [NodeFilter](https://apireference.aspose.com/html/java/com.aspose.html.dom.traversal.filters/NodeFilter) to skip all elements except images:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WebScraping-WebScraping-OnlyImageFilter.java" >}}

Once you implement a filter, you can use HTML navigation as it follows:



{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WebScraping-WebScraping-NodeFilterUsageExample.java" >}}
## **XPath**
The alternative to the *HTML Navigation* is [XML Path Language](https://www.w3.org/TR/xpath20/). The syntax of the XPath expressions is quite simple and what is more important, it is easy to read and support.

The following example shows how to use XPath queries within Aspose.HTML API::

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WebScraping-WebScraping-XPathQueryUsageExample.java" >}}
## **CSS Selector**
Along with *HTML Navigation* and *XPath* you can use [CSS Selector API](http://www.w3.org/TR/selectors-4/) that is also supported by our library. This API is designed to create a search pattern to match elements in a document tree based on [CSS Selectors](https://www.w3.org/TR/selectors-3/#selectors) syntax.

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WebScraping-WebScraping-CSSSelectorUsageExample.java" >}}
