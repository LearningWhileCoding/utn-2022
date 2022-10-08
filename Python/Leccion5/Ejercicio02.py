def mul(*args):
    result = 1
    for value in args:
        result *= value
    return result

print(mul(2, 2, 2, 2, 2, 2, 2))