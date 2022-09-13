import math

tupla = (13, 1, 8, 3, 2, 5, 8)

myList = []

for x in tupla:

    if x < 5:
        myList.append(x)

print('Result = ', myList)

# Square Root

number = int(input("Enter a positive number: "))

while(number < 0):
    print("You must enter a positive number, try again: ")
    number = int(input())
print(f"\nResult = {math.sqrt(number):.2f}")
