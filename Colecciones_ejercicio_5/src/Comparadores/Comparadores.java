
package Comparadores;

import Pais.Pais;
import java.util.Comparator;


public class Comparadores {
    
    public static Comparator <Pais> ordenarPais =new Comparator <Pais> () { //Se apreta Ctrl + Espacio y se auto completa
        @Override
        public int compare(Pais o1, Pais o2) {
            return o1.getPais().compareTo(o2.getPais());
    }
            
    
    };
            }        