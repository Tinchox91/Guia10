
package Inicio;

import CinePack.Pelicula;
import Servicio.Pelicula_Service;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Inicio_Cine {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula_Service serv = new Pelicula_Service();
       ArrayList <Pelicula> peli = new  ArrayList();       
       String si;
     do {
         peli.add(serv.crearPeli());
         System.out.println("Quiere cargar otro? Si/no");
         si= leer.next();
         
     }while (si.equalsIgnoreCase("si"));
     
     serv.mostrar( peli);
         
         System.out.println("-----------------");
         System.out.println("AHORA SOLO LAS QUE TIENEN MASD DE UNA HORA DE DURACION");
         peli = serv.mostrarSolo(peli);
         serv.mostrar(peli);
         System.out.println(" ----------------");
         System.out.println("Ordenado por Duracion (Desc)");
         Collections.sort(peli, Comparadores.ordenarPorDuracionDesc);//Se llama a la clase creada "comparadores al metodo ordenar por duracion" 
         serv.mostrar( peli);// se muestra
         System.out.println("*************");
         System.out.println("Ahora ordenado Ascendente por duracion");
         Collections.reverse(peli); //Se revierte el orden hecho por el comparador previamente
     serv.mostrar( peli);
      System.out.println(" ----------------");       
         System.out.println("Ordenado por Titulo");
         Collections.sort(peli, Comparadores.ordenarPorTitulo);
              Collections.reverse(peli);
       serv.mostrar( peli);
       System.out.println(" ----------------");       
         System.out.println("Ordenado por Director");
       Collections.sort(peli, Comparadores.ordenarPorDirector);
       Collections.reverse(peli);
         serv.mostrar( peli);
          
    }
    
}
