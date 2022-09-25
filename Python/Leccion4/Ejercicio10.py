chain = input("Write a quote: ")
list = []

for i in chain:
    if i not in list:
        list.append(i)
print("Resulto = ", list)