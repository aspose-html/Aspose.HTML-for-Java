---
title: Editing a Document
type: docs
weight: 30
url: /java/editing-a-document/
---

As we already mentioned [here](/html/java/creating-a-document/) the implementation of [HTMLDocument](https://apireference.aspose.com/html/java/com.aspose.html/HTMLDocument) as well as the whole DOM are based on [WHATWG DOM](https://dom.spec.whatwg.org/) standard. So, it is easy to use Aspose.HTML having a basic knowledge of [HTML](https://en.wikipedia.org/wiki/HTML) and [JavaScript](https://en.wikipedia.org/wiki/JavaScript) languages.
The [DOM package](https://apireference.aspose.com/html/java/com.aspose.html.dom/package-frame) is represented with the following fundamental data types:

|**Data type** |**Description**|
| :- | :- |
|[Document](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document)|The Document represents the entire HTML, XML or SVG document. Conceptually, it is the root of the document tree and provides the primary access to the document's data.|
|[EventTarget](https://apireference.aspose.com/html/java/com.aspose.html.dom/EventTarget)|The *EventTarget* interface is implemented by all Nodes in an implementation that supports the *DOM Event Model*.|
|[Node](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node)|The *Node* is the primary datatype for the entire *Document Object Model*. It represents a single node in the document tree.|
|[Element](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element)|The element type is based on node and represents a base class for *HTML*, *XML* or *SVG DOM.*|
|[Attribute](https://apireference.aspose.com/html/java/com.aspose.html.dom/Attr)|The *Attr* interface represents an attribute in an Element object. Typically the allowable values for the attribute are defined in a schema associated with the document.|
The following is a brief list of useful API methods provides by the core data types:

|**Method** |**Description**|
| :-: | :-: |
|[document.getElementById(elementId)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#getElementById-java.lang.String-) |The method, when invoked, must return the first element whose ID is elementId and null if there is no such element otherwise.|
|[document.getElementsByTagName(name) ](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#getElementsByTagName-java.lang.String-)|The method must return the list of elements with the given name.|
|[document.createElement(tagName)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createElement-java.lang.String-)|The method creates the HTML element specified by tagName, or an [HTMLUnknownElement](https://apireference.aspose.com/html/java/com.aspose.html/HTMLUnknownElement) if tagName isn't recognized.|
|[parentNode.appendChild(node)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#appendChild-com.aspose.dom.Node-)|The method adds a node to the end of the list of children of a specified parent node.|
|[element.setAttribute(name, value)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element#setAttribute-java.lang.String-java.lang.String-)|Sets the value of an attribute on the specified element.|
|[element.getAttribute(name)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element#getAttribute-java.lang.String-)|The method returns the value of a specified attribute on the element.|
|[element.innerHTML](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element#getInnerHTML--) |Returns a fragment of markup contained within the element.|
For a complete list of interfaces and methods represented in the DOM package please visit [API Reference Source](https://apireference.aspose.com/html/java/com.aspose.html.dom/package-frame).
## **Edit HTML**
There are many ways you can edit HTML by using our library. You can modify the document by inserting new nodes, removing, or editing the content of existing nodes. If you need to create a new node, the following methods are ones that need to be invoked:

|**Method** |**Description** |
| :-: | :-: |
|[document.CreateCDATASection(data)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createCDATASection-java.lang.String-) |Creates a CDATASection node whose value is the specified string. |
|[document.CreateComment(data)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createComment-java.lang.String-) |Creates a Comment node given the specified string. |
|[document.CreateDocumentFragment()](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createDocumentFragment--) |Creates an empty DocumentFragment object. |
|[document.CreateElement(localName)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createElement-java.lang.String-) |Creates an element of the type specified. |
|[document.CreateEntityReference(name)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createEntityReference-java.lang.String-) |Creates an EntityReference object. |
|[document.CreateProcessingInstruction(target, data)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createProcessingInstruction-java.lang.String-java.lang.String-) |Creates an ProcessingInstruction with the specified name and data. |
|[document.CreateTextNode(data)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Document#createTextNode-java.lang.String-) |Creates a Text node given the specified string. |


Once you have new nodes are created, there are several methods in DOM that can help you to insert nodes into the tree. The following list describes the most common way of inserting nodes: 

|**Method** |**Description** |
| :-: | :-: |
|[node.InsertBefore(node, child)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#insertBefore-com.aspose.dom.Node-com.aspose.dom.Node-) |Inserts the node before the reference *child* node|
|[node.AppendChild(node)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#appendChild-com.aspose.dom.Node-) |Adds the node to the list of children of the current node |
To remove a node from the HTML DOM tree, please use the [RemoveChild(child)](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#removeChild-com.aspose.dom.Node-) or [Remove()](https://apireference.aspose.com/html/java/com.aspose.html.dom/Node#removeChild-com.aspose.dom.Node-) methods.



The following is a code snippet how to edit HTML document using the mentioned above functional:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_EditingADocument_UsingDOM.java" >}}
## **Using InnerHTML & OuterHTML attributes**
Having DOM objects gives you a powerful tool to manipulate with an HTML Document. However, sometime much better to work just with [Class String](https://cr.openjdk.java.net/~iris/se/15/latestSpec/api/java.base/java/lang/String.html). The following code snippet shows you how to use [InnerHTML](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element#getInnerHTML--) & [OuterHTML](https://apireference.aspose.com/html/java/com.aspose.html.dom/Element#getOuterHTML--) properties to edit HTML.

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_EditingADocument_UsingInnerOuterHTML.java" >}}
## **Edit CSS**
[Cascading Style Sheets (CSS)](https://en.wikipedia.org/wiki/Cascading_Style_Sheets) is a style sheet language used for describing how webpages look in the browser. Aspose.HTML not only support CSS out-of-the-box but also gives you instruments to manipulate with document styles just on the fly before converting the HTML document to the other formats, as it follows:

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_WorkingWithDocuments_EditingADocument_EditCSS.java" >}}
