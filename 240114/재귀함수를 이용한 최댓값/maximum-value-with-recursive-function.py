n = int(input())
_list = list(map(int, input().split()))

def f(n):
    if n == 1:
        return max(_list[0], _list[1])
    return max(f(n-1), _list[n])

if n == 1:
    print(_list[0])
else:
    print(f(n-1))