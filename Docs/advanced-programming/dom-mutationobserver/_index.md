---
title: DOM MutationObserver
type: docs
weight: 30
url: /java/dom-mutationobserver/
---

A document observation mechanism is represented with [MutationObserver](https://apireference.aspose.com/html/java/com.aspose.html.dom.mutations/MutationObserver), that is easy to configure, and it is used to register listeners that can be notified of any changes in the document tree. The following example demonstrates the implementation of [MutationObserver](https://apireference.aspose.com/html/java/com.aspose.html.dom.mutations/MutationObserver) and how to use it to observe adding new nodes to the document.

{{% alert color="primary" %}} 

If you are observing a node for changes, your callback will not be fired until the DOM has completely finished changing. This behavior was designed to replace DOM Mutation Events and reduce the killing performance issue in the previous specification.

{{% /alert %}} 

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_AdvancedUsage_DOMMutationObserver_ObserveHowNodesAreAdded.java" >}}
