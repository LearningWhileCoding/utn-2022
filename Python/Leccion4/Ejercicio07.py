# Juego adivinar numero
import random
x = round( random.randint(0,100) )
attempts = 0
while True:
    attempts+=1
    number = int(input("Enter a number between 0 and 100: "))

    if number > x:
        print("Is greater . . .")
    elif number < x:
        print("Is lower . . .")
    else:
        print(f"You did it in {attempts} attempts!")
        break
