menor = 10
promedio = 0
for i in range(10):
    calificacion = int(input("Ingrese una calificacion: "))
    promedio += calificacion

    if calificacion < menor:
        menor = calificacion

promedio = promedio /10

print("El promedio es : ", promedio, " y la calificacion mas baja es ", menor)

