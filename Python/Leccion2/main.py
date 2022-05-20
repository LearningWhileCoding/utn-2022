# OPERADOR LOGICO IF
'''
condicion = 1

if condicion == True:
    print("Condicion verdadera")
elif condicion == False:
    print("Condicion falsa")
else:
    print("Condicion indefinida")
'''
'''
# Conversión de número a String
num = int(input("Digite un número entre 1 y 3: "))
numTexto= ''
if num == 1:
    numTexto = 'Numero Uno'
elif num == 2:
    numTexto = 'Numero Dos'
elif num == 3:
    numTexto = 'Numero Tres'
else:
    print("Has ingresado un valor incorrecto.")
    
print(f'El número ingresado es: {num} {numTexto}')
'''
# OPERADOR TERNARIO IF-ELSE

condicion = True

#if condicion == True:
#    print("Condicion Verdadera")
#else:
#    print("Condicion Falsa")
print("Condicion Verdadera") if condicion else print("Condicion Falsa")
