a, b = tuple(map(int, input().split()))

def onjeon(i):
    if i % 2 == 0:
        return False
    elif i % 5 == 0 and i % 10 != 0:
        return False
    elif i % 3 == 0 and i % 9 != 0:
        return False
    else:
        return True

out = 0
for i in range(a, b+1):
    if onjeon(i):
        out += 1
print(out)