
package Inicio;

import Comparadores.Comparadores;
import Pais.Pais;
import Servicio_Pais.Servicio_Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class Inicio {

   
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
         Servicio_Pais serv= new Servicio_Pais(); 
         String res;
         
         TreeSet <Pais> pais = new TreeSet();  
        do {
            pais.add(serv.ingresarPais());
            System.out.println(" Desea agregar otro pais?");
            res = leer.next();

        } while (res.equalsIgnoreCase("si"));
        //ArrayList <Pais> paises = new ArrayList (pais);
       // Collections.sort (paises,Comparadores.ordenarPais);
       
for (Pais ve : pais){
    System.out.println("-"+ve.getPais());
}
/*//esta es otra forma de imprimir una colection 
       pais.forEach((e)-> System.out.println(e));
      
  */  
        System.out.println("Hay "+ pais.stream().count()+" paises");//con la funcion stream.count cuenta  los elementos de la colection
   
    
        System.out.print("Ingrese el pais que desea eliminar: ");
        String eliminar=leer.next();
        //Elimina un objeto de la lista pais
      /* for (Iterator<Pais> iterator = pais.iterator(); iterator.hasNext();) {
    Pais p = iterator.next();
    if (p.getPais().equals(eliminar)) {
        iterator.remove();
    }
}*/
      boolean val= true;
 //Esta es otra forma de eliminar un pais de la lista 
      Iterator <Pais> it = pais.iterator();
        while (it.hasNext()) { //nota: poniendio la palabra while y apretando Ctrl + espacio se abre la opcion de autocompletado
            Pais auxi = it.next();
            if (auxi.getPais().equals(eliminar)){
                it.remove();
                val= true;
            }else val=false;
          
                  if (val==false){
               System.out.println("El pais no se encuentra en la lista");
               break;
           }else   for (Pais ve : pais){
    System.out.println("-"+ve.getPais());
}      
        }

      
    }
    
   
    
}
