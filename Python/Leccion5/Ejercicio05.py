def celsiusConversion(degrees):

    farenheits = (degrees * 9/5) + 32

    return farenheits

def farenheitsConversion(degrees):

    celsius = (degrees - 32) * 5/9

    return celsius


degrees = int(input('Enter the celsius degrees to convert: '))
print(f'The degrees in farenheits is = {celsiusConversion(degrees)}.')

degrees = int(input('Enter the farenheits degrees to convert: '))
print(f'The degrees in celsius is = {farenheitsConversion(degrees)}.')
