pos = 0
neg = 0
neu = 0


for i in range(10):
    num = int(input("Ingrese numeros enteros: "))
    if num < 0:
        neg += 1
    elif num == 0:
        neu += 1
    else:
        pos += 1

print("Neutros: ", neu)
print("Positivos: ", pos)
print("Negativos: ", neg)