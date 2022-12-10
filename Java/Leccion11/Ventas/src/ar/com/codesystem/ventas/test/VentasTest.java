
package ar.com.codesystem.ventas.test;
 
import ar.com.codesystem.ventas.Orden;
import ar.com.codesystem.ventas.Producto;

public class VentasTest {
    
     public static void main(String[] args) {
         
        Producto producto1 = new Producto("Agua", 100.00);
        Producto producto2 = new Producto("Jugo", 200.00);
        Producto producto3 = new Producto("Azucar", 120.00);
        Producto producto4 = new Producto("Sal", 1000.00);
        Producto producto5 = new Producto("Aceite", 2000.00);
        Producto producto6 = new Producto("Pan", 500.00);
        Producto producto7 = new Producto("Galletas", 700.00);
        Producto producto8 = new Producto("Chocolate", 5000.00);
        Producto producto9 = new Producto("Helado", 3000.00);
        Producto producto10 = new Producto("Alfajor", 800.00);
        Producto producto11 = new Producto("Budin", 1000.00);
        Producto producto12 = new Producto("Turron", 200.00);
        
        Orden orden1 = new Orden();
        
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        orden2.agregarProducto(producto5);
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto7);
        orden2.agregarProducto(producto7);
        
        orden2.mostrarOrden();
        
        Orden orden3 = new Orden();
        
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto5);
        orden3.agregarProducto(producto12);
        orden3.agregarProducto(producto10);
        orden3.agregarProducto(producto8);
        orden3.agregarProducto(producto1);
        
        orden3.mostrarOrden();
        
        
           

    }
}
