
package Servicio_Pais;

import Pais.Pais;
import java.util.Scanner;


public class Servicio_Pais {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pais ingresarPais(){
        System.out.println("Ingrese un pais: ");
        String pais= leer.next();
        
       Pais nuevo = new Pais(pais);
        return nuevo;
    }
    
    
}
