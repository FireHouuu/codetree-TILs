a, b = tuple(map(int, input().split()))

def f(i):
    for j in range(2, i):
        if i % j == 0:
            return 0
    return 1

out = 0
for i in range(a, b+1):
    if f(i):
        out += i
print(out)