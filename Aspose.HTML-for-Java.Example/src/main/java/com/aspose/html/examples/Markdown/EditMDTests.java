package com.aspose.html.examples.Markdown;

import com.aspose.html.Configuration;
import com.aspose.html.toolkit.markdown.syntax.*;
import com.aspose.html.toolkit.markdown.syntax.parser.MarkdownParser;
import com.aspose.html.toolkit.markdown.syntax.text.SourceText;
import org.junit.jupiter.api.DisplayName;

import static com.aspose.html.examples.utils.Resources.$i;
import static com.aspose.html.examples.utils.Resources.$o;

public class EditMDTests {
    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Headers into Markdown")
    public final void addHeadersTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create headings of the required level
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();
        AtxHeadingSyntaxNode heading1 = mdf.atxHeading("Heading 1 level  text", 1);
        AtxHeadingSyntaxNode heading2 = mdf.atxHeading("Heading 2 level text", 2);
        AtxHeadingSyntaxNode heading3 = mdf.atxHeading("Heading 3 level text", 3);
        AtxHeadingSyntaxNode heading4 = mdf.atxHeading("Heading 4 level text", 4);
        AtxHeadingSyntaxNode heading5 = mdf.atxHeading("Heading 5 level text", 5);
        AtxHeadingSyntaxNode heading6 = mdf.atxHeading("Heading 6 level text", 6);

        // Create and add newLineTrivia element for an empty line after headings
        WhitespaceSyntaxNode newLineTrivia = mdf.newLineTrivia();
        heading1.getTrailingTrivia().addItem(newLineTrivia);
        heading2.getTrailingTrivia().addItem(newLineTrivia);
        heading3.getTrailingTrivia().addItem(newLineTrivia);
        heading4.getTrailingTrivia().addItem(newLineTrivia);
        heading5.getTrailingTrivia().addItem(newLineTrivia);
        heading6.getTrailingTrivia().addItem(newLineTrivia);

        // Add the  headers to the Markdown syntax tree
        md.appendChild(heading1);
        md.appendChild(heading2);
        md.appendChild(heading3);
        md.appendChild(heading4);
        md.appendChild(heading5);
        md.appendChild(heading6);

        // Prepare a path for MD file saving
        String savePath = $o("output-headers.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Header into Markdown")
    public final void addHeaderTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create headings of the required level
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();
        AtxHeadingSyntaxNode heading1 = mdf.atxHeading("Heading 1 level  text", 1);
        AtxHeadingSyntaxNode heading2 = mdf.atxHeading("Heading 2 level text", 2);
        AtxHeadingSyntaxNode heading3 = mdf.atxHeading("Heading 3 level text", 3);
        AtxHeadingSyntaxNode heading4 = mdf.atxHeading("Heading 4 level text", 4);
        AtxHeadingSyntaxNode heading5 = mdf.atxHeading("Heading 5 level text", 5);
        AtxHeadingSyntaxNode heading6 = mdf.atxHeading("Heading 6 level text", 6);

        // Add the  headers to the Markdown syntax tree
        md.appendChild(heading1);

        // Добавим после нее пробел через специальную ноду WhiteSpace:
        md.appendChild(mdf.whitespace());
        md.appendChild(mdf.emptyLine());

        md.appendChild(heading2);
        md.appendChild(mdf.whitespace());
        md.appendChild(heading3);
        md.appendChild(mdf.whitespace());
        md.appendChild(heading4);
        md.appendChild(mdf.whitespace());
        md.appendChild(heading5);
        md.appendChild(mdf.whitespace());
        md.appendChild(heading6);

        // Prepare a path for MD file saving
        String savePath = $o("output-headers.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Paragraph into Markdown")
    public final void addParagraphTest() {
        // Specify the path to the source MD file
        String input = $i("document.md");

        // Create a MarkdownParser object
        MarkdownParser parser = new MarkdownParser();

        // Parse the MD document and get a syntax tree
        MarkdownSyntaxTree syntaxTree = parser.parseFile(input);

        // Use the SyntaxFactory property to get the factory for creating the Markdown syntax tree
        MarkdownSyntaxFactory syntaxFactory = syntaxTree.getSyntaxFactory();

        // Create an empty paragraph
        ParagraphSyntaxNode paragraphSyntaxNode = syntaxFactory.paragraph();

        // Create and add newLineTrivia element for an empty line after paragraph
        WhitespaceSyntaxNode newLineTrivia = syntaxFactory.newLineTrivia();
        paragraphSyntaxNode.getTrailingTrivia().addItem(newLineTrivia);

        TextSyntaxNode textSyntaxNode = syntaxFactory.text("New paragraph text.");

        // Add texts to the paragraph
        paragraphSyntaxNode.appendChild(textSyntaxNode);

        syntaxTree.insertBefore(paragraphSyntaxNode, syntaxTree.getFirstChild());

        // Prepare a path for MD file saving
        String savePath = $o("add-paragraph.md");

        // Save MD file
        syntaxTree.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Create Markdown from Scratch")
    public final void MDFromScratchTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Use the SyntaxFactory property to get the factory for creating the Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        AtxHeadingSyntaxNode heading2 = mdf.atxHeading("How to create Markdown from scratch in C#?", 2);

        // Create and add newLineTrivia element for an empty line after heading1
        WhitespaceSyntaxNode newLineTrivia = mdf.newLineTrivia();
        heading2.getTrailingTrivia().addItem(newLineTrivia);

        // Add the  headers to the Markdown syntax tree
        md.appendChild(heading2);

        // Create an empty paragraph
        ParagraphSyntaxNode paragraph = mdf.paragraph();

        // Add texts to the paragraph
        paragraph.appendChild(mdf.text("First, add an Aspose.HTML for .NET library reference to your C# project."));

        // Add an empty line after the first sentence in the paragraph through a special WhiteSpace node
        paragraph.appendChild(mdf.newLineTrivia());

        paragraph.appendChild(mdf.text("Then create the MarkdownSyntaxTree and use the SyntaxFactory property to get a syntax factory to create new elements."));

        // Add the filled paragraph into MD document
        md.appendChild(paragraph);

        // Prepare a path for MD file saving
        String savePath = $o("create-from-scratch.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Save Markdown")
    public final void saveMDTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Use the SyntaxFactory property to get the factory for creating the Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an empty paragraph
        ParagraphSyntaxNode paragraph = mdf.paragraph();

        // Add texts to the paragraph
        paragraph.appendChild(mdf.text("Markdown is a simple markup language that allows you to format plain text."));

        // Add a space after the first sentence in the paragraph through a special WhiteSpace node
        paragraph.appendChild(mdf.whitespace());

        paragraph.appendChild(mdf.text("MD files use Markdown language that was proposed and developed by John Gruber."));

        // Add the filled paragraph into MD document
        md.appendChild(paragraph);

        // Prepare a path for MD file saving
        String savePath = $o("save.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Two Paragraphs into Markdown")
    public final void addTwoParagraphsTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Use the SyntaxFactory property to get the factory for creating the Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an empty paragraph1
        ParagraphSyntaxNode paragraph1 = mdf.paragraph();

        // Add texts to the paragraph1
        paragraph1.appendChild(mdf.text("The first sentence of the first paragraph."));
        // Add a space after the first sentence in the paragraph through a special WhiteSpace node
        paragraph1.appendChild(mdf.whitespace());

        paragraph1.appendChild(mdf.text("The second sentence of the first paragraph."));

        // Create and add newLineTrivia element for an empty line after paragraph1
        WhitespaceSyntaxNode newLineTrivia = mdf.newLineTrivia();
        paragraph1.getTrailingTrivia().addItem(newLineTrivia);

        // Add the filled paragraph1 into MD document
        md.appendChild(paragraph1);

        // Create an empty paragraph2
        ParagraphSyntaxNode paragraph2 = mdf.paragraph();

        // Add texts to the paragraph2
        paragraph2.appendChild(mdf.text("The first sentence of the second paragraph."));
        // Add a space after the first sentence in the paragraph through a special WhiteSpace node
        paragraph2.appendChild(mdf.whitespace());

        paragraph2.appendChild(mdf.text("The second sentence of the second paragraph."));

        // Add newLineTrivia element for an empty line after paragraph2
        paragraph2.getTrailingTrivia().addItem(newLineTrivia);

        // Add the filled paragraph2 into MD document as a last child
        md.appendChild(paragraph2);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-paragraph.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Italic and Bold Texts into Markdown")
    public final void addItalicandBoldTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create italic object
        EmphasisSyntaxNode italic = mdf.emphasis(Emphasis.Regular);

        // Add text for italic emphasis
        italic.appendChild(mdf.text("First line."));

        // Add italic emphasis into MD document
        md.appendChild(italic);

        md.appendChild(mdf.whitespace());

        // Create bold object add text for it
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);
        bold.appendChild(mdf.text("First line."));

        // Add bold emphasis into MD document
        md.appendChild(bold);

        // Prepare a path for MD file saving
        String savePath = $o("output-italic-and-bold.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Italic-Bold Text into Markdown")
    public final void addItalicBoldTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an emphasis of type Strong (bold)
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);

        // Create an italic object add text for it
        EmphasisSyntaxNode italic = mdf.emphasis(Emphasis.Regular);
        italic.appendChild(mdf.text("Bold Italic Text"));

        // Add italic object to bold element
        bold.appendChild(italic);

        // Add the bold element to the Markdown syntax tree
        md.appendChild(bold);

        // Prepare a path for MD file saving
        String savePath = $o("italic-bold.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Bold Text into Markdown")
    public final void addBoldTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree markdown = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = markdown.getSyntaxFactory();

        // Create bold object add text for it
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);
        bold.appendChild(mdf.text("Bold in Markdown"));

        // Add bold text to the Markdown syntax tree
        markdown.appendChild(bold);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-bold.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Italic into Markdown")
    public final void addItalicTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree markdown = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = markdown.getSyntaxFactory();

        // Create an italic object add text for it
        EmphasisSyntaxNode italic = mdf.emphasis(Emphasis.Regular);
        italic.appendChild(mdf.text("Italic in Markdown"));

        // Add italic text to the Markdown syntax tree
        markdown.appendChild(italic);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-italic.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Bold Text for a Single Word")
    public final void addBoldSingleWordTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an empty paragraph
        ParagraphSyntaxNode paragraph = mdf.paragraph();

        // Add texts and whitespace to the paragraph
        paragraph.appendChild(mdf.text("The Markdown bold is used to"));
        paragraph.appendChild(mdf.whitespace());

        // Create bold object add text for it
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);
        bold.appendChild(mdf.text("bold"));

        // Add bold text and whitespace after it to the paragraph
        paragraph.appendChild(bold);
        paragraph.appendChild(mdf.whitespace());

        // Complete the text of sentence and add to the paragraph
        paragraph.appendChild(mdf.text("the text, and it is similar to the bold in Microsoft Word and other text formatting documents."));

        // Add paragraph into MD document
        md.appendChild(paragraph);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-bold-word.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Blockquotes with Multiple Paragraphs")
    public final void addBlockquotesTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree markdown = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = markdown.getSyntaxFactory();

        // Create a blockQuote object
        BlockQuoteSyntaxNode blockQuote = mdf.blockQuote();

        // Add a leading trivia token blockquote
        blockQuote.getLinesLeadingTrivia().addItem(mdf.token(SourceText.from("> ")));

        // Create a paragraph with text content
        ParagraphSyntaxNode paragraph = mdf.paragraph();
        paragraph.appendChild(mdf.text("For blockquote creation, you should put a sign `>` before the first line of a hard-wrapped paragraph.."));

        // Add paragraph into blockQuote
        blockQuote.appendChild(paragraph);

        // Add blockQuote object into MD document
        markdown.appendChild(blockQuote);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-blockquote.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Nested Blockquotes")
    public final void addNestedBlockquotesTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        BlockQuoteSyntaxNode bq = mdf.blockQuote();

        //Добавляем в leading trivia токены blockquote:
        bq.getLinesLeadingTrivia().addItem(mdf.token(SourceText.from("> ")));

        //Создаем пустой параграф и добавляем в него текстовую ноду:
        ParagraphSyntaxNode par = mdf.paragraph();
        par.appendChild(mdf.text("The first paragraph content."));

        //Добавляем созданный параграф в ранее созданную BlockQuote:
        bq.appendChild(par);

        //Создаем Новый BlockQuote который будет добавлен в синтаксическое дерево MD как nested:
        BlockQuoteSyntaxNode bqNested = mdf.blockQuote();

        //Добавляем в leading trivia токены вложенного  blockquote:
        bq.getLinesLeadingTrivia().addItem(mdf.token(SourceText.from(">> ")));

        //Добавляем новые параграф с текстом:
        ParagraphSyntaxNode par2 = mdf.paragraph();
        par2.appendChild(mdf.text("The nested blockQuote content."));
        bqNested.appendChild(par2);

        //Полученные BlockQuote добавляем в ранее созданный BlockQuote:
        md.appendChild(bq);

        //Заполненный BlockQuote добавляем в наше синтаксическое дерево, чтобы получить документ MD:
        md.appendChild(bqNested);

        // Prepare a path for MD file saving
        String savePath = $o("output-nested-bq.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Element Blockquotes")
    public final void addElementsBlockquotesTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        BlockQuoteSyntaxNode bq = mdf.blockQuote();

        //Добавим токен с которого должен начинаться цитата:
        bq.getLinesLeadingTrivia().addItem(mdf.token(SourceText.from("> ")));

        //Создадим пустой параграф и наполним его заголовком:
        ParagraphSyntaxNode par = mdf.paragraph();
        AtxHeadingSyntaxNode heading = mdf.atxHeading("Heading2", 2);
        par.appendChild(heading);

        //Затем добавим параграф в ранее созданный BlockQuote:
        bq.appendChild(par);

        //Создадим emphasis  типа Bold и добавим в него текст:
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);
        bold.appendChild(mdf.text("First line."));

        //созданный элемент также добавим в BlockQuote:.
        bq.appendChild(bold);

        //Заполненный BlockQuote добавляем в наше синтаксическое дерево, чтобы получить документ MD:
        md.appendChild(bq);

        // Prepare a path for MD file saving
        String savePath = $o("output-el-bq.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Link")
    public final void addLinkTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        InlineLinkSyntaxNode link = mdf.inlineLink("C# HTML Parser", "https://products.aspose.com/html/net/", "Aspose.HTML  for .NET\r\nC# API to Parse HTML Files");

        // Add link into MD document
        md.appendChild(link);

        // Prepare a path for MD file saving
        String savePath = $o("output-link.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Image")
    public final void addImageTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        //Чтобы создать элемент Image  заполним вначале переменные для альтернативного текста:
        String altText = "The San Juan Mountains are beautiful";

        //Для заголовка:
        String label = "San Juan Mountains";

        //И для ссылки на изображение:
        String href = "https://products.aspose.com/html/images/headers/aspose_html-brand.svg";

        //Затем создадим элемент Image:
        InlineImageSyntaxNode image = mdf.inlineImage(altText, href, label);

        // Add image into MD document
        md.appendChild(image);

        // Prepare a path for MD file saving
        String savePath = $o("output-image.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Image Link")
    public final void addImageLinkTest() {

        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree markdown = new MarkdownSyntaxTree(new Configuration());

        // Create a link node and add it to Markdown syntax tree
        InlineLinkSyntaxNode link = markdown.getSyntaxFactory().inlineLink("", "https://docs.aspose.com/html/", "");
        markdown.appendChild(link);

        // Create an image node and add it as a link
        InlineImageSyntaxNode image = markdown.getSyntaxFactory().inlineImage("Aspose.HTML for .NET", "https://products.aspose.com/html/images/headers/aspose_html-for-net.svg", "C# HTML Parser - Documentation");
        link.appendChild(image);

        // Prepare a path for MD file saving
        String savePath = $o("image-link.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Remove Image from link")
    public final void removeImageTest() {
        String mdtext =
                "[![An old rock in the desert](https://httpbin.org/image/jpeg \"Shiprock, New Mexico by Beau Rogers\")](https://httpbin.org/image/jpeg)";
        MarkdownParser parser = new MarkdownParser();
        MarkdownSyntaxTree markdown = parser.parse(mdtext);
        final TreeWalker iterator = markdown.createTreeWalker(markdown.getFirstChild());
        while (iterator.nextNode() != null) {
            MarkdownSyntaxNode node = iterator.getCurrentNode();
            if (node instanceof InlineLinkSyntaxNode) {
                node.removeChild(node.getFirstChild());
                node.appendChild(markdown.getSyntaxFactory().text("The link new content."));
                break;
            }
        }

        // Prepare a path for MD file saving
        String savePath = $o("remove-image.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Escaping Characters")
    public final void addEscapingCharactersTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        TextSyntaxNode escape = mdf.escapedCharacter('*');

        // и добавим полученный элемент в дерево MD
        md.appendChild(escape);

        // Prepare a path for MD file saving
        String savePath = $o("output-escape.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Edit MD")
    public final void editMDTest() {
        // Открытие файла документа Маркдуана.
        String input = $i("document.md");

        //Создадим MarkdownParser, с помощью которого будем работать с синтаксическим деревом MD.
        MarkdownParser parser = new MarkdownParser();

        // Parse the MD document and get a syntax tree
        MarkdownSyntaxTree markdown = parser.parseFile(input);

        final TreeWalker iterator = markdown.createTreeWalker(markdown.getFirstChild());
        while (iterator.nextNode() != null) {
            if (iterator.getCurrentNode() instanceof EmphasisSyntaxNode) {
                EmphasisSyntaxNode node = (EmphasisSyntaxNode) iterator.getCurrentNode();
                MarkdownSyntaxNode n = node.getFirstChild();
                while (n != null) {
                    MarkdownSyntaxNode next = n.getNextSibling();
                    node.removeChild(n);
                    n = next;
                }

                // Get a SyntaxFactory to create new elements
                MarkdownSyntaxFactory syntax = markdown.getSyntaxFactory();

                ParagraphSyntaxNode par = syntax.paragraph();
                par.appendChild(syntax.text("The first paragraph content."));
                node.appendChild(par);

                EmphasisSyntaxNode bold = syntax.emphasis(Emphasis.Strong);
                bold.appendChild(syntax.text("Bold Text."));
                node.appendChild(bold);

                node.appendChild(syntax.text("new text with"));

                node.appendChild(syntax.whitespace());

                EmphasisSyntaxNode emphasis1 = syntax.emphasis(Emphasis.Strong);
                emphasis1.appendChild(syntax.text("strong emphasis!!"));
                node.appendChild(emphasis1);
                break;
            }
        }
        // Prepare a path for MD file saving
        String savePath = $o("output-edit1.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Edit MD2")
    public final void editMD2Test() {
        // Specify the path to the source MD file
        String input = $i("document.md");

        // Create a MarkdownParser object
        MarkdownParser parser = new MarkdownParser();

        // Parse the MD document and get a syntax tree
        MarkdownSyntaxTree markdown = parser.parseFile(input);
        // var filter = MarkdownSyntaxNodeFilter.Any;
        final TreeWalker iterator = markdown.createTreeWalker(markdown.getFirstChild());
        while (iterator.nextNode() != null) {
            if (iterator.getCurrentNode() instanceof EmphasisSyntaxNode) {
                EmphasisSyntaxNode node = (EmphasisSyntaxNode) iterator.getCurrentNode();
                MarkdownSyntaxNode n = node.getFirstChild();
                while (n != null) {
                    MarkdownSyntaxNode next = n.getNextSibling();
                    node.removeChild(n);
                    n = next;
                }

                // Get a SyntaxFactory to create new elements
                MarkdownSyntaxFactory syntax = markdown.getSyntaxFactory();

                node.appendChild(syntax.text("new text with"));

                node.appendChild(syntax.emptyLine());

                node.appendChild(syntax.whitespace());

                EmphasisSyntaxNode emphasis = syntax.emphasis(Emphasis.Strong);

                emphasis.appendChild(syntax.text("strong emphasis!!"));
                node.appendChild(emphasis);
                break;
            }
        }

        // Prepare a path for MD file saving
        String savePath = $o("output-edit2.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Edit Heading Text")
    public final void editHeadingTextTest() {
        // Specify the path to the source MD file
        String input = $i("document.md");

        // Create a MarkdownParser object
        MarkdownParser parser = new MarkdownParser();

        // Parse the MD document and get a syntax tree
        MarkdownSyntaxTree syntaxTree = parser.parseFile(input);

        // The first element of this document is AtxHeading
        AtxHeadingSyntaxNode heading = (AtxHeadingSyntaxNode) syntaxTree.getFirstChild();

        // Accumulate the text content from its elements
        StringBuilder sb = new StringBuilder();

        while (heading.getFirstChild() != null) {
            sb.append(heading.getFirstChild());

            //  Remove accumulated first element from the tree
            heading.removeChild(heading.getFirstChild());
        }

        // Get a SyntaxFactory to create new elements
        MarkdownSyntaxFactory syntaxFactory = syntaxTree.getSyntaxFactory();

        // Сreate a text node consisting of new and old text and add it as a child element of AtxHeading
        TextSyntaxNode textSyntaxNode = syntaxFactory.text("Some new text! " + sb);

        // Add the new element to the document tree
        heading.appendChild(textSyntaxNode);

        // Prepare a path for MD file saving
        String savePath = $o("output-edit-header.md");

        // Save MD file
        syntaxTree.save(savePath);

    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add New Paragraph")
    public final void addNewParagraphTest() {
        // Specify the path to the source MD file
        String input = $i("document.md");

        // Create a MarkdownParser object
        MarkdownParser parser = new MarkdownParser();

        // Parse the MD document and get a syntax tree
        MarkdownSyntaxTree syntaxTree = parser.parseFile(input);

        // Get a SyntaxFactory to create new elements
        MarkdownSyntaxFactory syntaxFactory = syntaxTree.getSyntaxFactory();

        // Create a new paragraph
        ParagraphSyntaxNode paragraphSyntaxNode = syntaxFactory.paragraph();

        // Create and add newLineTrivia element for an empty line after paragraph
        WhitespaceSyntaxNode newLineTrivia = syntaxFactory.newLineTrivia();
        paragraphSyntaxNode.getTrailingTrivia().addItem(newLineTrivia);

        // Create text content for the paragraph
        TextSyntaxNode textSyntaxNode = syntaxFactory.text("New paragraph text.");

        // Add text into paragraph
        paragraphSyntaxNode.appendChild(textSyntaxNode);

        // Add paragraph to syntax tree
        syntaxTree.insertBefore(paragraphSyntaxNode, syntaxTree.getFirstChild());

        // Prepare a path for MD file saving
        String savePath = $o("output.md");

        // Save MD file
        syntaxTree.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Unodered Lists")
    public final void addUnoderedListsTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factoty
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create a new empty unodered list node
        UnorderedListSyntaxNode unorderedList = mdf.unorderedList();

        // Create and add to the unodered list a li1 element with the marker “-”
        ListItemSyntaxNode li1 = mdf.unorderedListItem("-");
        unorderedList.appendChild(li1);

        // Create a paragraph with text content and add it to the li1 item:
        ParagraphSyntaxNode paragraph = mdf.paragraph();
        paragraph.appendChild(mdf.text("The first item of the unordered Markdown list."));
        li1.appendChild(paragraph);

        // Create and add to the unodered list a li2 element with the marker “-”
        ListItemSyntaxNode li2 = mdf.unorderedListItem("-");
        unorderedList.appendChild(li2);

        // Create a paragraph with text content and add it to the li2 item:
        ParagraphSyntaxNode paragraph2 = mdf.paragraph();
        paragraph2.appendChild(mdf.text("The second item of the unordered Markdown list."));
        li2.appendChild(paragraph2);

        // Add unorderedList to MD syntax tree
        md.appendChild(unorderedList);

        // Prepare a path for MD file saving
        String savePath = $o("markdown-unodered-list.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Odered Lists")
    public final void addOderedListsTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create a new empty odered list node
        OrderedListSyntaxNode orderedList = mdf.orderedList();

        // Create and add to the odered list a li1 item with the marker “1”
        ListItemSyntaxNode li1 = mdf.orderedListItem(1);
        orderedList.appendChild(li1);

        // Create a paragraph with text content and add it to the li1 item
        ParagraphSyntaxNode paragraph = mdf.paragraph();

        AtxHeadingSyntaxNode heading = mdf.atxHeading("The first element in the Markdown ordered list is the level 3 heading.", 3);
        paragraph.appendChild(heading);
        li1.appendChild(paragraph);

        //Create and add to the odered list a li2 item with the marker “2”
        ListItemSyntaxNode li2 = mdf.orderedListItem(2);
        orderedList.appendChild(li2);

        // Create a strong emphasis with text content and add it to the li2 item
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);

        bold.appendChild(mdf.text("The second item in the Markdown ordered list is in bold."));
        li2.appendChild(bold);

        // Add orderedList to MD syntax tree
        md.appendChild(orderedList);

        // Prepare a path for MD file saving
        String savePath = $o("output-odered-list.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Odered Lists2")
    public final void addOderedLists2Test() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        //Создаем новый пустой несортированный список, который позже будем наполнять:
        OrderedListSyntaxNode orderedList = mdf.orderedList();

        //создадим и добавим в список элемент списка с маркером 1
        ListItemSyntaxNode li1 = mdf.orderedListItem(1);
        orderedList.appendChild(li1);

        //Создаем параграф и добавляем его в элемент списка:
        ParagraphSyntaxNode par = mdf.paragraph();

        AtxHeadingSyntaxNode heading = mdf.atxHeading("Heading5", 5);
        par.appendChild(heading);
        li1.appendChild(par);

        //Создаем второй элемент списка и добавляем его в список. В качестве параметра передаем Маркер элемента листа.
        ListItemSyntaxNode li2 = mdf.orderedListItem(2);
        orderedList.appendChild(li2);

        //Затем наполняем его:
        EmphasisSyntaxNode bold = mdf.emphasis(Emphasis.Strong);

        bold.appendChild(mdf.text("Bold line."));
        li2.appendChild(bold);

        //И полученный список мы добавляем в документ Маркдаун.
        md.appendChild(orderedList);

        // Prepare a path for MD file saving
        String savePath = $o("output-odered-list.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Inline Code")
    public final void addCodeTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an empty codeSpan node
        CodeSpanSyntaxNode codeSpan1 = mdf.codeSpan();

        // Create text content for the codeSpan
        codeSpan1.appendChild(mdf.text("Source code text1."));

        // Add codeSpan to MD document
        md.appendChild(codeSpan1);

        // Add a space after the code node through a special WhiteSpace node
        md.appendChild(mdf.whitespace());

        // Prepare a path for MD file saving
        String savePath = $o("markdown-code.md");

        // Save MD file
        md.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Code Block")
    public final void addCodeBlockTest() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree markdown = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax factory
        MarkdownSyntaxFactory mdf = markdown.getSyntaxFactory();

        // Create a start token and an end token that will frame a code block
        MarkdownSyntaxToken startToken = mdf.token(SourceText.from("```\r\n"));
        MarkdownSyntaxToken endToken = mdf.token(SourceText.from("\r\n```"));

        // Create a fenced code element
        FencedCodeBlockSyntaxNode fencedCodeSpan = mdf.fencedCodeBlock(startToken, null, endToken);

        // Create text content for the fenced code element
        fencedCodeSpan.appendChild(mdf.text("Source code text"));

        //Add the fenced code element to MD file
        markdown.appendChild(fencedCodeSpan);

        // Prepare a path for MD file saving
        String savePath = $o("code-block.md");

        // Save MD file
        markdown.save(savePath);
    }

    @org.junit.jupiter.api.Test
    @org.junit.jupiter.api.Timeout(value = 50, unit = java.util.concurrent.TimeUnit.SECONDS)
    @DisplayName("Add Inline and Code Block")
    public final void addCodeBlock2Test() {
        // Create the MarkdownSyntaxTree
        MarkdownSyntaxTree md = new MarkdownSyntaxTree(new Configuration());

        // Create a Markdown syntax tree
        MarkdownSyntaxFactory mdf = md.getSyntaxFactory();

        // Create an empty codeSpan node
        CodeSpanSyntaxNode codeSpan1 = mdf.codeSpan();

        // Create text content for the codeSpan
        codeSpan1.appendChild(mdf.text("Source code text1."));

        // Add codeSpan to MD document
        md.appendChild(codeSpan1);

        // Добавим после нее пробел через специальную ноду WhiteSpace:
        md.appendChild(mdf.whitespace());

        //Если необходимо использовать backticks в тексте, можно использовать вызов с параметром количество backticksCount:
        CodeSpanSyntaxNode codeSpan2 = mdf.codeSpan(2);

        // Create text content for the codeSpan
        codeSpan2.appendChild(mdf.text("Source code text2."));

        // Add codeSpan to MD document
        md.appendChild(codeSpan2);

        // Добавим после нее пробел через специальную ноду WhiteSpace:
        //md.appendChild(mdf.whitespace());

        // Create and add newLineTrivia element for an empty line after code
        WhitespaceSyntaxNode newLineTrivia = mdf.newLineTrivia();
        codeSpan2.getTrailingTrivia().addItem(newLineTrivia);

        //Создадим начальный токен и конечный токен, которыми будет обрамлен наш кодовый блок:
        MarkdownSyntaxToken startToken = mdf.token(SourceText.from("```\r\n"));
        MarkdownSyntaxToken endToken = mdf.token(SourceText.from("\r\n```"));

        //Затем создадим fenced code элемент:
        FencedCodeBlockSyntaxNode fencedCodeSpan = mdf.fencedCodeBlock(startToken, null, endToken);

        //B и добавим текст в полученный элемент:
        fencedCodeSpan.appendChild(mdf.text("Source code text3."));

        //Заполненный fenced code эелемент добавим в наш документ:
        md.appendChild(fencedCodeSpan);

        // Prepare a path for MD file saving
        String savePath = $o("output-code-block.md");

        // Save MD file
        md.save(savePath);
    }

}

