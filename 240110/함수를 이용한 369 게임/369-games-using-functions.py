def include(i):
    for s in str(i):
        if s == '3' or s == '6' or s == '9':
            return 1
    return 0

def f(i):
    if include(i) or i % 3 == 0:
        return 1
    return 0

a, b = tuple(map(int, input().split()))
out = 0
for i in range(a, b+1):
    if f(i):
        out += 1
print(out)