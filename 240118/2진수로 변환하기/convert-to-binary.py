n = int(input())
output = []
while True:
    if n < 2:
        output.append(n)
        break
    output.append(n%2)
    n //= 2

for digit in output[::-1]:
    print(digit, end="")