
package bll;

import dao.Passerelle;
import entites.BateauVoyageur;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import utilitaires.PDF;

public class EditionBrochure {

     public static void editerBrochure() throws SQLException{
   
          List<BateauVoyageur>  maColl = new LinkedList<BateauVoyageur>();
          PDF monPdf;
          
          maColl = Passerelle.chargerLesBateauxVoyageurs();
          monPdf = new PDF("BateauVoyageur.pdf");
          for(BateauVoyageur monBatVoy : maColl){
          
              monPdf.chargerImage(monBatVoy.getImageBatVot());
              monPdf.ecrireTexte(monBatVoy.toString());
          
          }
         
     }
   
}
