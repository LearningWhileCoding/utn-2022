estacion = None

mes = int(input("Ingrese un mes del 1 al 12: "))

if(mes >= 1 and mes <= 3):
    estacion = "verano"
elif(mes >= 4 and mes <= 6):
    estacion = "otoño"
elif(mes >= 7 and mes <= 9):
    estacion = "invierno"
elif(mes <= 12):
    estacion = "primavera"
else:
    print("Opcion incorrecta.")

print(f"El mes {mes} corresponde a la estación {estacion}")