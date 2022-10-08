def taxes(payFreeTaxes, tax):
    total = payFreeTaxes + payFreeTaxes * (tax / 100)
    print('The total ammount with taxes is $', total, '.')

# Proporcionar el pago sin impuesto : 1000

# Proporcionar  el monto del impuesto: 21%

ammount =  int(input('Enter the ammount to pay: '))
tax = int(input('Enter the taxes ammount:  '))

totalWithTaxes = taxes(ammount, tax)