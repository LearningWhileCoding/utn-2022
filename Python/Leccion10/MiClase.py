class MiClase:
    # Variable de clase, este atributo mantiene el mismo valor para todas las clases(Static).
    variable_clase = 'Esta es una variable de tipo clase'

    def __init__(self, variable_instancia): # La variable de instancia, cambia sus valores a las demas clases.
        self.variable_instancia = variable_instancia

print(MiClase.variable_clase)
miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase('Esta es otra prueba de variable de instancia')
print(miClase2.variable_instancia)
print(miClase2.variable_clase)
