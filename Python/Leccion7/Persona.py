class Persona:  # Hereda de la clase Object
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __str__(self):  # Overriding
        return f'Persona:  [ Nombre: {self._nombre}, Edad: {self._edad} ]'


class Empleado(Persona):  # Clase hija
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo

    @property
    def sueldo(self):
        return self._sueldo

    @sueldo.setter
    def sueldo(self, sueldo):
        self._sueldo = sueldo

    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}'

emplado1 = Empleado('Bart', 20, 7500)
print(emplado1.nombre)
print(emplado1.edad)
print(emplado1.sueldo)

empleado2 = Empleado('Lisa', 18, 5000)
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)
empleado2.nombre = 'Maggie'
empleado2.edad = 3
empleado2.sueldo = 750
print(empleado2.nombre)
print(empleado2.edad)
print(empleado2.sueldo)