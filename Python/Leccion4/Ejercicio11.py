myContacts = {}
while True:
    print("#--------------------MENÚ--------------------#")
    option = int(input("1. New contact. \t\t\t\t2.Delete contact.\n3.See contacts.\t\t\t\t4.Exit\nEnter an option: "))

    if option == 1:
        name = input("Name: ")
        number = input("Number: ")
        if name not in myContacts:
            myContacts[name] = number
            print("Saved!")
        else:
            print("Already exists!")
    elif option == 2:
        name = input("Name: ")
        if name in myContacts:
            del (myContacts[name])
            print("Deleted!")
        else:
            print("It doesn't exists!")
    elif option == 3:
        print("My contacts")
        for clave, valor in myContacts.items():
            print(f"Name: {clave}, Number: {valor}")
    elif option == 4:
        print("Bye bye!")
        break
    else:
        print("Wrong option!")
    print()