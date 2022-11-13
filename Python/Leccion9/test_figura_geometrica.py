from Cuadrado import Cuadrado
from FiguraGeometrica import FiguraGeometrica
from Rectangulo import Rectangulo

print('Creación de objeto clase Cuadrado'.center(50, '_'))
cuadrado1 = Cuadrado(2, 'Negro')
cuadrado1.alto = 15
# cuadrado1.ancho = 7
# print(cuadrado1.ancho)
# print(cuadrado1.alto)
print(f'Cálculo del área: {cuadrado1.calcular_area()}')

# MRO = Method Resolution Order
# print(Cuadrado.mro())

print(cuadrado1)
print('Creación de objeto clase Rectangulo'.center(50, '_'))
rectangulo1 = Rectangulo(1, 3, 'azul')
rectangulo1.ancho = 15
print(f'Calculo del area: {rectangulo1.calcular_area()}')
print(rectangulo1)

# figura1 = FiguraGeometrica() No se puede instanciar porque es una clase abstracta
print(Cuadrado.mro())