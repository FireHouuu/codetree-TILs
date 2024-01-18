n, k = tuple(map(int, input().split()))
block = [0] * n

def do(a, b):
    for i in range(a, b+1):
        block[i] += 1

for j in range(k):
    a, b = tuple(map(int, input().split()))
    do(a, b)

print(max(block))