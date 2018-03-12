package entites;

public class Bateau {

    private Long     idBat;
    private String   nomBat;
    private Long     longueurBat;
    private Long     largeurBat;

    public Bateau() {};

    public Bateau(Long idBat, String nomBat, Long longueurBat, Long largeurBat) {
        
        this.idBat = idBat;
        this.nomBat = nomBat;
        this.longueurBat = longueurBat;
        this.largeurBat = largeurBat;
    }
    
    
    /*
    La méthode toString  doit  retourner par exemple la chaîne suivante ( avec les sauts de ligne )
    Nom du bateau: Luce Isle
    Longueur: 37 mètres
    Largeur: 9 mètres 
     */
    
    @Override
    public String toString() {
       
        return 
               "Nom  du bateau: "+ nomBat + "\n" + 
               "Longueur      : "       + longueurBat + " mètres\n" + 
               "Largeur       :"        + largeurBat  + " mètres\n" ;
             
    }

   
          
    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
    public Long getIdBat() {
        return idBat;
    }
    
    public void setIdBat(Long idBat) {
        this.idBat = idBat;
    }
    
    public String getNomBat() {
        return nomBat;
    }
    
    public void setNomBat(String nomBat) {
        this.nomBat = nomBat;
    }
    
    public Long getLongueurBat() {
        return longueurBat;
    }
    
    public void setLongueurBat(Long longueurBat) {
        this.longueurBat = longueurBat;
    }
    
    public Long getLargeurBat() {
        return largeurBat;
    }
    
    public void setLargeurBat(Long largeurBat) {
        this.largeurBat = largeurBat;
    }
    
    //</editor-fold>
     
}

