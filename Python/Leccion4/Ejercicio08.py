# Menu - Cajero Automático

balance = 1000
exit = True

while(exit):

    print("----- MENU ----- \n\n1. Add money \t2. Withdrawn money \n3. Show balance \t4. Exit")
    opt =int(input("\nDigit an option: "))

    if opt == 4:
        exit = False
        break
    elif opt == 3:

        print("Your current balance is: $", balance)

    elif opt == 2:

        if balance >0:
            request = (int(input("Enter the ammount $: ")))
            if request <= balance:
                balance -= request

            else:
                while request > balance:
                    request = (int(input("Enter the ammount $: ")))
            print("Your current balance is: ", balance)
        else:
            print("Your balance is low.")
    elif opt == 1:

        balance += (int(input("Enter the ammount $: ")))
        print("Your current balance is: $", balance)
        dir()

    else:
        print("Wrong option, try again: ")