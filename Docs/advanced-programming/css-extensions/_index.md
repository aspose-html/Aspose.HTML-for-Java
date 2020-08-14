---
title: CSS Extensions
type: docs
weight: 50
url: /java/css-extensions/
---

Historically, browser vendors use the prefixes for nonstandard CSS features. Following the list of the major browsers prefixes:

- **-webkit-** (Chrome, Safari, newer versions of Opera, almost all iOS browsers (including Firefox for iOS); basically, any WebKit based browser)
- **-moz-** (Firefox)
- **-o-** (Old, pre-WebKit, versions of Opera)
- **-ms-** (Internet Explorer and Microsoft Edge)

The prefix that is used by Aspose.HTML library looks like **-aspose-** and gives you some experimental features. Following is a list of CSS functions that can be enabled by using **-aspose-** prefix:

|**Name**|**Description**|
| :-: | :-: |
|currentPageNumber |This function returns the number of the current rendering page.|
|totalPagesNumber |This function returns the number of the total pages in the document.|
The next code snippet demonstrates how to use CSS extensions to create custom marks on document margins: 

{{< gist "aspose-com-gists" "b2199f957c72708d4d2b0de93bca3098" "Examples_Java_AdvancedUsage_CSSExtensions_AddTitleAndPageNumber.java" >}}
