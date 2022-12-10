from Orden import Orden
from Producto import Producto

producto1 = Producto('Agua', 100.00)
producto2 = Producto('Jugo', 200.00)
producto3 = Producto('Pan', 500)
producto4 = Producto('Galletas', 700)
producto5 = Producto('Sal', 1000)
producto6 = Producto('Aceite', 2000)
producto7 = Producto('Chocolate', 5000)
producto8 = Producto('Helado', 3000)

productos1 = [producto1, producto2]  # Lista de productos
orden1 = Orden(productos1)  # Primer objeto orden pasando la lista de productos
orden1.agregar_producto(producto5)
orden1.agregar_producto(producto3)
print(orden1)
print(f'Total de la orden1: {orden1.calcular_total()}')
productos2 = [producto2 ,producto3, producto4]
orden2 = Orden(productos2)
orden2.agregar_producto(producto1)
orden2.agregar_producto(producto7)
orden2.agregar_producto(producto8)
print(orden2)
print(f'Total de la orden2: {orden2.calcular_total()}')
