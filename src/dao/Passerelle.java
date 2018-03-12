
package dao;

import entites.Bateau;
import entites.BateauFret;
import entites.BateauVoyageur;
import entites.Equipement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.BaseServ;

public class Passerelle {

    private static Connection  cx= BaseServ.getConnexion();
    
    
    // Exécute la requête reqSQL passée en paramètre
    // et retourne le ResultSet contenant les rangées correspondantes 
   
    private static ResultSet  creerResultSet( String reqSQL){
        
        ResultSet rs=null;
        Statement requete;
        
        try {
            
             requete =  cx.createStatement();
             rs      =  requete.executeQuery(reqSQL);
        } 
        
        catch (SQLException ex) { Logger.getLogger(Passerelle.class.getName()).log(Level.SEVERE, null, ex); }
        
        return rs;
    }
    
    // Retourne la liste des Equipements du bateau dont l'identifiant est passé en paramètre
    
    private static List<Equipement>     chargerLesEquipements(Long unIdBateau) {
        
        List<Equipement>  lesEquipements= new LinkedList<Equipement>();
        
        try {
                 
            String reqSQL="SELECT E.id, E.lib FROM EQUIPEMENT E, POSSEDER P "+
                          "WHERE  P.idBat='" + unIdBateau + "' "+
                          "AND    P.idEquip = E.id ";
            
            ResultSet rs= creerResultSet(reqSQL);
           
            while (rs.next()){
          
                   Equipement eqpt= new Equipement
                                    (
                                     rs.getLong("id"),   // Accès à la colonne de nom id
                                     rs.getString("lib") // Accès à la colonne de nom lib
                                    );
                   
                   lesEquipements.add(eqpt);
            }           
        } 
        
        catch (SQLException ex) { Logger.getLogger(Passerelle.class.getName()).log(Level.SEVERE, null, ex);}
         
        return lesEquipements;
    }
    
    
    // Instancie et retourne la liste d'objets de la classe BateauVoyageur, à partir des données lues dans la base 
    // Cette méthode instancie également la liste lesEquipements de chaque objet de la classe BateauVoyageur.
    
    public static List<BateauVoyageur> chargerLesBateauxVoyageurs() throws SQLException {
    
        List<BateauVoyageur>  maColl = new LinkedList<BateauVoyageur>();
        List<Equipement>  mesEquip = new LinkedList<Equipement>();
        String ch;
        BateauVoyageur monBatVoy;
        
        
        ch = "Select id,nom,longueur,largeur,vitesse,image" +
             "From Bateau where type = 'v'";
        
        ResultSet rs= creerResultSet(ch);
        
        while(rs.next()){
        
            mesEquip = chargerLesEquipements(rs.getLong("id"));
            monBatVoy = new BateauVoyageur(rs.getFloat("vitesse"),rs.getString("image"),mesEquip,rs.getLong("id"),rs.getString("nom"),rs.getLong("longueur"),rs.getLong("largeur"));
            
            maColl.add(monBatVoy);
              
        }
        
        
        return maColl;
    
    }
    
  
    // Instancie et retourne la liste d'objets de la classe BateauFret, à partir des données lues dans la base 
   
    
    public static List<BateauFret> chargerLesBateauxFrets(){
        
        return null;
    }
    
    
    
    // Instancie et retourne soit  objet de la classe BateauVoyageur , soit un  BateauFret à partir des données lues dans la base
    // en fonction du type v ou f lu dans la table BATEAU
    public static Bateau           chargerUnBateau(Long idBat){
    
          
        return null;
    }
    
}


