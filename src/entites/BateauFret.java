
package entites;


public class BateauFret extends Bateau{

    
    private Long poidsmaxBatFret;

    public BateauFret(Long poidsmaxBatFret, Long idBat, String nomBat, Long longueurBat, Long largeurBat) {
        
        
        super(idBat, nomBat, longueurBat, largeurBat);
        this.poidsmaxBatFret = poidsmaxBatFret;
    }

    
    public Long getPoidsmaxBatFret() {
        return poidsmaxBatFret;
    }

    public void setPoidsmaxBatFret(Long poidsmaxBatFret) {
        this.poidsmaxBatFret = poidsmaxBatFret;
    }
        
}
