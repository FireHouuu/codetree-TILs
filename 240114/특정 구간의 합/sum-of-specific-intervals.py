n, m = tuple(map(int, input().split()))
_list = list(map(int, input().split()))

def f(a, b):
    sum = 0
    for i in range(a, b+1):
        sum += _list[i-1]
    print(sum)

for _ in range(m):
    a, b = tuple(map(int, input().split()))
    f(a, b)