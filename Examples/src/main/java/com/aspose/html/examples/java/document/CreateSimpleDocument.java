package com.aspose.html.examples.java.document;

import com.aspose.html.HTMLDocument;
import com.aspose.html.HTMLImageElement;
import com.aspose.html.HTMLLIElement;
import com.aspose.html.HTMLOListElement;
import com.aspose.html.HTMLTableCellElement;
import com.aspose.html.HTMLTableElement;
import com.aspose.html.HTMLTableRowElement;
import com.aspose.html.HTMLTableSectionElement;
import com.aspose.html.examples.java.RunExamples;
import com.aspose.html.internal.ms.System.StringExtensions;



/**
 * <p>
 * Create a simple document, which contains one image, one ordered list and a table 3x3.
 * </p>
 */
public class CreateSimpleDocument
{
    public static void run()
    {
        // ExStart:CreateSimpleDocument
        String dataDir = RunExamples.getDataDir_Data();
        String outputHtml = StringExtensions.concat(dataDir,  "SimpleDocument.html");

        // Create an instance of HTMLDocument
        HTMLDocument document = new HTMLDocument();

        // Add image
        HTMLImageElement img = (HTMLImageElement) document.createElement("img");
        {
            img.setSrc("http://via.placeholder.com/400x200");
            img.setAlt("Placeholder 400x200");
            img.setTitle("Placeholder image");
            document.getBody().appendChild(img);
        }

        // Add ordered list
        HTMLOListElement  orderedListElement = (HTMLOListElement) document.createElement("ol");
        for (int i = 0; i < 10; i++)
        {
           HTMLLIElement listItem = (HTMLLIElement) document.createElement("li");
            listItem.setTextContent(String.format(" List Item %d", i + 1));
            orderedListElement.appendChild(listItem);
        }
        document.getBody().appendChild(orderedListElement);

        // Add table 3x3 
        HTMLTableElement table = (HTMLTableElement) document.createElement("table");
        HTMLTableSectionElement tBody = (HTMLTableSectionElement) document.createElement("tbody");
        for (int i = 0; i < 3; i++)
        {
           HTMLTableRowElement row = (HTMLTableRowElement) document.createElement("tr");
            row.setId(StringExtensions.concat("trow_", i));
            for (int j = 0; j < 3; j++)
            {
               HTMLTableCellElement cell = (HTMLTableCellElement) document.createElement("td");
                    cell.setId(String.format("cell%d_%d", i, j));
                cell.setTextContent(StringExtensions.concat("Cell ", j));
                row.appendChild(cell);
            }
            tBody.appendChild(row);
        }
        table.appendChild(tBody);
        document.getBody().appendChild(table);

        //Save the document to disk                        
        document.save(outputHtml);

        // ExEnd:CreateSimpleDocument           
    }
}
