def sum(*args):
    result = 0
    for value in args:
        result += value
    return result

print(sum(10, 20, 30, 40, 50))