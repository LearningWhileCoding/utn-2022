result = 1
number = int(input("Enter a positive number: "))
while number < 0:
    number = int(input("Enter a positive number: "))

for i in range(1,number+1):
    result *= i

print(result)
