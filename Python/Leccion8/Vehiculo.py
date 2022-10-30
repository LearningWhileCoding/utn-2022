class Vehiculo:

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color: ' + self.color + ', Ruedas: ' + str(self.ruedas)


class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad

    def __str__(self):
        return super().__str__() + ', Velocidad(km/hr): ' + str(self.velocidad)


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo

    def __str__(self):
        return super().__str__() + ', Tipo: ' + self.tipo


# Primer objeto (Clase padre)
vehiculo = Vehiculo('Negro', 4)
print(vehiculo)

# Segundo objeto (Clase hija)
auto = Auto('Blanco', 4, 180)
print(auto)

# Tercer objeto, (Clase hija)
bici = Bicicleta('Verde', 2, 'Mountain')
print(bici)