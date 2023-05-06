
package Tienda_Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TiendaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashMap<String, Double> producto = new HashMap<String, Double>();
    public void agregarProducto(){
        System.out.println("Ingrese producto");
        String nombre= leer.next();
        System.out.println("Ingrese precio");
        Double precio = leer.nextDouble();
        producto.put(nombre, precio);
    }
    
    public void mostrarProducto(){
        for (Map.Entry<String, Double> entry : producto.entrySet()) { //nota: con poner for seguido de las teclas Ctrl + espacio se puede autocompletar
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ": $ " + value);
        }
    }
    
    public void eliminarProducto(){
        System.out.print(" Ingrese producto a elminar:");
        String product= leer.next();
        producto.remove(product);
    }
    
    public void modificarPrecio(){
        System.out.print("Ingrese el nombre del producto: ");
            String productoModificar = leer.next();
            System.out.print("Ingrese el nuevo precio del producto: ");
            Double precioModificar = leer.nextDouble();
            producto.put(productoModificar, precioModificar);
    }
    
}
