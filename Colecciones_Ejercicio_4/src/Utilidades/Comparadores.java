
package Utilidades;

import CinePack.Pelicula;
import java.util.Comparator;

public class Comparadores {
    public static Comparator <Pelicula> ordenarPorDuracionDesc = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
            
        }
    };
    
    public static Comparator <Pelicula> ordenarPorTitulo = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getTitulo().compareTo(o1.getTitulo());
            
        }
    };
    
      public static Comparator <Pelicula> ordenarPorDirector = new Comparator <Pelicula> () {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDirector().compareTo(o1.getDirector());
            
        }
    };
} 
