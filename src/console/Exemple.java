
package console;

import com.itextpdf.text.Paragraph;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exemple {

    public static void main(String[] args) throws DocumentException,IOException {
    
        Document document = new Document();

        PdfWriter.getInstance(document, new FileOutputStream("Bateaux.pdf")); 
        
        document.open();

        
        document.add(new Paragraph("Bateau voyageur.\n\n"));
                
        Image image1 = Image.getInstance("bateau.jpg");
        document.add(image1);

        document.add(new Paragraph("\n\nBateau frêt.\n\n"));
        
        
        Image image2 = Image.getInstance("cargo.jpg");
        document.add(image2);

        document.close();
    
  }
}

