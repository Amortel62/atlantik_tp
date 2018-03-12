
package entites;

public class Equipement {

    private Long    idEquip;
    private String  libEquip;

    public Equipement(Long idEquip, String libEquip) {
        
        this.idEquip = idEquip;
        this.libEquip = libEquip;
    }
 
    /*
    
     La méthode toString  retourne l'attribut libEquip
     
    */ 
    @Override
    public String toString() {
        return libEquip;
    }   

    //<editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public Long getIdEquip() {
        return idEquip;
    }
    
    public void setIdEquip(Long idEquip) {
        this.idEquip = idEquip;
    }
    
    public String getLibEquip() {
        return libEquip;
    }
    
    public void setLibEquip(String libEquip) {
        this.libEquip = libEquip;
    }
    //</editor-fold>   
}


