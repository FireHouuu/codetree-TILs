N, B = tuple(map(int, input().split()))
output = []
while True:
    if N < B:
        output.append(N)
        break
    output.append(N%B)
    N //= B

for digit in output[::-1]:
    print(digit, end='')