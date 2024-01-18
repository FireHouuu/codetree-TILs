a, b, c, d = tuple(map(int, input().split()))

def calculator(a, b, c, d):
    return c * 60 + d - a * 60 - b

print(calculator(a, b, c, d))