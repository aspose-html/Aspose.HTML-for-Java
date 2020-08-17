---
title: Output Streams
type: docs
weight: 20
url: /java/-output-streams/
---

In conversion operations, we normally save the rendering result to the file. However, for some cases, you may need to store the result in the memory or send it to the remote storage. You can easily do this by implementing the specialized [MemoryStreamProvider](https://apireference.aspose.com/html/java/com.aspose.html/package-frame) interface and use it as an input parameter to the converter. This interface represents a callback that uses when a new output stream is required.

{{% alert color="primary" %}} 

Note: It may be invoked a few times when the multiple output streams are required. The scenario when this case is possible is rendering HTML to the set of image files.

{{% /alert %}} 

The code below is an example of the application that uses [MemoryStreamProvider](https://apireference.aspose.com/html/java/com.aspose.html/package-frame) to store the rendering result in memory and flush it to the file later.

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "MemoryStreamProvider.java" >}}

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_AdvancedUsage_OutputStreams_StreamProviderUsageExample.java" >}}
