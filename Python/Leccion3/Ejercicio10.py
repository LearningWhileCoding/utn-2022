factorial = 0
incognita = -1

while incognita < 0:
    incognita = int(input("Ingrese el numero para calcular el factorial: "))

for i in range(1,incognita+1):
    factorial *= i

print("El resultado es = ", factorial)