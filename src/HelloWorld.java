/**
 * Qoppa Software - Source Code Sample
 */

import java.awt.Graphics2D;
import java.awt.print.PageFormat;

import com.qoppa.pdfWriter.PDFDocument;
import com.qoppa.pdfWriter.PDFGraphics;
import com.qoppa.pdfWriter.PDFPage;

public class HelloWorld
{
    public static void PdfFun()
    {
        try
        {
            // Create a document and a page in default Locale format
            PDFDocument pdfDoc = new PDFDocument();
            PDFPage newPage = pdfDoc.createPage(new PageFormat());

            // Draw to the page
            Graphics2D g2d = newPage.createGraphics();
            g2d.setFont (PDFGraphics.HELVETICA.deriveFont(24f));
            g2d.drawString("Hello World", 100, 100);
            g2d.drawString("===========", 100, 120);
            for(int x = 0; x<10; x++){
                g2d.drawString("Yolo " + x, 100, 150 + (x * 30));
            }

            // Add the page to the document and save it
            pdfDoc.addPage(newPage);
            pdfDoc.saveDocument("output.pdf");
        }
        catch (Throwable t)
        {
            t.printStackTrace();
        }
    }

}