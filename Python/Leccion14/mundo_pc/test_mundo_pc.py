from mundo_pc.computadora import Computadora
from mundo_pc.monitor import Monitor
from mundo_pc.orden import Orden
from mundo_pc.raton import Raton
from mundo_pc.teclado import Teclado

teclado1 = Teclado('Logitech', 'Bluetooth')
monitor1 = Monitor('Samsung', '32 Pulgadas')
raton1 = Raton('Logitech', 'USB')
computadora1 = Computadora('Lenovo', monitor1, teclado1, raton1)


teclado2 = Teclado('Genius', 'Bluetooth')
monitor2 = Monitor('Lg', '24 Pulgadas')
raton2 = Raton('Genius', 'Bluetooth')
computadora2 = Computadora('Dell', monitor2, teclado2, raton2)

teclado3 = Teclado('RedDragon', 'Bluetooth')
monitor3 = Monitor('Benq', '32 Pulgadas')
raton3 = Raton('RedDragon', 'Bluetooth')
computadora3 = Computadora('Alien', monitor3, teclado3, raton3)

computadora4= Computadora('Dell', monitor2, teclado3, raton3)
computadora5 = Computadora('Alien', monitor1, teclado1, raton3)

computadoras1 = [computadora1, computadora2]
orden1 = Orden(computadoras1)
orden1.agregar_computadora(computadora3)
print(orden1)

computadoras2 = [computadora3, computadora4, computadora5]
orden2 = Orden(computadoras2)
orden2.agregar_computadora(computadora1)
print(orden2)