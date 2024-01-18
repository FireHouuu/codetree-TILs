n, k = tuple(map(int, input().split()))
block = [0] * (n+1)

def do(a, b):
    for i in range(a, b+1):
        block[i] += 1

for _ in range(k):
    a, b = tuple(map(int, input().split()))
    do(a, b)

print(max(block))