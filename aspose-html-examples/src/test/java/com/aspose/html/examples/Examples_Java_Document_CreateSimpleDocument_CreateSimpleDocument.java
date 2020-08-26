package com.aspose.html.examples;

public class Examples_Java_Document_CreateSimpleDocument_CreateSimpleDocument {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        String dataDir = RunExamples.getResourcePath();
        String outputHtml = dataDir + "SimpleDocument.html";

        // Create an instance of HTMLDocument
        com.aspose.html.HTMLDocument document = new com.aspose.html.HTMLDocument();

        // Add image
        com.aspose.html.dom.Element elm = document.createElement("img");
        if (elm instanceof com.aspose.html.HTMLImageElement) {
            com.aspose.html.HTMLImageElement img = (com.aspose.html.HTMLImageElement) elm;
            img.setSrc("http://via.placeholder.com/400x200");
            img.setAlt("Placeholder 400x200");
            img.setTitle("Placeholder image");
            document.getBody().appendChild(img);
        }

        // Add ordered list
        com.aspose.html.HTMLOListElement orderedListElement = (com.aspose.html.HTMLOListElement) document.createElement("ol");
        for (int i = 0; i < 10; i++) {
            com.aspose.html.HTMLLIElement listItem = (com.aspose.html.HTMLLIElement) document.createElement("li");
            listItem.setTextContent(" List Item {" + (i + 1) + "}");
            orderedListElement.appendChild(listItem);
        }
        document.getBody().appendChild(orderedListElement);

        // Add table 3x3
        com.aspose.html.HTMLTableElement table = (com.aspose.html.HTMLTableElement) document.createElement("table");
        com.aspose.html.HTMLTableSectionElement tBody = (com.aspose.html.HTMLTableSectionElement) document.createElement("tbody");
        for (int i = 0; i < 3; i++) {
            com.aspose.html.HTMLTableRowElement row = (com.aspose.html.HTMLTableRowElement) document.createElement("tr");
            row.setId("trow_" + i);
            for (int j = 0; j < 3; j++) {
                com.aspose.html.HTMLTableCellElement cell = (com.aspose.html.HTMLTableCellElement) document.createElement("td");
                cell.setId("cell{" + i + "}_{" + j + "}");
                cell.setTextContent("Cell " + j);
                row.appendChild(cell);
            }
            tBody.appendChild(row);
        }
        table.appendChild(tBody);
        document.getBody().appendChild(table);

        //Save the document to disk
        document.save(outputHtml);
    }
}