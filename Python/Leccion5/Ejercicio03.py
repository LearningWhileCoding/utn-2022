def printNumbers(number):
    if number >= 1:
        print(number)
        printNumbers(number-1)
    elif number < 1:
        print('Incorrect number!')

number = int(input("Enter a number between 2 and 5: "))

printNumbers(number)