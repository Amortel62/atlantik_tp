package entites;
import java.util.List;

public class BateauVoyageur extends Bateau{
    
    private Float                 vitesseBatVoy;
    private String                imageBatVot;
    private List<Equipement>      lesEquipements;


    public BateauVoyageur(Float vitesseBatVoy, String imageBatVot, List<Equipement> lesEquipements, Long idBat, String nomBat, Long longueurBat, Long largeurBat) {
        super(idBat, nomBat, longueurBat, largeurBat);
        this.vitesseBatVoy = vitesseBatVoy;
        this.imageBatVot = imageBatVot;
        this.lesEquipements = lesEquipements;
    }

        
    @Override
    public String toString() {
       
        String str;
               
        str = super.toString();
        str = str + "Vitesse : " + vitesseBatVoy + "noeuds \n Liste des équipements du bateau : \n";
        
        for (Equipement equipement : lesEquipements){
        
            str = str + " - " + equipement.toString() + "\n";
        
        }
                
        return str;    
    }

    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
   
    public Float getVitesseBatVoy() {
        return vitesseBatVoy;
    }
    
    public void setVitesseBatVoy(Float vitesseBatVoy) {
        this.vitesseBatVoy = vitesseBatVoy;
    }
    
    public String getImageBatVot() {
        return imageBatVot;
    }
    
    public void setImageBatVot(String imageBatVot) {
        this.imageBatVot = imageBatVot;
    }
    
    
    public List<Equipement> getLesEquipements() {
        return lesEquipements;
    }

    public void setLesEquipements(List<Equipement> lesEquipements) {
        this.lesEquipements = lesEquipements;
    }
        
    //</editor-fold>   
} 


