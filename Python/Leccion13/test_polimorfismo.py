from Empleado import Empleado
from Gerente import Gerente


def imprimir_detalles(objeto): # Método para etender el polimorfismo
    # print(objeto)  # Inndirectamente llama al str de la clase Empleado o Gerente
    print(type(objeto))
    print(objeto.mostrar_detalles())
    if isinstance(objeto, Gerente):
        print(objeto.departamento)


empleado = Empleado('Homer', 120000)
imprimir_detalles(empleado)

gerente = Gerente('Burns', 10000000, 'President')
imprimir_detalles(gerente)