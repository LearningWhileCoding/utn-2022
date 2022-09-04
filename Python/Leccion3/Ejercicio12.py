
empleados = 5
total = 0

for i in range(0, empleados):
    salario = 0
    horas = int(input("Ingrese la cantidad de horas trabajadas: "))
    tarifa = int(input("Ingrese la tarifa por hora: "))

    salario += (horas * tarifa)
    total += salario
    print("El salario es: ", salario)

print("El monto total de salarios es: ", total)
