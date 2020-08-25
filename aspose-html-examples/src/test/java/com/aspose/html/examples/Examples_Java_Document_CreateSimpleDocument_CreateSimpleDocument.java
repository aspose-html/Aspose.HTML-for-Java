package com.aspose.html.examples;

public class Examples_Java_Document_CreateSimpleDocument_CreateSimpleDocument {

    @org.junit.jupiter.api.Test
    public void execute() throws Exception {
        // For complete examples and data files, please go to https://github.com/aspose-html/Aspose.HTML-for-Java
        var dataDir = com.aspose.html.examples.RunExamples.GetDataDir_Data();
        String outputHtml = dataDir + "SimpleDocument.html";

        // Create an instance of HTMLDocument
        var document = new com.aspose.html.HTMLDocument();

        // Add image
        if (document.createElement("img") instanceof com.aspose.html.HTMLImageElement img) {
            img.setSrc("http://via.placeholder.com/400x200");
            img.setAlt("Placeholder 400x200");
            img.setTitle("Placeholder image");
            document.getBody().appendChild(img);
        }

        // Add ordered list
        var orderedListElement = (com.aspose.html.HTMLOListElement) document.createElement("ol");
        for (int i = 0; i < 10; i++) {
            var listItem = (com.aspose.html.HTMLLIElement) document.createElement("li");
            listItem.setTextContent(" List Item {" + (i + 1) + "}");
            orderedListElement.appendChild(listItem);
        }
        document.getBody().appendChild(orderedListElement);

        // Add table 3x3
        var table = (com.aspose.html.HTMLTableElement) document.createElement("table");
        var tBody = (com.aspose.html.HTMLTableSectionElement) document.createElement("tbody");
        for (var i = 0; i < 3; i++) {
            var row = (com.aspose.html.HTMLTableRowElement) document.createElement("tr");
            row.setId("trow_" + i);
            for (var j = 0; j < 3; j++) {
                var cell = (com.aspose.html.HTMLTableCellElement) document.createElement("td");
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