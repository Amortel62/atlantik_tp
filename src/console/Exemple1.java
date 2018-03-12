
package console;

import utilitaires.PDF;

public class Exemple1 {

    public static void main(String[] args) {
        
        PDF brochure= new PDF ("BrochureBateaux.pdf");
        
        brochure.ouvrir();

        brochure.ecrireTexte("Bateau voyageur.\n\n");
        
        brochure.chargerImage("bateau.jpg");
       

        brochure.ecrireTexte("\n\nBateau frêt.\n\n");
        
        brochure.chargerImage("cargo.jpg");
        
        brochure.fermer();
    
  }
}

