sumaPar = 0
contPar = 0
sumaImpar = 0
contImpar = 0
x = int(input("Ingrese la cantidad de elementos: "))

while x > 0:
    x-=1
    num = int(input("Ingrese un numero: "))
    if (num % 2 == 0):
        sumaPar += num
        contPar += 1
    else:
        sumaImpar += num
        contImpar += 1

print("La sumatoria de numeros pares es: ", sumaPar, " y la cantidad de numeros pares es: ", contPar)
print("El promedio de numeros impares es: ", (sumaImpar / contImpar))


