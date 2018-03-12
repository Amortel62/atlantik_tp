
package console;

import java.sql.Connection;
import jdbc.BaseServ;

public class EssaiPasserelle {

    public static void main(String[] args) {
        
        
          Connection cx=BaseServ.getConnexion();
          
          if(cx!=null) System.out.println("Connexion réussie"); else System.out.println("Echec à la connexion");
          
          
    }
}
