
package Inicio;

import Tienda_Service.TiendaServicio;
import java.util.Scanner;


public class Inicio {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        TiendaServicio serv = new TiendaServicio();
        boolean val=false;
        boolean val3= false;
        int var =0; 
        do{
        System.out.println("Ingrese:");
            System.out.println("1.Agregar producto");
            System.out.println("2. Mostrar todos");
            System.out.println("3.Modificar Precio");
            System.out.println("4.Eliminar Producto");
            System.out.println("5.Salir");
            var=leer.nextInt();
            switch (var) {
            case 1:do {
            serv.agregarProducto();
                System.out.println(" desea continuar agregando?");
                String var2 =leer.next();
                if (var2.equalsIgnoreCase("si")){
                    val= true;
                } else {
        val = false;}
        } while (val);
        
                
                break;
            case 2: serv.mostrarProducto();
            break;
            case 3:
                serv.modificarPrecio();
                break;
            case 4:
                serv.eliminarProducto();
                break;
            default:
                System.out.println("Error a ingresar");
        
                    
            }
        
        }while (var !=5);
        
    }   
}        

