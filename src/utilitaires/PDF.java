
package utilitaires;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PDF extends Document{
    
 
   // Contructeur de la classe. Il crée le fichier  PDF vierge dont le nom est donné par le paramètre nomDocument
    
   public PDF(String nomDocument)  {
      
      super(); 
      try {
      
          PdfWriter.getInstance( this , new FileOutputStream(nomDocument));     
      }
      
      catch (DocumentException ex)     {Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);}
      catch (FileNotFoundException ex) {Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);}      
   }

   // Ecrit le contenu de la chaîne de caractères désignée par le paramètre uneChaine dans le document pdf
   
   public void ecrireTexte(String uneChaine) {
    
      try {
          
          add(new Paragraph(uneChaine));
      }
      
      catch (DocumentException ex) { Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex); }
   }
   
   //Insère dans le document l'image dont le chemin d'accès est fourni en paramètre
   
   public void chargerImage( String unCheminImage) {
     
      try {
          
          Image image = Image.getInstance(unCheminImage);
          add(image);
      } 
      
      catch (BadElementException ex)   { Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);}
      catch (MalformedURLException ex) { Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);}
      catch (IOException ex)           { Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);} 
      catch (DocumentException ex)     { Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);}
   
   };
   
   // ouvre le document
   
   public void ouvrir(){open();}
      
   // Ferme le document
   
   public void fermer(){close();}; 

}




