class Rectangulo:

    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.base * self.altura

base = int(input('Ingrese la base del rectangulo: '))
altura = int(input('Ingrese la altura del rectangulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El area es: {rectangulo1.calcular_area()}')