nota = int(input("Ingrese su nota: "))

if(nota > 8 and nota < 11):
    nota = "A"
elif(nota > 7 and nota < 9):
    nota = "B"
elif(nota > 6 and nota < 8):
    nota = "C"
elif(nota > 5 and nota < 7):
    nota = "D"
elif(nota > -1 and nota < 6):
    nota = "F"
else:
    nota = "Valor ingresado incorrecto."

print(f"Tu nota es: {nota}")