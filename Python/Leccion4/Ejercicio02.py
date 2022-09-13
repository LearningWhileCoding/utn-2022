myList = list(range(1,11))
print(myList)

for i in myList:
    print(i, end="-")

value = int(input("\n Digit a number: "))

for index, i in enumerate(myList):
    myList[index] *= value

print(f"Final list: ")

for i in myList:
    print(i, end="-")