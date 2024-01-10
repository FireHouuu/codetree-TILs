a, b = tuple(map(int, input().split()))

def so(i):
    if i == 1:
        return False
    for j in range(2, int(i ** 0.5) + 1):
        if i % j == 0:
            return False
    return True

def jjack(i):
    check = 0
    while i > 10:
        check += i % 10
        i //= 10
    check += i
    if check % 2 == 0 and check != 0:
        return True
    return False

num = 0
for i in range(a, b+1):
    if jjack(i):
        if so(i):
            num += 1
print(num)