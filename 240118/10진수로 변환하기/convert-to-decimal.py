digits = map(int, list("11101"))
num = 0
for digit in digits:
    num = num * 2 + digit

print(num)