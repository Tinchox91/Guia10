
package Servicio;

import CinePack.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pelicula_Service {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPeli(){
        System.out.print("Ingrese titulo: ");
        String titulo= leer.next();
        System.out.print("Ingrese Director: ");
        String director = leer.next();
        System.out.print("Ingrese duaracion: ");
        Integer duracion= leer.nextInt();
        Pelicula peli = new Pelicula(titulo,director,duracion);
        
         
       return peli;
    }
    
    public void mostrar(ArrayList <Pelicula> lista){
       
           for(Pelicula var:lista){
               System.out.println(var.toString());
    } 
           
                
                
        
    }
    
     public ArrayList <Pelicula> mostrarSolo(ArrayList <Pelicula> lista){
         ArrayList <Pelicula> order = new ArrayList();
         
         for (int i = 0; i < lista.size(); i++) {
             Integer dura= lista.get(i).getDuracion();
             if (dura> 1){
                 order.add(lista.get(i));
                 
             }
             
         }
         
  return order;          
}

     }
       
        
     
     