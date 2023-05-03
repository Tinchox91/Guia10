
package Inicio;

import Entidad.Alumno;
import Servicios.Servicio_Alumnos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Inicio {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio_Alumnos serv = new Servicio_Alumnos();
        List <Alumno> alu =  new ArrayList<>();
        String resp;
        do{ 
        alu.add(serv.crearAlumno());
            System.out.println("Desea cargar otro alumno?");
             resp=leer.next();
           
        } while (resp.equalsIgnoreCase("si"));
        System.out.println("Ingrese el nombre del alumno para calcular su nota final:");
String nombre = leer.next();
int notaFinal = serv.notaFinal(alu, nombre);
if (notaFinal == -1) {
    System.out.println("El alumno no está en la lista.");
} else {
    System.out.println("La nota final de " + nombre + " es " + notaFinal);
}
        }
    
    
}
