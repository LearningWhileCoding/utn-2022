edad = int(input("Ingrese su edad: "))

if(edad < 30 and edad > 19):
    etapa = "Amor y comienza el trabajo."
elif(edad < 20 and edad > 9):
    etapa = "Tienes muchos cambios, mucho que estudiar."
elif(edad > -1 and edad < 11):
    etapa = "La infancia es increible y bella."
else:
    etapa = "Disfrutar la vida."

print(f"La etapa correspondiente a los {edad} años es {etapa}")
