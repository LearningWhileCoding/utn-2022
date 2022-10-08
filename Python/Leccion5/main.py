# Funciones

def myFunction():
    print("Hello World!")

myFunction() # Llamado (Sólo se puede relizar luego de definir, debido al flujo)

# Desempaquetado de listas UNPACKING!
def show(name, lastname):
    print(name +  " " + lastname)


people = ["Daenerys", "Targaryen"]
show(people[0], people[1])
show(*people) # Para imprimir toda la LISTA!

people2 = ("Aria", "Stark")
show(people2[0], people2[1])
show(*people2) # Para imprimir toda la TUPLA!

people3 = {"name": "Jon", "lastname": "Snow"}
show(**people3) # Para imprimir toda el DICCIONARIO
# 1 * PARA LA CLAVE Y 1 * PARA EL VALOR!

numbers = [1, 2, 3, 4, 5] # Con la lista vacia también se ejecuta el else
for n in numbers:
    print(n)
    if n == 3:
        break # Unica manera para que no se ejecute el else
else:
    print('Finished')


# List comprehension, lista de comprensión
names = ["Aria", "Daenerys", "Catelyn", "Cersei"]
alongP = [p for p in names if p[0] == 'C'] # Esto regresa una nueva lista
print(alongP)

chars = [{"name": "Cately", "house": "Stark"},
           {"name": "Sansa", "house": "Stark"},
           {"name": "Daenerys", "house": "Targaryen"},
           ]
stark = [b for b in chars if b["house"] == "Stark"]
print(stark)
print(chars)

# Paso de Argumentos (funciones)
def myFunction2(name, house):
    print("Hello everybody!")
    print(f'Name: {name}, House: {house}')
myFunction2('Jon', 'Snow')
myFunction2('Aria', 'Stark')
myFunction2('Robb', 'Stark')
myFunction2('Catelyn', 'Stark')

# Return
def sum(a, b):
    return a + b
print(f'Result = {sum(55, 45)}')

def sum2(a = 0, b = 0): # valor por default
    return a + b
result = sum2()
print(f'Result =  {result}')
print(f'Result =  {sum2(22, 66)}')

# Argumentos, variables  en funciones
def listNames(*names): # Normalmente se utiliza: *args
    for name in names: # Se va a convertir en una tupla
        print(name)
listNames('Rob', 'Aria', 'Cersei', 'Ned')
listNames('Tyrion', 'Jamie', 'Robert', 'Jorah')

def listTerms(**terms): # Lo mas utilizado es **kwargs
    for key, value in terms.items(): # kwargs significa: key word argument
        print(f'{key} : {value}')

listTerms() # No recibe nada, nada cambia.
listTerms(IDE='Integrated Development Enviroment', PK='Primary Key')
listTerms(Name='Julia Roberts')

def displayNames(names):
    for name in names:
        print(name)
names2 = ['Ragnar', 'Loki', 'Rollo']

displayNames(names2)

displayNames('Ladgerda')

# showNames(10, 11) # Objeto NO iterable
displayNames((10, 11)) # Conversion a tupla, en un solo elemento lleva coma al final!
displayNames([22, 55]) # Conversion a lista


# Funciones Recursivas
def fact(number):
    if number == 1: # Caso Base
        return 1
    else:
        return number * fact(number - 1) # Caso Recursivo
factorialNumber = int(input('Enter a number: '))
factorialResult = fact(factorialNumber) 
print(f'The factorial of number {factorialNumber} is: {factorialResult}')