# COLECCIONES EN PYTHON
# LISTAS Y RANGOS

list = ["cat", "dog", "bird", "lion", "tiger", "bunny"]
print(list)
print(list[0])
print(list[1])
print(list[5])
print(list[-1])
print(list[-2])
print(list[0:2])
print(list[ :3])
print(list[1: ])

# Modificar un valor

list[3] = 'panther'
print(list)

# Iterar

for varList in list:
    print(varList)
else:
    print("Se acabaron los elementos de la lista")

# Longitud

print(len(list))

# Agregar un elemento

list.append("duck")
list.append([1,2,3])
list.append(True)
list.append(10.45)
print(list)

# Insercion en indice especifico

list.insert(2,"shark")
print(list)
list.insert(5,"bear")
print(list)

# Eliminar un elemento

list.remove("bunny")
print(list)

# Eliminar ultimo elemento

list.pop()
print(list)

# Eliminar indice especifico

del list[2]
print(list)

# Vaciado de lista

list.clear()
print(list)

# Eliminar lista
del list
print(list)


# Definimos una Tupla

cocina = ('cuchara', 'cuchillo', 'tenedor')
print(cocina)

# Acceder a un elemento, para esto se usa corchetes no parentesis
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras =('papa',) # Una tupla necesita una coma si o si
# de lo contrario solo seria un tipo String
print(verduras)

# Recorremos los elementos de la tupla

for cocinar in cocina: # Print esta usando \n para saltos de linea
    print(cocinar, end=' ')  # Usamos end para eliminar los saltos de linea

# Conversion de tuple a list (Mala Practica)
cocinaLista = list (cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# Eliminar tupla
# del cocina
# print(cocina)

# Tipo Set (Sin orden Ni Indices)

planetas = {'Marte', 'Jupiter', 'Venus'}
print(planetas)

# Revisar si el elemento existe
print('Marte' in planetas)

# Agregar un elemento al set
planetas.add('Tierra')
print(planetas)

# Eliminar un elemento
planetas.remove('Jupiter')
print(planetas)
planetas.discard('tierra')
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)
# Eliminar set o conjunto
# del planetas
# print(planetas)


# <---DICCIONARIO --->
# UNA LLAVE Y UN VALOR
# dict(key, value)

dictionary = {

    'IDE':'Integrated Development Enviroment',
    'OOP':'Object Oriented Programming',
    'RDBMS': 'Relational Database Management System'
}
print(dictionary)

# Acceder a un elemento con la llave(key)
print(dictionary['IDE'])

# Otra forma
print(dictionary.get('OOP'))
print(dictionary.get('RDBMS'))

# Editar un elemento
dictionary['IDE'] = 'Entorno de desarrollo integrado'
print(dictionary)

# Recorrer los elementos
for word in dictionary: # Recorremos y mostramos solo las llaves
    print(word)
# Utilizamos una fn para recorrer un diccionario
for word, valor in dictionary.items():
    print(word, valor)

# Otras maneras de acceder a un diccionario
for word in dictionary.keys():
    print(word) # Muestra solo las llaves

for valor in dictionary.values(): # Usamos una fn para acceder a los valores
    print(valor)

# Comprobar la existencia de un elemento
print('IDE' in dictionary) # Boolean Output

# Agregar un elemento
dictionary['PK'] = 'Primary Key'
print(dictionary)

# Eliminar un elemento
dictionary.pop('RDBMS')
print(dictionary)

# Vaciado del diccionario
dictionary.clear()
print(dictionary)

# Eliminar diccionario
del dictionary

# Concatenar listas

list1 = [1, 2, 3, 1]
list2 = [4, 5, 6, 1]
list3 = list1 + list2 # Concatenacion
print(list3)

list3.extend([7, 8, 9, 1]) # Agregar varios elementos
print(list3)

print(list3.index(5)) # Ubicar el indice de ubicacion
# print(list3.index(0)) --> Error por no ser el elemento parte de la lista

# Identificar repeticion
print(list3.count(1))

# Dar vuelta una lista
list3.reverse()
print(list3)

# Multiplicar elementos(clonado) elementos
list = [1, 2, 3] * 2
print(list)
print(list3 * 2)

# METODOS DE ORDENAMIENTO
list3.sort() # Ascendente
print(list3)
list3.sort(reverse=True) # Descendente
print(list3)

# Tuplas
tupla = (4, 'Hi', 7.89, [1, 2, 40], 4, 'Hello') # Permite distintos tipos de datos
print(tupla)
print(8 not in tupla)

# Sets
# Declaraciones
set1 = set()
set2 = {'Hi', }
set1.add(7)
set1.add('Hello')
print(set1)
set1.add(':D')
# set2.add(9) NO permitido debido a las llaves vacias en la declaracion, debe contener al menos 1 elemento.
print(3 not in set1)
# Comparación
print(set1 == set2)

# Operaciones en sets
set3 = set1 | set2 # La linea une los conjuntos
print(set3)

set3 = set1 & set2 # Elemento en comun
print(set3)

set3 = set1 - set2 # Asigna el valor solo del set1
print(set3)

set3 = set1 ^set2 # Elementos diferentes entre ambos
print(set3)

# Comprobacion
set3 = set1 | set2
print(set1.issubset(set3))
print(set2.issubset(set3))
print(set3.issubset(set1))
print(set3.issubset(set2))
print(set3.issuperset(set1))
print(set3.issuperset(set2))

# Comprobar si son disconexos
print(set1.isdisjoint(set2)) # 0 elementos en comun

# Convertir un set en totalmente inmutable
set1 = frozenset

# Diccionarios

newDictionary = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo':'Yellow'}
del(newDictionary['Azul'])
print(newDictionary)

# Los diccionarios pueden almacenar distintos tipos de datos
dictionary2 = {'Augusto':{'Age': 27, 'Height': 1.80}, 'unknowUser': [30, 1.75]}
print(dictionary2)

seleccionArgentina = {

    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo Derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo Derecho'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolàs Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
     1: {'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Portero'},
    25: {'Nombre': 'Marcos Senesi', 'Edad': 25, 'Altura': 1.85, 'Precio': '17 Millones', 'Posicion': 'Defensa Central'},
     8: {'Nombre': 'Marcos Acuña', 'Edad': 30, 'Altura': 1.72, 'Precio': '18 Millones', 'Posicion': 'Lateral Izquierdo'},
    23: {'Nombre': 'Emiliano Martinez', 'Edad': 30, 'Altura': 1.95, 'Precio': '28 Millones', 'Posicion': 'Portero'},
     6: {'Nombre': 'Germán Pezzella', 'Edad': 31, 'Altura': 1.87, 'Precio': '5 Millones', 'Posicion': 'Defensa Central'}
}

for llave, valor in seleccionArgentina.items():
    print(valor)

# Metodo Pilas para listas
pila = [1, 2, 3]

pila.append(4)
pila.append(5)
print(pila)

borrado = pila.pop()
print('Sacamos el elemento: ', borrado)
print('La pila actual es: ', pila)

# Listas con Colas
# Estructura de datos tipo fifo (First Input / First Output)

cola = ['Ariel', 'Osvaldo', 'Liliana', 'Pilar']

cola.append('Natalia')
cola.append('Jose')
print(cola)

# Quitar elementos
seRetira = cola.pop(0)
print('Atendido el cliente: ', seRetira)
print(cola)

seRetira = cola.pop(0)
print('Atendido el cliente: ', seRetira)
print(cola)
seRetira = cola.pop(0)
print('Atendido el cliente: ', seRetira)
print(cola)
seRetira = cola.pop(0)
print('Atendido el cliente: ', seRetira)
print(cola)

for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina[i]}')









