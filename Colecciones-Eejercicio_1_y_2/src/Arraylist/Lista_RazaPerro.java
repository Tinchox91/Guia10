
package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/*
1.Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/

public class Lista_RazaPerro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void agregarRaza(){
        String raza;
        String res;
        ArrayList <String> listaRaza = new ArrayList();
        do {
            System.out.println("ingrese la raza de perro");
            raza= leer.next();
            listaRaza.add(raza);
            System.out.println("Desea continuar agregando?");
            res=leer.next();
        } while (res.equalsIgnoreCase("si"));
        
         for (String cadena : listaRaza) {

            System.out.println(cadena);
        }
Iterator <String> it = listaRaza.iterator();
        System.out.println(" ingrese raza que desea buscar e eliminar: ");
        String elim= leer.next();
       boolean encontrado = false;
        while (it.hasNext()) {
            String r = it.next();
            if (r.equals(elim)) {
                it.remove();
                System.out.println("La raza " + r + " ha sido eliminada.");
                encontrado = true;
               
                
            }
        }
        if (!encontrado) {
            System.out.println("La raza " + elim + " no se encuentra en la lista.");
            
               
        }
        Collections.sort(listaRaza);
        System.out.println("Lista de razas de perros actualizada: ");
        for (String cadena : listaRaza) {
            System.out.println(cadena);
        }
    }
}

