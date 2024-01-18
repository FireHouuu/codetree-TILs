a, b = tuple(map(int, input().split()))
n = map(int, list(input()))
num = 0
for i in n:
    num = num * a + i

output = []
while True:
    if num < b:
        output.append(num)
        break
    output.append(num % b)
    num //= b

for digit in output[::-1]:
    print(digit, end='')