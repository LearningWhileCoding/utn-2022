myList = []

number = int(input("Digit a number: "))
while(number != 0):

    myList.append(number)

    number = int(input("Digit a number: "))

myList.sort()
print(myList)