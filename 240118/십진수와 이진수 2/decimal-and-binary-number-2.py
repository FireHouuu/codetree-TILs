digits = map(int, list(input()))
num = 0
for digit in digits:
    num = num * 2 + digit
num *= 17
output = []
while True:
    if num < 2:
        output.append(num)
        break
    output.append(num%2)
    num //= 2

for digit in output[::-1]:
    print(digit, end='')