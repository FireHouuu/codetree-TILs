digits = map(int, list(input()))
num = 0
for digit in digits:
    num = num * 2 + digit

print(num)